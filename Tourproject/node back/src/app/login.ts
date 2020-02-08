import { ILogin } from './ilogin';

export class Login implements ILogin{
    constructor(public email: string, public password: string){}
}
