#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	double canhA,canhB,canhC,chieucao,canhdoidien;
	double chuvi,dientich;
	
	cout<<"chuong trinh tinh chu vi:"<<endl;
	
	cout<<"nhap canh a"<<endl;
	cin>>canhA;
	
	cout<<"nhap canh b"<<endl;
	cin>>canhB;
	
	cout<<"nhap canh c"<<endl;
	cin>>canhC;
	
	chuvi=canhA+canhB+canhC;
	cout<<"chu vi la "<<chuvi;
	
	cout<<"chuong trinh tinh dien tich tam giac:"<<endl; 
	cout<<"moi ban nhap chieu dai canh doi dien "<<endl;
	cin>>canhdoidien;
	 
	cout<<"nhap chieu cao ";
	cin>>chieucao;
	 
	dientich=1.0/2*canhdoidien*chieucao;
	cout<<"dien tich tam giac la: "<<dientich<<endl;
	
	return 0;
}
