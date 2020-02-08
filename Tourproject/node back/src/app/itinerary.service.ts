import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Iitinerary } from './iitinerary';

@Injectable({
  providedIn: 'root'
})
export class ItineraryService {

  url="http://localhost:8080/Projectetour/";

  constructor(private http: HttpClient) { }
  getItinerary(): Observable<Iitinerary[]>{
    return this.http.get<Iitinerary[]>(this.url+"itinerary/search")
  }
  getItinerarybyid(id :number): Observable<Iitinerary[]>{
    return this.http.get<Iitinerary[]>(this.url+"itinerary/search/");
  }

}

