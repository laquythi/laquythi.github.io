#include <iostream>
#include <string.h>
#include <stdio.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct NhanVien{
	int ma;
	char ten[150];
	int tuoi;
};
NhanVien *NhapNhanVien();
void XuatNhanVien(NhanVien *nv);
void NhapDanhSachNhanVien(NhanVien **&dsNv,int n);
void XuatDanhSachNhanVien(NhanVien **dsNV,int n);
void interchangeSort(NhanVien **&dsNv,int n);
void quickSort(NhanVien **&dsNv,int left,int right);

int main(int argc, char** argv) {
	int n = 3;
	NhanVien **dsNv;
	NhapDanhSachNhanVien(dsNv,n);
	cout<<"danh sach sau khi nhap la : \n";
	XuatDanhSachNhanVien(dsNv,n);
	interchangeSort(dsNv,n);
	cout<<"\ndanh sach sau khi sort theo tuoi la :\n";
	XuatDanhSachNhanVien(dsNv,n);
	return 0;
}

NhanVien *NhapNhanVien(){
	NhanVien *nv = new NhanVien;
	cout<<"nhap ma : ";
	cin>>nv->ma;
	cin.ignore();
	cout<<"nhap ten : ";
	gets(nv->ten);
	cout<<"nhap tuoi : ";
	cin>>nv->tuoi;
	return nv;
}

void XuatNhanVien(NhanVien *nv){
	cout<<nv->ma<<"\t"<<nv->ten<<"\t"<<nv->tuoi<<"\n";
}

void NhapDanhSachNhanVien(NhanVien **&dsNv,int n){
	dsNv = new NhanVien*[n];
	for(int i=0;i<n;i++){
		*(dsNv+i) = NhapNhanVien();
	}
}

void XuatDanhSachNhanVien(NhanVien **dsNV,int n){
	for(int i=0;i<n;i++){
		NhanVien *nv = *(dsNV+i);
		XuatNhanVien(nv);
	}
}

void interchangeSort(NhanVien **&dsNv,int n){
	int i,j;
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			// trong vi du dang sap xep tang dan,neu muon sap xep giam dan chi can doi dieu kien thanh : M[j] > M[i]
			NhanVien *nvj = *(dsNv+j);
			NhanVien *nvi = *(dsNv+i);
			if(nvj->tuoi < nvi->tuoi){
				int ma = nvi->ma;
				char ten[150];
				strcpy(ten,nvi->ten);
				int tuoi = nvi->tuoi;
				
				nvi->ma = nvj->ma;
				strcpy(nvi->ten,nvj->ten);
				nvi->tuoi = nvj->tuoi;
				
				nvj->ma = ma;
				strcpy(nvj->ten,ten);
				nvj->tuoi = tuoi;
			}
		}
	}
}

