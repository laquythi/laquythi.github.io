#include <iostream>
#include <fstream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct nhanvien{
	int ma;
	char ten[50];
};

void xuatnhanvien(nhanvien dsnv[],int n){
	for(int i=0;i<n;i++){
		cout<<dsnv[i].ma<<"\t"<<dsnv[i].ten<<endl;
	}
}

void luufile(){
	nhanvien dsnv[4];//khai bao 1 mang 3 sinh vien;
	dsnv[0].ma=1;
	strcpy(dsnv[0].ten,"teo"); 
	dsnv[1].ma=2;
	strcpy(dsnv[1].ten,"ty");
	dsnv[2].ma=3;
	strcpy(dsnv[2].ten,"bin");
	dsnv[3].ma=4;
	strcpy(dsnv[3].ten,"bo");
	ofstream outfile("csdl.txt",ofstream::binary);
	outfile.write((char*)dsnv,sizeof(dsnv));
	outfile.close();
}

void docfile(){
	ifstream infile("csdl.txt",ifstream::binary);
	infile.seekg(0,infile.end);
	long size=infile.tellg();
	infile.seekg(0);
	int real=size/sizeof(nhanvien);//lay ra kich thuoc that su;
	nhanvien dsnv[real];
	infile.read((char*)dsnv,sizeof(dsnv));
	infile.close();
	xuatnhanvien(dsnv,real);
}
int main(int argc, char** argv) {
	//luufile();
	docfile();
	return 0;
}
