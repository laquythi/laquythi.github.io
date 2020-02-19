export {};
let message = 'second line in typescript';
console.log(message);

let a = 10;
const b = 20;

let sum;
const title='typescript';

const isBeginner: Boolean = false;
let number : Number = 10;
var name : String = 'thi la quy';

let Name : Boolean = true;
console.log(Name);

let sentence : string = `my name is ${name}
I am a front-end developer`;
console.log(sentence);

let n : null = null;
let u : undefined = undefined;
console.log(n,u);

let isNew : Boolean = undefined;
let isOld : undefined;
console.log(isNew,isOld);

let list1: number[] = [1,6,2,-29];
let list2 : Array<number> = [1,4,2];
console.log(list1,list2);

let person1 : [string,number] = ['7991',90];
console.log(person1);

let randomValue : any = 10;
randomValue = true;
randomValue = 'that my name';
console.log(randomValue);

let multiType : number | boolean;
multiType = 20;
multiType = true;

let anyType : any;
anyType = 20;
anyType = false;
console.log(multiType,anyType);

function add(num1: number,num2:number): number{
    console.log(num1 + num2);
}
add(10,53);

function fullName(person : {firstName : number,lastName : string}){
    console.log(`${person.firstName} ${person.lastName}`);
}
let p = {
    firstName : '7991',
    lastName : 1991
};
fullName(p);

class Employee{
     employeeName : string;
     constructor(name : string){
         this.employeeName = name;
     }
     greet (){
         console.log(`what the hell is ${this.employeeName}`);
     }
 }
let emp1 = new Employee('typescript');
console.group(emp1.employeeName);
emp1.greet();