#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	 int canhdoidien;
	 int chieucao;
	 int canhA,canhB,canhC;
	 double chuvi;
	 double dientich;
	 cout<<"chuong trinh tinh chu vi-dien tich tam giac:"<<endl;
	 cout<<"moi ban nhap chieu dai canh doi dien "<<endl;
	 cin>>canhdoidien;
	 cout<<"nhap chieu cao ";
	 cin>>chieucao;
	 dientich=1.0/2*canhdoidien*chieucao;
	 cout<<"dien tich tam giac la: "<<dientich<<endl;
	cout<<"chuong trinh tinh chu vi:"<<endl;
	cout<<"nhap canh a"<<endl;
	cin>>canhA;
	cout<<"nhap canh b"<<endl;
	cin>>canhB;
	cout<<"nhap canh c"<<endl;
	cin>>canhC;
	chuvi=canhA+canhB+canhC;
	cout<<"chu vi la "<<chuvi;
	return 0;
}
