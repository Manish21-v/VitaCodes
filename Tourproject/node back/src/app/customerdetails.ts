import { Icustomerdetails } from './icustomerdetails';

export class Customerdetails implements Icustomerdetails {

    customerid: number;
    customername: string;
    email: string;
    password: string;
    address1: string;
    address2: string;
    city: string;
    state: string;
    pin: number;
    telno: number;
    mobileno: number;
    registrationdate: Date;

    constructor(cId:number, cname: string, address1: string, address2: string, city:string, state: string, pin: number, telno: number,
        mobileno: number, regdate: Date )
    {
            this.customerid=cId;
            this.customername=cname;
            this.address1=address1;
            this.address2=address2;
            this.city=city;
            this.state=state;
            this.pin=pin;
            this.telno=telno;
            this.mobileno=mobileno;
            this.registrationdate=regdate;   
    }

    
}
