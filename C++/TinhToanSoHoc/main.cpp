#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int a,b;
	char ch;
	cout<<"chuong trinh tinh toan so hoc:";
	cout<<"nhap a:";
	cin>>a;
	cout<<"nhap b:";
	cin>>b;
	cout<<"nhap phep toan(+ - * /):";
	cin>>ch;
	switch(ch){
		case '+':
			cout<<a<<"="<<b<<"="<<a+b;
			break;
		case '-':
			cout<<a<<"-"<<b<<"="<<a-b;
			break;
		case '*':
			cout<<a<<"*"<<b<<"="<<a*b;
			break;
		case '/':
			if(b==0){
				cout<<"b phai khac 0";
				break;
			}else{
				cout<<a<<"/"<<b<<"="<<(a*1.0/b); //khai bao a b dang int nen khi nhap du lieu cung nen nhap dang int(ko nen nhap dang double vd:1.4;4.6....)
				break;
			}
		default:
			cout<<"ban nhap phep toan sai";		
	}
	return 0;
}
