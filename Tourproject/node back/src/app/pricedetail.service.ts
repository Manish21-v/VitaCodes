import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ipricedetail } from './ipricedetail';

@Injectable({
  providedIn: 'root'
})
export class PricedetailService {

  url = "http://localhost:8080/Projectetour/";

  constructor(private http: HttpClient) { }

  getAllPricedetail(): Observable<Ipricedetail[]> {
    return this.http.get<Ipricedetail[]>(this.url + "pricedetail/search");
  }

  getPriceDetail(id: number): Observable<Ipricedetail> {
    return this.http.get<Ipricedetail>(this.url + "pricedetail/search/" + id);
  }
}
