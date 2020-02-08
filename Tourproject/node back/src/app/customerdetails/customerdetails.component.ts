import { Component, OnInit } from '@angular/core';
import { CustomerdetailsService } from '../customerdetails.service';

@Component({
  selector: 'app-customerdetails',
  templateUrl: './customerdetails.component.html',
  styleUrls: ['./customerdetails.component.css']
})
export class CustomerdetailsComponent implements OnInit {
user:[];
  constructor(private data:CustomerdetailsService) { }

  ngOnInit() {
    

  }

}
