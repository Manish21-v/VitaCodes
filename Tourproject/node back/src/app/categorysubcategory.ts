import { Icategorysubcategory } from './icategorysubcategory';

export class Categorysubcategory implements Icategorysubcategory{

    constructor(  public catsubid : number,
        public categoryid : number,
        public categoryname  : String,
        public categoryimage : String,
        public subcategoryid : number,
        public subcategoryname : String,
        public subcategoryimage : String,
        public eofflag : String){
    }

}
