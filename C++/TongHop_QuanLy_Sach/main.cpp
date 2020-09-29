#include <iostream>
#include <fstream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct book{
	char ISBN[20];
	char ten[255];
	int trang;
	char tacgia[100];
};

void nhapsach(book &b){
	cout<<"nhap ISBN:";
	gets(b.ISBN);
	cout<<"nhap ten:";
	gets(b.ten);
	cout<<"nhap trang:";
	cin>>b.trang;
	cin.ignore();
	cout<<"nhap tac gia:";
	gets(b.tacgia);
}

void nhapdanhsach(book dssach[],int n){
	for(int i=0;i<n;i++){
		cout<<"nhap sach thu "<<i<<endl;
		nhapsach(dssach[i]);
	}
}

void xuatsach(book b){
	cout<<b.ISBN<<"\t"<<b.ten<<"\t"<<b.tacgia<<"\t"<<b.trang<<endl;
}

void xuatdanhsach(book dssach[],int n){
	for(int i=0;i<n;i++){
		xuatsach(dssach[i]);
	}
}

void luufile(book dssach[],int n){
	ofstream outfile("csdlbook.txt",ofstream::binary);
	for(int i=0;i<n;i++){
		book b=dssach[i];
		outfile.write((char *)&b,sizeof(book));
	}
	outfile.close();
}

void docfile(book dssach[],int &n){
	ifstream infile("csdlbook.txt",ifstream::binary);
	infile.seekg(0,infile.end);//lay dung luong;
	long size=infile.tellg();//lay kich thuoc;
	infile.seekg(0);
	n=size/sizeof(book);
	for(int i=0;i<n;i++){
		book b;
		infile.read((char*)&b,sizeof(book));
		dssach[i]=b;
	}
	infile.close();
}

void timsach(book dssach[],int n,char *tg){
	for(int i=0;i<n;i++){
		book b=dssach[i];
		int kq=strcmp(b.tacgia,tg);
		if(kq==0){
			xuatsach(b);
		}
	}
}

void sapxep(book dssach[],int n){
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			book b1=dssach[i];
			book b2=dssach[j];
			if(b1.trang<b2.trang){
				dssach[i]=b2;
				dssach[j]=b1;
			}
		}
	}
}

void xuattop3(book dssach[],int n){
	int m=n<3?n:3;
	for(int i=0;i<m;i++){
		xuatsach(dssach[i]);
	}
}

int main(int argc, char** argv) {
	/*book dssach[5];
	nhapdanhsach(dssach,5);
	cout<<"sach sau khi nhap:\n";
	xuatdanhsach(dssach,5);
	luufile(dssach,5);*/
	
	int max=1000;
	book dssach[max];
	int n;
	docfile(dssach,n);
	xuatdanhsach(dssach,n);
	cout<<"nhap tac gia:";
	char tg[100];
	gets(tg);
	timsach(dssach,n,tg);
	sapxep(dssach,n);
	cout<<"\nsau khi sort:\n";
	xuatdanhsach(dssach,n);
	cout<<"\n-----------------------\n";
	cout<<"top 3:\n";
	xuattop3(dssach,n);
	return 0;
}
