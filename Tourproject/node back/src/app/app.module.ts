import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { SubcategoryComponent } from './subcategory/subcategory.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AddcustomerComponent } from './addcustomer/addcustomer.component';
import { DatepackagedetailComponent } from './datepackagedetail/datepackagedetail.component';
import { ItineraryComponent } from './itinerary/itinerary.component';
import { PackagecompletedetailComponent } from './packagecompletedetail/packagecompletedetail.component';
import { PricedetailComponent } from './pricedetail/pricedetail.component';
import { AddpassengersComponent } from './addpassengers/addpassengers.component';
import { BookingComponent } from './booking/booking.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SubcategoryComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    AddcustomerComponent,
    DatepackagedetailComponent,
    ItineraryComponent,
    PackagecompletedetailComponent,
    PricedetailComponent,
    AddpassengersComponent,
    BookingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule, 
    ReactiveFormsModule, 
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
