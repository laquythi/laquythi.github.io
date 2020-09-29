#include <iostream>
#include <fstream>
#include <string.h>
using namespace std;
#define MAX 3
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct sanpham{
	int ma;
	char ten[255];
	int gia;
};

void nhapsanpham(sanpham &sp);
void nhapdanhsachsanpham(sanpham dssp[],int n);
void xuatsanpham(sanpham sp);
void xuatdanhsachsanpham(sanpham dssp[],int n);
void luufile(sanpham dssp[],int n);
void docfile(sanpham dssp[],int n);
int main(int argc, char** argv) {
	/*sanpham dssp[MAX];
	nhapdanhsachsanpham(dssp,MAX);
	cout<<"danh sach san pham sau khi nhap:"<<endl;
	xuatdanhsachsanpham(dssp,MAX);
	luufile(dssp,MAX);*/
	sanpham dssp[MAX];
	int n;
	docfile(dssp,n);
	xuatdanhsachsanpham(dssp,n);
	return 0;
}

void nhapsanpham(sanpham &sp){
	cout<<"ma:";
	cin>>sp.ma;
	cin.ignore();
	cout<<"ten:";
	gets(sp.ten);
	cout<<"gia:";
	cin>>sp.gia;
}

void nhapdanhsachsanpham(sanpham dssp[],int n){
	for(int i=0;i<n;i++){
		cout<<"nhap san pham thu "<<i<<":\n";
		nhapsanpham(dssp[i]);
	}
}

void xuatsanpham(sanpham sp){
	cout<<sp.ma<<"-"<<sp.ten<<"-"<<sp.gia<<endl;
}

void xuatdanhsachsanpham(sanpham dssp[],int n){
	for(int i=0;i<n;i++){
		cout<<"nhap san pham thu "<<i<<":\n";
		xuatsanpham(dssp[i]);
	}
}

void luufile(sanpham dssp[],int n){
	ofstream outfile("csdlsp.dat",ofstream::binary);
	for(int i=0;i<n;i++){
		sanpham sp=dssp[i];
		outfile.write((char *)&sp,sizeof(sanpham));
	}
	outfile.close();
}

void docfile(sanpham dssp[],int n){
	ifstream infile("csdlsp.dat",ifstream::binary);
	int i=0;
	while(infile.eof()==false){
		sanpham sp;
		infile.read((char *)&sp,sizeof(sanpham));
		dssp[i++]=sp;
	}
	infile.close();
	n=i;
}
