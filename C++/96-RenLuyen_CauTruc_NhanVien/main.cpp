#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct diachi{
	char tenduong[255];
	char quan[255];
	char tinhthanh[100];
};
struct nhanvien{
	int ma;
	char ten[255];
	int tuoi;
	diachi coquan;
	diachi nharieng;
};
int main(int argc, char** argv) {
	nhanvien teo;
	teo.ma=1;
	strcpy(teo.ten,"Teo");
	teo.tuoi=23;
	strcpy(teo.coquan.tenduong,"1 lac long quan");
	strcpy(teo.coquan.quan,"quan tay ho");
	strcpy(teo.coquan.tinhthanh,"ha noi");
	
	strcpy(teo.nharieng.tenduong,"tuong mai");
	strcpy(teo.nharieng.quan,"quan hai ba trung");
	strcpy(teo.nharieng.tinhthanh,"ha noi");
	
	cout<<"thong tin teo:"<<endl;
	cout<<"ma="<<teo.ma<<endl;
	cout<<"ten="<<teo.ten<<endl;
	cout<<"tuoi="<<teo.tuoi<<endl;
	cout<<"dia chi co quan:"<<teo.coquan.tenduong<<","<<teo.coquan.quan<<","<<teo.coquan.tinhthanh<<endl;
	cout<<"dia chi nha rieng:"<<teo.nharieng.tenduong<<","<<teo.nharieng.quan<<","<<teo.nharieng.tinhthanh<<endl;
	cout<<"-------------------------------------------------------\n";
	
	nhanvien *pty=new nhanvien;
	pty->ma = 2;
	strcpy(pty->ten,"Ty");
	pty->tuoi=15;
	strcpy(pty->coquan.tenduong,"lieu giai");
	strcpy(pty->coquan.quan,"ba dinh");
	strcpy(pty->coquan.tinhthanh,"ha noi");
	
	cout<<"thong tin cua ty la:"<<endl;
	cout<<"ma:"<<pty->ma<<endl;
	cout<<"ten:"<<pty->ten<<endl;
	cout<<"tru so cong ty,duong:"<<pty->coquan.tenduong<<endl;
	cout<<"tru so cong ty,quan:"<<pty->coquan.quan<<endl;
	cout<<"tru so cong ty,thanh pho:"<<pty->coquan.tinhthanh;
	return 0;
}

//struct diachi{
//	char tenduong[255];
//	char quan[150];
//	char tinhthanh[150];
//};
//struct nhanvien{
//	int ma;
//	char ten[255];
//	int tuoi;
//	diachi coquan;
//	diachi nharieng;
//};

//	nhanvien teo;
//	teo.ma=1;
//	strcpy(teo.ten,"teo");
//	teo.tuoi=23;
//	strcpy(teo.coquan.tenduong,"so 1 hai ba trung");
//	strcpy(teo.coquan.quan,"quan hoan kiem");
//	strcpy(teo.coquan.tinhthanh,"ha noi");
//	strcpy(teo.nharieng.tenduong,"46 tuong mai");
//	strcpy(teo.nharieng.quan,"hai ba trung");
//	strcpy(teo.nharieng.tinhthanh,"ha noi");
//	
//	cout<<"thong tin cua teo:"<<endl;
//	cout<<"ma="<<teo.ma<<endl;
//	cout<<"ten="<<teo.ten<<endl;
//	cout<<"tuoi="<<teo.tuoi<<endl;
//	cout<<"dia chi co quan="<<teo.coquan.tenduong<<";"<<teo.coquan.quan<<";"<<teo.coquan.tinhthanh<<endl;
//	
//	nhanvien *pty=new nhanvien;
//	strcpy(pty->ten,"Ty");
//	strcpy(pty->nharieng.tinhthanh,"ha loi");
//	cout<<pty->ten<<"->"<<pty->nharieng.tinhthanh<<endl;
