#include <iostream>
#include<string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct diachi{
	char sonha[255];
	char tenduong[255];
	char quan[255];
	char tinhthanh[255];
};
struct sinhvien{
	char masv[40];
	char tensv[255];
	bool gioitinh;
	diachi diachinha;
	diachi diachitruong;
}teo,ty;

int main(int argc, char** argv) {
	strcpy (teo.tensv,"nguyen van A");
	teo.gioitinh=false;
	strcpy(teo.masv,"113");
	cout<<"\n------------------";
	cout<<"\nma sinh vien="<<teo.masv<<endl;
	cout<<"ten sinh vien="<<teo.tensv<<endl;
	cout<<"gioi tinh="<<(teo.gioitinh==true?"Nu":"Nam");
	cout<<"\n-----------------";
	
	sinhvien bin;
	strcpy(bin.tensv,"nguyen bin");
	cout<<"\nten cua bin="<<bin.tensv;
	return 0;
}

//struct diachi{
//	char sonha[25];
//	char tenduong[250];
//	char quan[25];
//	char tinhthanh[25];
//};
//struct sinhvien{
//	char masv[10];
//	char tensv[255];
//	bool gioitinh;
//	diachi diachinha;
//	diachi diachitruong;
//}teo,ty;


//	strcpy(teo.tensv,"nguyen van teo");
//	teo.gioitinh=false;
//	strcpy(teo.masv,"sv113");
//	cout<<"\n";
//	cout<<"ma="<<teo.masv<<endl;
//	cout<<"ten="<<teo.tensv<<endl;
//	cout<<"gioi tinh="<<(teo.gioitinh==true?"nu":"nam")<<endl;
//	cout<<"\n--------------------\n";
//	
//	sinhvien bin;
//	strcpy(bin.tensv,"pham bin");
//	cout<<"ten cua bin="<<bin.tensv<<endl;
