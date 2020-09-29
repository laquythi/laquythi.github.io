#include <iostream>
#include<iomanip>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	double toan,ly,hoa,dtb;
	cout<<"chuong trinh tinh diem trung binh:"<<endl;
	cout<<"nhap diem toan:";
	cin>>toan;
	cout<<"nhap diem ly:";
	cin>>ly;
	cout<<"nhap diem hoa:";
	cin>>hoa;
	dtb=(toan+ly+hoa)/3;
	cout<<"diem trung binh = "<<dtb<<endl;
	cout<<"diem trung binh da lam tron la "<<setprecision(3)<<dtb<<endl;
	return 0;
}
