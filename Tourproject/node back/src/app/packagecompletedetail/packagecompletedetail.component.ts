import { Component, OnInit } from '@angular/core';
import { Ipackagecompletedetail } from '../ipackagecompletedetail';
import { PackagecompletedetailService } from '../packagecompletedetail.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-packagecompletedetail',
  templateUrl: './packagecompletedetail.component.html',
  styleUrls: ['./packagecompletedetail.component.css']
})
export class PackagecompletedetailComponent implements OnInit {
  packagecompletedetail: Ipackagecompletedetail[];
  packagedetail: Ipackagecompletedetail[];
  subcatid: number = parseInt(localStorage.getItem("lssubcatid"));

  constructor(private _packageservice: PackagecompletedetailService, private _activatedRoute: ActivatedRoute, private _route: Router) { }

  getpackagedetail(packagecompletedetail: Ipackagecompletedetail[]) {
    let pack = packagecompletedetail.filter(element => (element.categorysubcategory.catsubid==this.subcatid));
    console.log(pack);
    return pack;
  }

  getpackageid(id){
    //alert(id);
    localStorage.setItem("lspackageid",id);
    this._route.navigate(["/itinerary"]);
  }

  ngOnInit() {
    this._packageservice.getPackageCompleteDetail().subscribe(data => {this.packagecompletedetail = data;
      this.packagedetail = this.getpackagedetail(this.packagecompletedetail);
    });
  }

}
