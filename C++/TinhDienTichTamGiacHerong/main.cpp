#include <iostream>
#include <math.h>
using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int a,b,c;
	cout<<"nhap canh a:";
	cin>>a;
	cout<<"nhap canh b:";
	cin>>b;
	cout<<"nhap canh c:";
	cin>>c;
	if(a<=0 || b<=0 || c<=0 || (a+b)<=c || (b+c)<=a || (a+c)<=b){
		cout<<"kich thuoc cac canh ko the tao thanh tam giac";
	}else {
		int cv=a+b+c;
		double p=cv/2.0;
		double dt=sqrt(p*(p-a)*(p-b)*(p-c));
		cout<<"chu vi="<<cv<<endl;
		cout<<"dien tich="<<dt;
	}

	return 0;
}
