import { Component, OnInit } from '@angular/core';
import { Ipassengerdetail } from '../ipassengerdetail';
import { PassengerdetailService } from '../passengerdetail.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Passengerdetail } from '../passengerdetail';
import { FormControl, FormArray } from '@angular/forms';
import { from } from 'rxjs';
import { PricedetailService } from '../pricedetail.service';
import { Ipricedetail } from '../ipricedetail';
import { Pricedetail } from '../pricedetail';

@Component({
  selector: 'app-addpassengers',
  templateUrl: './addpassengers.component.html',
  styleUrls: ['./addpassengers.component.css']
})
export class AddpassengersComponent implements OnInit {

  passengerdetail: Ipassengerdetail[];
  pricedetail: Ipricedetail;
  pForm: FormGroup;
  pobj: Ipassengerdetail;
  submitted = false;
  //bookingdetail: 
  packageid: number = parseInt(localStorage.getItem("lspackageid"));

  ngOnInit() {
    this.buildpForm();
    this._pricedetail.getPriceDetail(this.packageid).subscribe(data => this.pricedetail = data);
  }

  constructor(private _pricedetail: PricedetailService, private _passengerdetailservice: PassengerdetailService, public fb: FormBuilder, private dataserv: PassengerdetailService, private router: Router) { this.buildpForm(); }

  buildpForm() {
    this.pForm = this.fb.group({
      pname: ['', [Validators.required]],
      pdob: ['', [Validators.required]],
      proom: ['', [Validators.required]],
      pidentity: ['', [Validators.required]],
      pdoc_id: ['', [Validators.required]],
      psex: ['', [Validators.required]],
      pemail: ['', [Validators.required]],
      pdis: ['', [Validators.required]]
    });
  }

  get pname() {
    return this.pForm.get('pname');
  }

  get pdob() {
    return this.pForm.get('pdob');
  }

  get proom() {
    return this.pForm.get('proom');
  }

  get pidentity() {
    return this.pForm.get('pidentity');
  }

  get psex() {
    return this.pForm.get('psex');
  }

  get pemail() {
    return this.pForm.get('pemail');
  }

  get pdoc_id() {
    return this.pForm.get('pdoc_id');
  }

  get pdis() {
    return this.pForm.get('pdis');
  }

  onSubmit(pForm: FormGroup) {
    this.submitted = true;
    //console.log(this.pobj);
    //if (!pForm.valid) {
    //  alert("Added passenger !!");
    //  return;
    //}

    console.log(pForm.controls.proom.value);
    this.mapFormValues(pForm);
    this.postdata(this.pobj);
  }

  bedtype: string;

  mapFormValues(form: FormGroup) {
    this.pobj = new Passengerdetail(null, '', null, '', null, '', null, '', '', '', null);
    this.pobj.passengername = form.controls.pname.value;
    this.pobj.passengeremail = form.controls.pemail.value;
    this.pobj.passengersex = form.controls.psex.value;
    this.pobj.passengeridno = form.controls.pdoc_id.value;
    this.pobj.passengerdetailcol = form.controls.pdis.value;
    this.pobj.roomtype = form.controls.proom.value;
    this.pobj.passengerdob = form.controls.pdob.value;
    this.pobj.passengeriddocument = form.controls.pidentity.value;

    this.bedtype = form.controls.proom.value;
    this.checkprice(this.bedtype);
  }

  checkprice(bedtype: string) {
    console.log(bedtype);
    let localtemp = sessionStorage.getItem("lspricetotal");
    if (localtemp == null) {
      if (bedtype == "twinsharing")
        sessionStorage.setItem("lspricetotal", (this.pricedetail.tourcost).toString());
      else if (bedtype == "singleperson")
        sessionStorage.setItem("lspricetotal", (this.pricedetail.singleperson).toString());
      else if (bedtype == "childwithbed")
        sessionStorage.setItem("lspricetotal", (this.pricedetail.childwithbed).toString());
      else if (bedtype == "childwobed")
        sessionStorage.setItem("lspricetotal", (this.pricedetail.childwobed).toString());
      else
        sessionStorage.setItem("lspricetotal", (this.pricedetail.adults).toString());
    }
    else {
      if (bedtype == "twinsharing"){
        this.pricedetail.tourcost += parseInt(localtemp);
        sessionStorage.setItem("lspricetotal",(this.pricedetail.tourcost).toString());
      }
      else if (bedtype == "singleperson"){
        this.pricedetail.singleperson += parseInt(localtemp);
        sessionStorage.setItem("lspricetotal", (this.pricedetail.singleperson).toString());
      }
      else if (bedtype == "childwithbed"){
        this.pricedetail.childwithbed += parseInt(localtemp);
        sessionStorage.setItem("lspricetotal", (this.pricedetail.childwithbed).toString());
      }
      else if (bedtype == "childwobed"){
        this.pricedetail.childwobed += parseInt(localtemp);
        sessionStorage.setItem("lspricetotal", (this.pricedetail.childwobed).toString());
      }
      else{
        this.pricedetail.adults += parseInt(localtemp);
        sessionStorage.setItem("lspricetotal", (this.pricedetail.adults).toString());
      }
    }
  }

  booknow(){
    this.router.navigate(["/booking"]);
  }

  postdata(pobj) {
    this.dataserv.postpassenger(pobj).subscribe((data) => {
      console.log(data);
      alert("Added passenger !!");
      //this.router.navigate(['passengerdetail']);  
    });
  }

}
