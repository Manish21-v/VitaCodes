import { Component, OnInit } from '@angular/core';
import { DatepackagedetailService } from '../datepackagedetail.service';
import { Idatepackagedetail } from '../idatepackagedetail';
import { ActivatedRoute, Router } from '@angular/router';
import { Iitinerary } from '../iitinerary';
import { ItineraryService } from '../itinerary.service';

@Component({
  selector: 'app-datepackagedetail',
  templateUrl: './datepackagedetail.component.html',
  styleUrls: ['./datepackagedetail.component.scss']
})
export class DatepackagedetailComponent implements OnInit {
  datepackagedetail: Idatepackagedetail[];
  datefilterlist: Idatepackagedetail[];
  itinerary: Iitinerary[];
  datevalue: string;
  packagecode: number = parseInt(localStorage.getItem('lspackageid'));

  constructor(private _datepackagedetailservice: DatepackagedetailService, private _itineraryservice: ItineraryService,
    private _activatedRoute: ActivatedRoute, private _router: Router) { }

  ngOnInit() {
    this._datepackagedetailservice.getdatepackagedetail().subscribe(data => {
    this.datepackagedetail = data;
      this.datefilterlist = this.getdatepackageid(this.datepackagedetail);
    });


  }


  getdatevalue(datevalue: number) {

    localStorage.setItem("lsdatepackageid", datevalue.toString());

  }

  getdatepackageid(d: Idatepackagedetail[]) {
    console.log(d);
    let dateid = d.filter(element => (element.packagecompletedetail.packageid == this.packagecode));
    return dateid;
  }

  checklogin() {
    if (sessionStorage.getItem("customerid") != null)
      this._router.navigate(["passenger"]);
    else
      this._router.navigate(["login"]);
  }
}
