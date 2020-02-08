import { Component, OnInit } from '@angular/core';
import { Ipricedetail } from '../ipricedetail';
import { PricedetailService } from '../pricedetail.service';

@Component({
  selector: 'app-pricedetail',
  templateUrl: './pricedetail.component.html',
  styleUrls: ['./pricedetail.component.css']
})
export class PricedetailComponent implements OnInit {

  pricedetail:Ipricedetail[];

  constructor(private _pricedetailservice:PricedetailService) { }

  ngOnInit() {
    this._pricedetailservice.getAllPricedetail().subscribe(data=>this.pricedetail=data);
    console.log(this.pricedetail);
  }

}
