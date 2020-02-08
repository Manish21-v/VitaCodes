import { Ibooking } from './ibooking';

export class Booking implements Ibooking{
    constructor(public bookingid: number,
        public datepackageid: number,
        public bookingdate: number,
        public customerid: number,
        public packageid: number,
        public passengerid: number,
        public activestatus: string){}
}
