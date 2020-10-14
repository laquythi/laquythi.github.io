#include <iostream>
#include <string.h>
#include <stdio.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct SanPham{
	int ma;
	char ten[150];
	float gia;
};
void NhapDanhSach(SanPham dsSp[],int n);
void XuatDanhSach(SanPham dsSp[],int n);
SanPham * TimSanPham(SanPham dsSp[],int n,float giatim);
int main(int argc, char** argv) {
	int n;
	cout<<"nhap so san pham:";
	cin>>n;
	SanPham dsSp[n];
	NhapDanhSach(dsSp,n);
	cout<<"san pham sau khi nhap:"<<endl;
	XuatDanhSach(dsSp,n);
	float giatim;
	cout<<"nhap gia muon tim:";
	cin>>giatim;
	SanPham *sp=TimSanPham(dsSp,n,giatim);
	if(sp==NULL){
		cout<<"ko thay san pham co gia = "<<giatim;
	}else{
		cout<<sp->ma<<"\t"<<sp->ten<<"\t"<<sp->gia;
	}
	return 0;
}
void NhapDanhSach(SanPham dsSp[],int n){
	for(int i=0;i<n;i++){
		cout<<"nhap san pham thu "<<i<<endl;
		cout<<"ma:";
		cin>>dsSp[i].ma;
		cin.ignore();
		cout<<"ten:";
		gets(dsSp[i].ten);
		cout<<"gia:";
		cin>>dsSp[i].gia;
	}
}
void XuatDanhSach(SanPham dsSp[],int n){
	for(int i=0;i<n;i++){
		SanPham sp=dsSp[i];
		cout<<sp.ma<<"\t"<<sp.ten<<"\t"<<sp.gia<<endl;
	}
}
SanPham * TimSanPham(SanPham dsSp[],int n,float giatim){
	int left = 0;
	int right = n-1;
	int mid = 0;
	do{
		mid = (left+right)/2;
		SanPham sp=dsSp[mid];
		if(sp.gia == giatim){
			return &sp;
		}else if(sp.gia>giatim){
			right = mid-1;
		}else{
			left = mid + 1;
		}
	}while(left<=right);
	return NULL;
}
