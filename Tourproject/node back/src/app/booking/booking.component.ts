import { Component, OnInit } from '@angular/core';
import { Ibooking } from '../ibooking';
import { Booking } from '../booking';
import { parse } from 'querystring';
import { BookingService } from '../booking.service';
import { Router } from '@angular/router';
import { CustomerdetailService } from '../customerdetail.service';
import { PackagecompletedetailService } from '../packagecompletedetail.service';
import { PassengerdetailService } from '../passengerdetail.service';
import { Ipassengerdetail } from '../ipassengerdetail';
import { Icustomerdetail } from '../icustomerdetail';
import { Ipackagecompletedetail } from '../ipackagecompletedetail';
import { Idatepackagedetail } from '../idatepackagedetail';
import { DatepackagedetailService } from '../datepackagedetail.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  bookdetail: Ibooking;
  pass:any;
  cust:any;
  pack:any;
  packdate:any;
  total:any;
  packid: number = parseInt(localStorage.getItem("lspackageid"));
  custid: number = parseInt(sessionStorage.getItem("customerid"));
  //dateid: number = parseInt()

  constructor(private _book: BookingService,private _date:DatepackagedetailService , private _route: Router, private _customer: CustomerdetailService, private _package: PackagecompletedetailService, private _passenger: PassengerdetailService) { }

  ngOnInit() {
    
    this.bookdetail = new Booking(null,null,null,null,null,null,'');
    this.bookdetail.datepackageid = parseInt(localStorage.getItem("lsdateid"));
    this.bookdetail.customerid = parseInt(sessionStorage.getItem("lscustomerid"));
    this.bookdetail.packageid = parseInt(localStorage.getItem("lspackageid"));
    //this.bookdetail.passengerid = parseInt()
    this.bookdetail.bookingdate = Date.now();
    //this.booknow(this.bookdetail);

    //this.pass = this._passenger.getpassengerbyid()
    this.cust = this._customer.getcustomerbyid(this.custid).subscribe(data => this.cust = data);
    this.pack = this._package.getPackageCompleteDetailbyID(this.packid).subscribe(data => this.pack = data);
    this.packdate = this._date.getdatepackagebyid(parseInt(localStorage.getItem("lsdatepackageid"))).subscribe(data => this.packdate = data);
    this.total = parseInt(sessionStorage.getItem("lspricetotal"));


  }

  booknow(book: Ibooking){
    this._book.addBooking(book).subscribe();
  }

  getdatepackageid(){
    return parseInt(localStorage.getItem("lsdateid"));
  }
  getbookingdate(){
    return Date.now();
  }
  getcustomerid(){
    return parseInt(sessionStorage.getItem("lscustomerid"));
  }
  getpackageid(){
    return parseInt(localStorage.getItem("lspackageid"));
  }
  getpassengerid(){
    return null;
  }
  getactivestatus(){return null;  }
}
