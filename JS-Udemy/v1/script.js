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
/*------------the end---------*/


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
/*------------the end---------*/


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
/*------------the end---------*/


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

// var x,y;
// x = y = (3 + 7) * 6 - 4; // x = y = 56
// console.log(x,y);
// var a;
// a = a * 2;
// console.log(a);
/*------------the end---------*/


/* Code challenge */

// var massThi = 58; //kg
// var heightThi = 1.56; // meters

// var massHoach = 72;
// var heightHoach = 1.81;

// var BMIThi = massThi / (Math.pow(heightThi,2)) ; // 23.8
// var BMIHoach = massHoach / (Math.pow(heightHoach,2)); // 21.9
// console.log(BMIThi,BMIHoach);
// var thiIsBolder = BMIThi > BMIHoach;

// console.log('Thi co chi so khoi hon Hoach? ', thiIsBolder); // True
/*------------the end---------*/


/* If Else statements */
// var name = 'thi la quy';
// var status = 'married';
// if(status == 'married'){
// 	console.log(name + ' is married');
// }else{
// 	console.log(name + ' is  FA');
// }
// var name2 = 'Thuy';
// var status2 = false;
// if(status2){
// 	console.log(name2 + ' is Married');
// }else{
// 	console.log(name2 + ' is FA');
// }

// var massThi = 58; //kg
// var heightThi = 1.56; // meters

// var massHoach = 72;
// var heightHoach = 1.81;

// var BMIThi = massThi / (Math.pow(heightThi,2)) ; // 23.8
// var BMIHoach = massHoach / (Math.pow(heightHoach,2)); // 21.9
// console.log(BMIThi,BMIHoach);
// if(BMIHoach > BMIThi){
// 	console.log('Hoach co chi so khoi lon hon Thi');
// }else{
// 	console.log('Thi co chi so khoi lon hon Hoach');
// }
/*------------the end---------*/


/* Bolean logic*/
// var nameHa = 'la hong anh';
// var ageHa = 14;
// if(ageHa > 15){
// 	console.log(nameHa + ' is a man');
// }else if(ageHa >= 13 && ageHa < 20){
// 	console.log(nameHa + ' is teenage');
// }else{
// 	console.log(nameHa + ' is a boy');
// }
/*------------the end---------*/


/* the tenary operators and switch statements */
//toan tu 3 ngoi va dieu kien switch
// var name = 'thi';
// var age = 29;
// age >= 18 ? console.log(name + ' can drink beer') : console.log(name + ` can't drink beer`); 
// var condition = age >= 18 ? 'can married' : ` can't married `;
// console.log(condition); 

// var name = 'thi la quy';
// var job = '';
// switch(job){
// 	case 'staff':
// 		console.log(name + ' work at TBS thai binh');
// 		break;
// 	case 'driver':
// 		console.log(name + ' drive Uber in NYC');
// 		break;
// 	case 'developer':
// 		console.log(name + ' design website,application');
// 		break;
// 	default:
// 		console.log(name + ' is a freelancer');
// }

// var age = 29;
// switch(true){
// 	case age >= 6 && age <= 11 :
// 		console.log(name + ' is a primary student');
// 		break;
// 	case age >= 11 && age <= 15 :
// 		console.log(name + ' is a secondary student');
// 		break;
// 	case age >= 15 && age <= 18:
// 		console.log(name + ' is a hight school student');
// 		break;
// 	case age >= 18:
// 		console.log(name + ' is a man');
// 		break;
// 	default:
// 		console.log(name + ' just is a ' + name);
// }
/*------------the end---------*/


/* Truthy and falsy values and equality operators */
// var name;
// if(name && name === ''){
// 	console.log('value is defined');
// }else{
// 	console.log('value is not defined');
// }
/*------------the end---------*/



/* Challenge 2 */

// var pointThiTeam,pointHoachTeam;

// pointThiTeam = (90 + 78 + 93) / 3;
// pointHoachTeam = (87 + 97 + 80) / 3;

// console.log(pointThiTeam,pointHoachTeam);
// if(pointThiTeam >  pointHoachTeam){
// 	console.log(`Thi's Team is winner with` + pointThiTeam + ' point');
// }else if(pointHoachTeam > pointThiTeam){
// 	console.log(`Hoach's Team is winner team with ` + pointHoachTeam + ' point');
// }else{
// 	console.log('there is a draw');
// }
/*------------the end---------*/


/* Function */
// function caculatorYear(birthYear){
// 	return 2020 - birthYear;
// }
// var ageMe = caculatorYear(1991);
// var ageMyDad = caculatorYear(1962);
// var ageMyMom = caculatorYear(1968);
// var ageMySister = caculatorYear(1996);
// var agemyUncle = caculatorYear(1975);
// console.log(ageMe,ageMyDad,ageMyMom,ageMySister);

// function yearUntilRetirement(year,name){
// 	var age = caculatorYear(year);
// 	var retirement = 60 - age;
// 	if(retirement > 0 ){
// 		console.log(name + ' retirement in ' + retirement + ' year');
// 	}else{
// 		console.log(name + ' already retirement');
// 	}
// }
// yearUntilRetirement(1991,'Thi');
/*------------the end---------*/



/* Function statements and expressions */
// function declaration:
// function whatDoYouDo(name,job){

// }

// function expression
// var whatDoYouDo = function(name,job){
// 	switch(name){
// 		case 'Thi':
// 			return name + ' is a developer';
// 			break;
// 		case 'Toan':
// 			return name + ' is a manager';
// 			break;
// 		case 'Trang':
// 			return name + ' is a Tester';
// 			break;
// 		case 'Thu':
// 			return name + ' is a developer';
// 			break;
// 		default :
// 			return name + ' is a freelancer';
// 	}
// }
// console.log(whatDoYouDo('Trang','tester'));
// console.log(whatDoYouDo('thu','developer'));
/*------------the end---------*/


/* Array */

// var names = ['thi','anh','trang','phong'];
// console.log(names[2]);
// console.log(names.length);
// names[3] = 'nhung';
// console.log(names);
// names[4] = 'phong';
// console.log(names);
// console.log(names[names.length - 1]);

// var john = ['john',39,'developer',true];
// console.log(john);

// john.push('multi type'); //them gia tri vao cuoi mang
// console.log(john);

// john.pop(); // remove gia tri tai cuoi mang
// console.log(john);

// john.unshift('Mr'); // them gia tri tai dau mang
// console.log(john);

// john.shift(); //remove gia tri dau mang
// console.log(john);

// console.log(john.indexOf('developer'));
// console.log(john.indexOf('developer') === -1 ? ' John is not a developer' : ' John is a developer') ;
/*------------the end---------*/



/* Coding challenge*/

// function tipCaculator(bill){
// 	var percentage;
// 	if(bill < 50){
// 		percentage = 0.2; // .2
// 	}else if(bill >= 50 && bill < 200){
// 		percentage = 0.15;
// 	}else{
// 		percentage = 0.1;
// 	}
// 	return percentage * bill;
// }
// console.log(tipCaculator(220));

// var bills = [34,132,294];
// var allOfTips = [tipCaculator(bills[0]),tipCaculator(bills[1]),tipCaculator(bills[2])];
// console.log(allOfTips);

// var mustPay = [bills[0] + allOfTips[0],bills[1] + allOfTips[1],bills[2] + allOfTips[2]];
// console.log(mustPay);
/*------------the end---------*/


/* Object and properties */
//object literal
// var Thi = {
// 	firstName : 'la quy',
// 	lastName : 'thi',
// 	age : 29,
// 	birthYear : 1991,
// 	family : ['Trang','Phong','Anh'],
// 	isMarried : false,
// 	job : 'developer'
// };
// console.log(Thi);
// var x = 'birthYear';
// console.log(Thi[x]); //console.log(Thi['birthYear']);
// Thi.job = 'front-end developer';
// Thi.isMarried = true;
// console.log(Thi);

//create a new object;
// var canyon = new Object();
// canyon.ten = 'Canyon';
// canyon.xuatxu = 'Singapore';
// canyon.soluong = 20;
// canyon.gia = 18;
// console.log(canyon);
/*------------the end---------*/



/* Object and Method */
// var Thi = {
// 	name : 'thi',
// 	birthYear : 1991,
// 	address : 'thai binh',
// 	family : ['dad','mom','sister'],
// 	isMarried : false,
// 	calcYear : function (birthYear){
// 		return 2020 - birthYear;
// 	}
// };
// console.log(Thi.calcYear(1991));

var Thi = {
	name : 'thi',
	birthYear : 1991,
	address : 'thai binh',
	family : ['dad','mom','sister'],
	isMarried : false,
	calcYear : function (){
		this.age = 2020 - this.birthYear;
	}
};
Thi.calcYear();
console.log(Thi);









