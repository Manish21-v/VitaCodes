import { Ipassengerdetail } from './ipassengerdetail';

export class Passengerdetail implements Ipassengerdetail {

    constructor(public passengerid: object, 
        public passengername: string, 
        public passengerdob: Date,
        public roomtype: string, 
        public cost: number, 
        public passengeriddocument: string,
        public passengeridno: number, 
        public passengerdetailcol: string, 
        public passengersex: string,
        public passengeremail: string, 
        public packageid: number) {
    }

}
