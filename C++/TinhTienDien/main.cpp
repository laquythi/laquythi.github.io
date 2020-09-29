#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv){
	int kwh;
	const int gia1=600;
	const int gia2=700;
	const int gia3=900;
	const int gia4=1100;
	int tien;
	cout<<"moi ban nhap so kwh:";
	cin>>kwh;
	if(kwh<=100){
		tien=kwh*gia1;
	}else if(kwh<=150){
		tien=100*gia1 + (kwh-100)*gia2;
	}else if(kwh<=200){
		tien=100*gia1 + 50*gia2 + (kwh-150)*gia3;
	}else{
		tien = 100*gia1 + 50*gia2 + 50*gia3 + (kwh-200)*gia4;
	}
	cout<<"tien ban phai thanh toan la:"<<tien<<endl;
	return 0;
}
