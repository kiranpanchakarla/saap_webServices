import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {LoginResultModel} from './model/LoginResultModel'
import {StadiumRequest} from './model/StadiumRequest'
import {StadiumFilters} from './model/StadiumFilters'
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private static STADIUM_URL = environment.STADIUM_URL;

  constructor(private http: HttpClient) {

  }

  login(email: string, password: string): Observable<LoginResultModel>{
    return this.http.post<LoginResultModel>('https://reqres.in/api/login', {
      email: email,
      password: password
    });
  }

  stadiums(stadiumRequest: StadiumRequest){
    return this.http.post<any>(`${ApiService.STADIUM_URL}/stadium/search`, stadiumRequest);
  }

  eventSlots(stadiumRequest: StadiumRequest){
    return this.http.post<any>(`${ApiService.STADIUM_URL}/event/searchSlots`, stadiumRequest);
  }

  stadiumById(id: number){
    return this.http.get<any>(`${ApiService.STADIUM_URL}/stadium/${id}`);
  }

  stadiumFiltersRefresh(stadiumRequest: StadiumRequest){
    return this.http.post<StadiumFilters>(`${ApiService.STADIUM_URL}/stadium/filters/refresh`, stadiumRequest);
  }
}
