#include <iostream>
#include <string.h>
#include <stdio.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct Book{
	int ma;
	char ten[150];
	int nam;
};
void NhapDanhSach(Book dsBook[],int n);
void XuatDanhSach(Book dsBook[],int n);
int SoSachTimDuoc = 0;
Book *TimSachTheoNamXuatBan(Book dsBook[],int n,int year);
int main(int argc, char** argv) {
	int n;
	cout<<"nhap so cuon sach:";
	cin>>n;
	Book dsBook[n];
	NhapDanhSach(dsBook,n);
	cout<<"sach sau khi nhap:"<<endl;
	XuatDanhSach(dsBook,n);
	cout<<"\nnhap nam muon tim:";
	int year;
	cin>>year;
	Book *dsBookTimDuoc = TimSachTheoNamXuatBan(dsBook,n,year);
	if(SoSachTimDuoc == 0){
		cout<<"ko co cuon sach nao co nam xuat ban = "<<year;
	}else{
		 cout<<"\ncac sach tim thay:\n";
		 XuatDanhSach(dsBookTimDuoc,SoSachTimDuoc);
	}
	return 0;
}
void NhapDanhSach(Book dsBook[],int n){
	for(int i=0;i<n;i++){
		cout<<"nhap sach thu "<<i<<endl;
		cout<<"ma: ";
		cin>>dsBook[i].ma;
		cin.ignore();
		cout<<"ten:";
		gets(dsBook[i].ten);
		cout<<"nam xuat ban:";
		cin>>dsBook[i].nam;
	}
}
void XuatDanhSach(Book dsBook[],int n){
	for(int i=0;i<n;i++){
		Book b=dsBook[i];
		cout<<b.ma<<"\t"<<b.ten<<"\t"<<b.nam<<endl;
	}
}
Book *TimSachTheoNamXuatBan(Book dsBook[],int n,int year){
	Book dsTimDuoc[n];
	SoSachTimDuoc = 0;
	for(int i=0;i<n;i++){
		Book b = dsBook[i];
		if(b.nam == year){
			dsTimDuoc[SoSachTimDuoc] = b;
			SoSachTimDuoc++;
		}
	}
	return dsTimDuoc;
}
