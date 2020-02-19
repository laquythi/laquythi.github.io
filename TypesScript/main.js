"use strict";
exports.__esModule = true;
var message = 'second line in typescript';
console.log(message);
var a = 10;
var b = 20;
var sum;
var title = 'typescript';
var isBeginner = false;
var number = 10;
var name = 'thi la quy';
var Name = true;
console.log(Name);
var sentence = "my name is " + name + "\nI am a front-end developer";
console.log(sentence);
var n = null;
var u = undefined;
console.log(n, u);
var isNew = undefined;
var isOld;
console.log(isNew, isOld);
var list1 = [1, 6, 2, -29];
var list2 = [1, 4, 2];
console.log(list1, list2);
var person1 = ['7991', 90];
console.log(person1);
var randomValue = 10;
randomValue = true;
randomValue = 'that my name';
console.log(randomValue);
var multiType;
multiType = 20;
multiType = true;
var anyType;
anyType = 20;
anyType = false;
console.log(multiType, anyType);
function add(num1, num2) {
    console.log(num1 + num2);
}
add(10, 53);
function fullName(person) {
    console.log(person.firstName + " " + person.lastName);
}
var p = {
    firstName: '7991',
    lastName: 1991
};
fullName(p);
var Employee = /** @class */ (function () {
    function Employee(name) {
        this.employeeName = name;
    }
    Employee.prototype.greet = function () {
        console.log("what the hell is " + this.employeeName);
    };
    return Employee;
}());
var emp1 = new Employee('typescript');
console.group(emp1.employeeName);
emp1.greet();
