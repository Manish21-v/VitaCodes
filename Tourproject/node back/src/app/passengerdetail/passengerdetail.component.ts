import { Component, OnInit } from '@angular/core';
import { Ipassengerdetail } from '../ipassengerdetail';
import { PassengerdetailService } from '../passengerdetail.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Passengerdetail } from '../passengerdetail';
import { FormControl,FormArray} from '@angular/forms';
import { from } from 'rxjs';

@Component({
  selector: 'app-passengerdetail',
  templateUrl: './passengerdetail.component.html',
  styleUrls: ['./passengerdetail.component.css']
})
export class PassengerdetailComponent implements OnInit {

    passengersdetail:Ipassengerdetail[];
    passengerdetail:Ipassengerdetail;

  constructor(private _passengerdetailservice:PassengerdetailService) 
    { }

    ngOnInit() {
      this._passengerdetailservice.getpassengerbyid(1).subscribe(  data=>this.passengerdetail=data );
      this._passengerdetailservice.getpassengers().subscribe( data=>this.passengersdetail=data );
    }

}