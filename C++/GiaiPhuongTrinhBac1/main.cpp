#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
 	int a,b;
 	cout<<"giai phuong trinh bac 1:ax+b=0 \n";
 	cout<<"nhap a:";
 	cin>>a;
 	cout<<"nhap b:";
 	cin>>b;
 	if(a==0 && b==0){
 		cout<<"phuong trinh co vo so nghiem";
	 }else if(a==0 && b!=0){
	 	cout<<"phuong trinh vo nghiem";
	 }else{
	 	double x=(-b*1.0)/a;
	 	cout<<"phuong trinh co 1 nghiem x="<<x;
	 }
	return 0;
}
