import { Component, OnInit } from '@angular/core';
import { Icategorysubcategory } from '../icategorysubcategory';
import { CategorySubcategoryService } from '../category-subcategory.service';
import { Router, ActivatedRoute } from '@angular/router';
import { PackagecompletedetailService } from '../packagecompletedetail.service';

@Component({
  selector: 'app-subcategory',
  templateUrl: './subcategory.component.html',
  styleUrls: ['./subcategory.component.css']
})
export class SubcategoryComponent implements OnInit {

  categoriessubcategories : Icategorysubcategory[];
  subcategory : Icategorysubcategory[];
  subcatid : number = parseInt(localStorage.getItem('lscatsubid'));

  constructor(private _CategorySubcategoryService : CategorySubcategoryService, private _router : Router, private _activatedRoute: ActivatedRoute) { }

  isubcatdisp(categoriessubcategories : Icategorysubcategory[])
  {
    console.log(categoriessubcategories);
    let subcat = categoriessubcategories.filter(element =>(element.categoryid == this.subcatid) && (element.subcategoryid != null));
    console.log(subcat);
    return(subcat);
  }
  //Incomplete
  // subcatdisp()
  // {   
  //     const category_id: string = this._activatedRoute.snapshot.params['catsubid'];
  //     const catid: number = parseInt(category_id);
  //     alert(catid);
  //     console.log(catid);
  //     // let subcat = category.filter(element => element.eofflag == 'yes' && element.catsubid == catid);
  //     // console.log(category);

  // }

  getsubid(id){
    console.log(id);
    localStorage.setItem("lssubcatid",id);
    this._router.navigate(["/package"]);

  }
  ngOnInit() {
    this._CategorySubcategoryService.getCategorySubcategory().subscribe(data=>{this.categoriessubcategories=data; 
    this.subcategory=this.isubcatdisp(this.categoriessubcategories);
    console.log(this.subcategory)});
  }

}
