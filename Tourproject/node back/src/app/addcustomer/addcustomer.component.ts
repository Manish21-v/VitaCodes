import { Component, OnInit } from '@angular/core';
import { Icustomerdetail } from '../icustomerdetail';
import { CustomerdetailService } from '../customerdetail.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Customerdetail } from '../customerdetail';
import { FormControl,FormArray} from '@angular/forms';
import { from } from 'rxjs';

@Component({
  selector: 'app-customerdetail',
  templateUrl: './addcustomer.component.html',
  styleUrls: ['./addcustomer.component.css']
})
export class AddcustomerComponent implements OnInit {

  customerdetail:Icustomerdetail[];
    cForm: FormGroup;
    cobj:Icustomerdetail;
    submitted = false;

    ngOnInit() {
      this.buildcForm();
      this._customerdetailservice.getcustomerbyid(111).subscribe(  data=>this.cobj=data );
    }

  constructor(private _customerdetailservice:CustomerdetailService, public fb: FormBuilder,
    private dataserv: CustomerdetailService,private router: Router) 
    { this.buildcForm(); }

  
  buildcForm() {
    this.cForm = this.fb.group({
      cname:['', [Validators.required]],
      cemail:['', [Validators.required]],
      cpass:['', [Validators.required]],
      cadd1:['', [Validators.required]],
      cadd2:['', [Validators.required]],
      ccity:['', [Validators.required]],
      cstate:['', [Validators.required]],
      cpin:['', [Validators.required]],
      ctel:['', [Validators.required]],
      cmob:['', [Validators.required]]
    });
  }


get cname() {
  return this.cForm.get('cname');
}

get cemail() {
  return this.cForm.get('cemail');
}

get cpass() {
  return this.cForm.get('cpass');
}  

get cadd1() {
  return this.cForm.get('cadd1');
}

get cadd2() {
  return this.cForm.get('cadd2');
}

get ccity() {
  return this.cForm.get('ccity');
}

get cstate() {
  return this.cForm.get('cstate');
}

get cpin() {
  return this.cForm.get('cpin');
}

get ctel() {
  return this.cForm.get('ctel');
}

get cmob() {
  return this.cForm.get('cmob');
}

onSubmit(cForm: FormGroup) {
  this.submitted = true;
  if (!cForm.valid) {
    //console.log(cForm.value);
    return;
  }
  this.mapFormValues(cForm);
  this.postdata(this.cobj);
}
  
mapFormValues(form: FormGroup) {
  this.cobj = new Customerdetail(null,'','', '', '', '','','',null,'','');
  this.cobj.mobileno = form.controls.cmob.value;
  this.cobj.customername = form.controls.cname.value;
  this.cobj.email = form.controls.cemail.value;
  this.cobj.password = form.controls.cpass.value;
  this.cobj.address1 = form.controls.cadd1.value;
  this.cobj.address2 = form.controls.cadd2.value;
  this.cobj.city = form.controls.ccity.value;
  this.cobj.state=form.controls.cstate.value;
  this.cobj.pin=form.controls.cpin.value;
  this.cobj.telno=form.controls.ctel.value;
   }

   postdata(cobj) {
    this.dataserv.postcustomer(cobj).subscribe((data) => {
      //console.log(data);
   
        //this.router.navigate(['customerdetail']);  
   });
   }

   update(frm) {
    if(frm.invalid)
    return;
  
  console.log(this.cobj);
  alert("Customer details updated !!");
    this._customerdetailservice.updatecustomer(this.cobj).subscribe(
    );
  }

}

