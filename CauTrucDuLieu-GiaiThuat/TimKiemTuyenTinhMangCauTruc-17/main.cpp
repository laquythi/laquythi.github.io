#include <iostream>
#include <string.h>
#include <stdio.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct SinhVien{
	char ma[10];
	char ten[150];
	bool gioitinh;
};
void NhapDanhSach(SinhVien dsSV[],int siso);
void XuatDanhSach(SinhVien dsSV[],int siso);

int main(int argc, char** argv) {
	int siso = 3;
	SinhVien dsSV[siso];
	NhapDanhSach(dsSV,siso);
	cout<<"danh sach sinh vien sau khi nhap :\n";
	XuatDanhSach(dsSV,siso);
	return 0;
}

void NhapDanhSach(SinhVien dsSV[],int siso){
	for(int i=0;i<siso;i++){
		cout<<"nhap ma:";
		gets(dsSV[i].ma);
		cout<<"nhap ten:";
		gets(dsSV[i].ten);
		cout<<"gioi tinh:(male/female):";
		char gt[2];
		gets(gt);
		if(strcmp(gt,"male") == 0){
			dsSV[i].gioitinh = false;
		}else{
			dsSV[i].gioitinh = true;
		}
	}
}
void XuatDanhSach(SinhVien dsSV[],int siso){
	for(int i=0;i<siso;i++){
		cout<<dsSV[i].ma<<"\t"<<dsSV[i].ten<<"\t"<<dsSV[i].gioitinh<<"\n";
	}
}
