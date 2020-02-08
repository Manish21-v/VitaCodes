import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ILogin } from './ilogin';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  url = "http://localhost:8080/Projectetour/";
  constructor(private http: HttpClient) { }

  logincheck(logobj: ILogin): Observable<any>{
    return this.http.post<ILogin>(this.url+'login/check', logobj);
  }
}
