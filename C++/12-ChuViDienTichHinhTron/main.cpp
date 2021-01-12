#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
//	cout<<"chuong trinh tinh chu vi-dien tich hinh tron\n";
//	
//	double r;
//	const double PI=3.14;
//	double chuvi,dientich;
//	
//	cout<<"moi ban nhap ban kinh:";
//	cin>>r;
//	
//	chuvi=2*PI*r;
//	dientich=PI*r*r;
//	
//	cout<<"chu vi la "<<chuvi<<endl;
//	cout<<"dien tich la "<<dientich;

//	cout<<"chuong trinh tinh chu vi,dien tich hinh tron\n";
//	double banKinh,chuVi,dienTich;
//	const double PI = 3.14;
//	
//	cout<<"moi ban nhap vao ban kinh:\n";
//	cin>>banKinh;
//	
//	chuVi = 2*PI*banKinh;
//	dienTich = PI*banKinh*banKinh;
//	
//	cout<<"chu vi hinh tron = "<<chuVi<<endl;
//	cout<<"dien tich hinh tron = "<<dienTich;

	cout<<"chuong trinh tinh chu vi,dien tich hinh chu nhat\n";
	double chieuDai,chieuRong,chuVi,DienTich;
	
	cout<<"moi ban nhap chieu dai:";
	cin>>chieuDai;
	cout<<"moi ban nhap chieu rong:";
	cin>>chieuRong;
	
	while(chieuRong > chieuDai){
		cout<<"ban nhap sai,chieu rong phai > chieu dai.";
		cout<<"\nmoi ban nhap chieu rong:";
		cin>>chieuRong;
	}
	
	chuVi = (chieuDai+chieuRong)*2;
	DienTich = chieuDai*chieuRong;
	
	cout<<"chu vi hinh vuong = "<<chuVi<<endl;
	cout<<"dien tich hinh vuong = "<<DienTich;
	return 0;
}
