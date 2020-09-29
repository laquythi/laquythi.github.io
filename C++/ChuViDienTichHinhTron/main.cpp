#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	cout<<"chuong trinh tinh chu vi-dien tich hinh tron\n";
	double r;
	const double PI=3.14;
	double chuvi,dientich;
	cout<<"moi ban nhap ban kinh:";
	cin>>r;
	chuvi=2*PI*r;
	dientich=PI*r*r;
	cout<<"chu vi la "<<chuvi<<endl;
	cout<<"dien tich la "<<dientich;
	return 0;
}
