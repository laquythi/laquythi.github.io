#include <iostream>
#include <fstream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct sinhvien{
	int ma;
	char ten[250];
	double dtb;
};

sinhvien *nhapsinhvien(){
	sinhvien *nv=new sinhvien();
	cout<<"nhap ma:";
	cin>>nv->ma;
	cin.ignore();
	cout<<"nhap ten:";
	gets(nv->ten);
	cout<<"nhap diem:";
	cin>>nv->dtb;
	return nv;
}

void nhapdanhsachsinhvien(sinhvien **&dssv,int siso){
	for(int i=0;i<siso;i++){
		cout<<"nhap sinh vien thu "<<i<<":\n";
		sinhvien *sv=nhapsinhvien();
		*(dssv+i)=sv;
	}
}

void xuatsinhvien(sinhvien *nv){
	cout<<nv->ma<<"-"<<nv->ten<<"-"<<nv->dtb<<endl;
}

void xuatdanhsachsinhvien(sinhvien **dssv,int siso){
	for(int i=0;i<siso;i++){
		sinhvien *sv=*(dssv+i);
		xuatsinhvien(sv);
	}
}

void luufile(sinhvien **dssv,int siso){
	ofstream outfile("csdlsv.txt",ofstream::binary);//luu dang nhi phan ::binary;
	for(int i=0;i<siso;i++){
		sinhvien *sv=*(dssv+i);
		outfile.write((char *)sv,sizeof(sinhvien));
	}
	outfile.close();
}

void docfile(sinhvien **&dssv,int &siso){
	ifstream infile("csdlsv.txt",ifstream::binary);
	infile.seekg(0,infile.end);
	long size=infile.tellg();
	infile.seekg(0);
	siso=size/sizeof(sinhvien);
	dssv=new sinhvien*[siso];
	for(int i=0;i<siso;i++){
		sinhvien *sv=new sinhvien;
		infile.read((char *)sv,sizeof(sinhvien));
		*(dssv+i)=sv;
	}
	infile.close();
}

int main(int argc, char** argv) {
	/*int siso=3;
	sinhvien **dssv=new sinhvien*[siso];
	nhapdanhsachsinhvien(dssv,siso);
	cout<<"danh sach sinh vien sau khi nhap:"<<endl;
	xuatdanhsachsinhvien(dssv,siso);
	luufile(dssv,siso);*/
	
	int siso;
	sinhvien **dssv=NULL;
	docfile(dssv,siso);
	xuatdanhsachsinhvien(dssv,siso);
	return 0;
}
