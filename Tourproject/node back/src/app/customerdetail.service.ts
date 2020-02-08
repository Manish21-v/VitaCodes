import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Customerdetail} from './Customerdetail';
import { Icustomerdetail } from './icustomerdetail';
import { compileInjectable } from '@angular/core/src/render3/jit/injectable';

@Injectable({
  providedIn: 'root'
})
export class CustomerdetailService {

  url="http://localhost:8080/Projectetour/";

  constructor(private http: HttpClient) { }

    postcustomer(cobj):Observable<any>{
      return this.http.post<any>(this.url+"add",cobj);
    }

    getCustomers(): Observable<Icustomerdetail[]>{
      return this.http.get<Icustomerdetail[]>(this.url+"customer/search")
    }

    updatecustomer(cobj):Observable<any>{
      return this.http.put<number>(this.url+"update/"+111,cobj)
    }

    getcustomerbyid(id:number): Observable<Icustomerdetail>{
      return this.http.get<Icustomerdetail>(this.url+"customer/search/+"+id)
      }


}
