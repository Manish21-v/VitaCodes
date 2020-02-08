import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerdetailsService {
url:"http://localhost:8080/Projectetour/";
  constructor(private http: HttpClient) { }
  getUsers() {
    return this.http.get(this.url+'customer/search');
  }
}
