import { Timestamp } from "rxjs";

export interface Icustomerdetail {

    customerid:number;
	customername:string;
	email:string;
	password:string;
	address1:string;
	address2:string;
	city:string;
	state:string;
	pin:number;
	telno:string;
	mobileno:string;
	registrationdate?:string
}
