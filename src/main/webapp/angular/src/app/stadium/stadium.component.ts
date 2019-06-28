import { Component, OnInit } from '@angular/core';
import {ApiService} from '../api.service';
import {StadiumRequest} from '../model/StadiumRequest';
import {StadiumFilters} from '../model/StadiumFilters';
import {Router} from "@angular/router";

@Component({
  selector: 'app-stadium',
  templateUrl: './stadium.component.html',
  styleUrls: ['./stadium.component.css']
})
export class StadiumComponent implements OnInit {

  stadiumRequest: StadiumRequest = new StadiumRequest();
  stadiums: any;
  filters: StadiumFilters;

  constructor(private api: ApiService, private router: Router) { }

  ngOnInit() {
    this.loadStadiums();
    this.api.stadiumFiltersRefresh(this.stadiumRequest).subscribe(e => {
      this.filters = e;
    });
  }

  refreshStadiums(key, id) {
    this.stadiumRequest[key] = id;
    this.loadStadiums();
  }

  loadStadiums(){
    this.api.stadiums(this.stadiumRequest).subscribe(e => {
      this.stadiums = e;
    });
  }

  stadiumDetails(id) {
    this.router.navigate(['stadium', id, 'details']);
  }
}
