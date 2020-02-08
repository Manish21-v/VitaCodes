import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { LoginService } from '../login.service';
import { ILogin } from '../ilogin';
import { Router } from '@angular/router';
import { Login } from '../login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  ngOnInit(): void {
  }
  logobj: ILogin;
  logform: FormGroup;
  constructor(private login: LoginService, public build: FormBuilder, private route: Router) { this.buildEmpForm();}

  buildEmpForm() {

    this.logform = this.build.group({
      email: ['', [Validators.required]],
      password: ['', Validators.required],

    });
  }

  get email() {
    return this.logform.get('email'); // notice this
  }
  get password() {
    return this.logform.get('password'); // notice this
  }
  loginform(logform: FormGroup) {
    this.mapValue(logform);
    this.postdata(this.logobj);

  }

  mapValue(logform: FormGroup) {
    this.logobj = new Login('', '');
    this.logobj.email = logform.controls.email.value;
    this.logobj.password = logform.controls.password.value;
  }
  id: string = '1';
  postdata(logobj) {
    this.login.logincheck(logobj).subscribe((data) => {
      console.log(data);
      if (data){
        sessionStorage.setItem("customerid",this.id);        
        this.route.navigate([""]);
      }
      else
        this.route.navigate(["login"]);
    }
    )
  };

}
