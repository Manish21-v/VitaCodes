import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { SubcategoryComponent } from './subcategory/subcategory.component';
import { LoginComponent } from './login/login.component';
import { ItineraryComponent } from './itinerary/itinerary.component';
import { PackagecompletedetailComponent } from './packagecompletedetail/packagecompletedetail.component';
import { PricedetailComponent } from './pricedetail/pricedetail.component';
import { DatepackagedetailComponent } from './datepackagedetail/datepackagedetail.component';
import { AddcustomerComponent } from './addcustomer/addcustomer.component';
import { AddpassengersComponent } from './addpassengers/addpassengers.component';
import { BookingComponent } from './booking/booking.component';


const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'subcategory', component:SubcategoryComponent},
  {path:'login', component:LoginComponent},
  {path:'itinerary', component:ItineraryComponent},
  {path:"package", component:PackagecompletedetailComponent},
  {path:"price", component:PricedetailComponent},
  {path:"date", component:DatepackagedetailComponent},
  {path:"signup", component:AddcustomerComponent},
  {path:"passenger", component:AddpassengersComponent},
  {path:"booking", component:BookingComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
