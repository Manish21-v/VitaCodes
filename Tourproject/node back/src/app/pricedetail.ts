import { Ipricedetail } from './ipricedetail';

export class Pricedetail implements Ipricedetail{

    constructor(public priceid:number,
        public packageid:object,
        public tourcost:number,
        public singleperson: number,
        public adults:number,
        public childwobed:number,
        public childwithbed:number,public packagecompletedetail: any)
    {}
}
