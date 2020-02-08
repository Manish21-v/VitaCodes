import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Icategorysubcategory } from './icategorysubcategory';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CategorySubcategoryService {

  constructor(private http: HttpClient) { }

  url="http://localhost:8080/Projectetour/category/";

  getCategorySubcategory(): Observable<Icategorysubcategory[]>{
    return this.http.get<Icategorysubcategory[]>(this.url+"search")
  }
}
