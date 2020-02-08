import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
  url="http://localhost:8080/Projectetour/";
  constructor(private http: HttpClient) { }

  addBooking(book){
    return this.http.post(this.url+"booking/add",book );
  }
}
