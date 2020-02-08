import { Icustomerdetail } from './icustomerdetail';

export class Customerdetail implements Icustomerdetail{

    constructor(public customerid:number,
        public customername:string,
        public email:string,
        public password:string,
        public address1:string,
        public address2:string,
        public city:string,
        public state:string,
        public pin:number,
        public telno:string,
        public mobileno:string) {
    }

}
