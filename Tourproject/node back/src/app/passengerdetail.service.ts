import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Passengerdetail} from './passengerdetail';
import { Ipassengerdetail } from './ipassengerdetail';
import { compileInjectable } from '@angular/core/src/render3/jit/injectable';

@Injectable({
  providedIn: 'root'
})
export class PassengerdetailService {

  url="http://localhost:8080/Projectetour/";

  constructor(private http: HttpClient) { }

    getpassengerbyid(id:number): Observable<Ipassengerdetail>{
    return this.http.get<Ipassengerdetail>(this.url+"passenger/search/"+id)
    }

    getpassengers(): Observable<Ipassengerdetail[]>{
      return this.http.get<Ipassengerdetail[]>(this.url+"passenger/search");
      }

      postpassenger(pobj):Observable<any>{
        return this.http.post<any>(this.url+"passenger/add",pobj);
      }
}
