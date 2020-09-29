#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct book{
	char title[50];
	char author[50];
	int pages;
	float price;
};
int main(int argc, char** argv) {
	book b;
	cout<<"nhap ten sach:";
	gets(b.title);
	cout<<"nhap tac gia:";
	gets(b.author);
	cout<<"nhap so trang:";
	cin>>b.pages;
	cout<<"nhap gia:";
	cin>>b.price;
	
	book a=b;
	cout<<"ten sach="<<a.title<<endl;
	cout<<"tac gia="<<a.author<<endl;
	cout<<"so trang="<<a.pages<<endl;
	cout<<"gia="<<a.price<<endl;
	a.price=150;
	cout<<"gia cua b.price="<<a.price<<endl;
	return 0;
}

//struct book{
//	char title[50];
//	char author[50];
//	int pages;
//	float price;
//};

//	book b;
//	cout<<"nhap ten sach:";
//	gets(b.title);
//	cout<<"nhap tac gia:";
//	gets(b.author);
//	cout<<"nhap so trang:";
//	cin>>b.pages;
//	cout<<"nhap gia:";
//	cin>>b.price;
//	
//	book a=b;
//	cout<<"\nten sach:"<<a.title<<endl;
//	cout<<"tac gia:"<<a.author<<endl;
//	cout<<"so trang:"<<a.pages<<endl;
//	cout<<"gia tien:"<<a.price<<endl;
//	a.price=1000;
//	cout<<"gia cua b.price="<<b.price<<endl;
