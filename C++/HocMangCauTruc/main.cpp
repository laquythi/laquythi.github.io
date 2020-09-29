#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct sinhvien{
	int ma;
	char ten[255];
};
void nhapmang(sinhvien dssv[],int siso);
void xuatmang(sinhvien dssv[],int siso);
int main(int argc, char** argv) {
	int siso=3;
	sinhvien dssv[siso];
	nhapmang(dssv,siso);
	xuatmang(dssv,siso);
	return 0;
}

void nhapmang(sinhvien dssv[],int siso){
	for(int i=0;i<siso;i++){
		cout<<"nhap sinh vien thu:"<<i<<endl;
		cout<<"nhap ma:";
		cin>>dssv[i].ma;
		cout<<"nhap ten:";
		cin.ignore();
		gets(dssv[i].ten);//o day ko dung dc cin>>dssv[i].ten?????????????
	}
}

void xuatmang(sinhvien dssv[],int siso){
	for(int i=0;i<siso;i++){
		cout<<dssv[i].ma<<"\t"<<dssv[i].ten<<endl;
	}
}

//void nhapmang(sinhvien dssv[],int siso){
//	for(int i=0;i<siso;i++){
//		cout<<"nhap sinh vien thu "<<i<<endl;
//		cout<<"nhap ma ";
//		cin>>dssv[i].ma;
//		cout<<"nhap ten:";
//		cin.ignore();
//		gets(dssv[i].ten);//o day ko dung dc cin>>dssv[i].ten?????????????
//	}
//}
//void xuatmang(sinhvien dssv[],int siso){
//	for(int i=0;i<siso;i++){
//		cout<<dssv[i].ma<<"\t"<<dssv[i].ten<<endl;
//	}
//}

//struct sinhvien{
//	int ma;
//	char ten[255];	
//};
//void nhapmang(sinhvien dssv[],int siso);
//void xuatmang(sinhvien dssv[],int siso);

//	int siso=3;
//	sinhvien dssv[siso];
//	nhapmang(dssv,siso);
//	xuatmang(dssv,siso);
