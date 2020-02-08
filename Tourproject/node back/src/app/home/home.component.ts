import { Component, OnInit } from '@angular/core';
import { Icategorysubcategory } from '../icategorysubcategory';
import { CategorySubcategoryService } from '../category-subcategory.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  CategorySubcategory : Icategorysubcategory[];
  category:Icategorysubcategory[];

  constructor(private _CategorySubcategoryService : CategorySubcategoryService, private _activatedRoute: ActivatedRoute, private router : Router) { }

  icategoryDisp(CategorySubcategory : Icategorysubcategory[]):any
  {
    console.log(CategorySubcategory);
    let cat = CategorySubcategory.filter(element => element.eofflag =='no');
    console.log(cat);
    return cat;
  }

  subCatDisp(category)
  {
    if(category.eofflag == 'no')
    {
      localStorage.setItem("lscatsubid",category.catsubid);
      this.router.navigate(["/subcategory"]);      
    }
    else if(category.eofflag == 'yes')
    {
      console.log(category.catsubid);
      alert("Welcome to Subcategory");
      localStorage.setItem("lscatsubid",category.catsubid);
    }
  }


  ngOnInit() {
    this._CategorySubcategoryService.getCategorySubcategory().subscribe(data=>{this.CategorySubcategory=data;
      this.category = this.icategoryDisp(this.CategorySubcategory);
      console.log(this.category)});
  }
}
 