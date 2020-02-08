import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ipackagecompletedetail } from './ipackagecompletedetail';

@Injectable({
  providedIn: 'root'
})
export class PackagecompletedetailService {
  url="http://localhost:8080/Projectetour/";

  constructor(private http: HttpClient) { }

  getPackageCompleteDetail(): Observable<Ipackagecompletedetail[]>
  {
    return this.http.get<Ipackagecompletedetail[]>(this.url+"package/search")
  }

  getPackageCompleteDetailbyID(packageid:number):Observable<Ipackagecompletedetail>
  {
    return this.http.get<Ipackagecompletedetail>(this.url+"package/search/"+packageid)
  }
}
