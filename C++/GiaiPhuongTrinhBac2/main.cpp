#include <iostream>
#include <math.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	double a,b,c;
	cout<<"giai phuong trinh bac 2: ax^2+bx+c=0\n";
	cout<<"nhap a:";
	cin>>a;
	cout<<"nhap b:";
	cin>>b;
	cout<<"nhap c:";
	cin>>c;
	if(a==0){ // phuong trinh tro thanh bx+c=0
		if(b==0 && c==0){
			cout<<"phuong trinh co vo so nghiem";
		}else if(b==0 && c!=0){
			cout<<"phuong trinh vo nghiem";
		}else{ // x=-c/b
			double x=(-c*1.0)/b;
			cout<<"phuong trinh co 1 nghiem x="<<x<<endl;
		}
	}else{
		double delta=pow(b,2)-4*a*c;
		if(delta<0){
			cout<<"phuong trinh vo nghiem";
		}else if(delta==0){
			double nkep=-b/(2*a);
			cout<<"phuong trinh co 1 nghiem kep x1=x2="<<nkep<<endl;
		}else{
			double x1=(-b-sqrt(delta))/(2*a);
			double x2=(-b+sqrt(delta))/(2*a);
			cout<<"phuong trinh co 2 nghiem phan biet"<<endl;
			cout<<"x1="<<x1<<endl;
			cout<<"x2="<<x2<<endl;
		}
	}
	return 0;
}
