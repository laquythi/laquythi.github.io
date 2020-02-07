/* variable and data types */
// var firstName = 'thi';
// var lastName = 'la quy';
// var age = 29;
// console.log('my name is ' + firstName + ' ' + lastName + 'and I am ' + age + ' year old');

// var fullAge = false;
// console.log(fullAge);
// var job;
// console.log(job);
// job = 'developer';
// console.log(job);
// -----end of variable and data types-----


/* variable mutation and type coertion */
//chuyển giá trị của biến isMarried từ dạng boolean(true,false) sang string như ví dụ bên dưới.
//nếu commnet biến isMarried, nội dung chuyển thành Is he married undefined

// var firstName = 'thi';
// var age = 29;
// var job,isMarried;
// job = 'developer.';
// isMarried = true;
// console.log(name + ' ' + age + ' year old. ' + 'he is a ' + job + 'Is he married? ' + isMarried);
//thi 29 year old. he is a developer.Is  he married? true

// var lastName = prompt('what is his last name');
// console.log(firstName + ' ' + lastName);
// ------end of mutation and type coertion ----


/* operators */
// Math operators
// var ageMe = 2020 - 1991;
// console.log(ageMe);

// var ageMe,ageMyMom,ageMyDad;
// now = 2020;
// ageMe = now - 1991;
// ageMyDad = now - 1962;
// ageMyMom = now - 1968;
// console.log(ageMe,ageMyMom,ageMyDad);

// Logical operators
// var lastName = 'thi';
// var ageMe = 29;
// var ageMySister = 24;
// var meOlder = ageMe > ageMySister;
// console.log(meOlder);

// type of operators
// console.log(typeof meOlder); //boolean;
// console.log(typeof ageMe,typeof lastName); //number,string
// var firstName;
// console.log(typeof firstName); //undefined;


/* operators precedence */
//độ ưu tiên toán tử.
//https://wiki.developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Operator_Precedence
// var now = 2020;
// var myAge = 20;
// var yearBorn = 1991;
// var isMyAge = myAge <= now - yearBorn; ở đây nhỏ hơn hoặc bằng có độ ưu tiên 12,còn phép trừ có độ ưu tiên là 14
// nhỏ hơn hoặc bằng dc ưu tiên hơn,nó sẽ tính kết quả now - yearBorn trước.
// console.log(isMyAge);

// var thiAge = 29;
// var trangAge = 24;
// var averageAge = thiAge + trangAge / 2; // + có độ ưu tiên 14, / có độ ưu tiên 15. nếu viết như trên thì ...
// /// ... sẽ thực hiện trangAge / 2 sau đó lấy kq + thiAge ==> kết quả là 41
// console.log(averageAge);

// var a = 10;
// var b = 20;
// var c = 4;
// var d = a <= b - c; // a >= 16 <==> 10 >= 16 false
// console.log(d);

var x,y;
x = y = (3 + 7) * 6 - 4; // x = y = 56
console.log(x,y);
var a;
a = a * 2;
console.log(a);