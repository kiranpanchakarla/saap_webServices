import { Component, OnInit } from '@angular/core';
import {ApiService} from '../api.service';
import {StadiumRequest} from '../model/StadiumRequest';
import {StadiumFilters} from '../model/StadiumFilters';
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-stadium-details',
  templateUrl: './stadium.details.component.html',
  styleUrls: ['./stadium.details.component.css']
})
export class StadiumDetailsComponent implements OnInit {

  stadiumRequest: StadiumRequest = new StadiumRequest();
  stadiumId: number;
  stadium: any;
  filters: StadiumFilters;
  eventSlots: any;
  sportNames: string;

  constructor(private api: ApiService, private route: ActivatedRoute, private router: Router) {
    this.route.params.subscribe( params => {
      this.stadiumId = +params.id;
      this.stadiumRequest.stadiumId = this.stadiumId;
    });
  }

  ngOnInit() {
    this.api.stadiumById(this.stadiumId).subscribe(e => {
      this.stadium = e;
    });
    this.api.stadiumFiltersRefresh(this.stadiumRequest).subscribe(e => {
      this.filters = e;
      this.sportNames = e.sports.map(sport => sport.name).join(", ");
    });
    this.loadEventSlots();
  }

  loadEventSlots(){
    this.api.eventSlots(this.stadiumRequest).subscribe(e => {
      this.eventSlots = e;
    });
  }

  refreshEvents(key, id) {
    this.stadiumRequest[key] = id;
    this.loadEventSlots();
  }
}
