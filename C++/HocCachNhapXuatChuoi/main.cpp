#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	char str1[25];
	cout<<"nhap chuoi:";
	gets(str1);// neu dung cin>>str1;khi nhap chuoi ko dc co khoang trang nao,vd nhap 'thi la quy'==>xuat 'thi';
	cout<<"chuoi sau khi nhap:\n";
	cout<<str1;//hoac dung puts(str1);
	
	char *str2=new char[25];
	cout<<"\nnhap chuoi:";
	gets(str2);
	cout<<"xuat chuoi 2:";
	puts(str2);
	
	char *str3=new char[100];
	cout<<"nhap chuoi:";
	cin.getline(str3,100);
	cout<<"chuoi sau khi nhap:";
	puts(str3);
	
	cout<<"kich thuoc thuc su ban nhap:"<<strlen(str1);
	return 0;
}
//	char str1[25];
//	cout<<"moi ban nhap chuoi:"<<endl;
//	gets(str1);
//	cout<<"chuoi sau khi nhap:"<<endl;
//	puts(str1);
//	
//	char *str2=new char[25];
//	cout<<"\nmoi ban nhap chuoi:"<<endl;
//	gets(str2);
//	cout<<"chuoi sau khi nhap:"<<endl;
//	puts(str2);
//	
//	char str3[100];
//	cout<<"nhap 1 chuoi:"<<endl;
//	cin.getline(str3,100);
//	cout<<"chuoi sau khi nhap:"<<endl;
//	cout<<str3<<endl;
//	
//	cout<<"kich thuoc thuc su ban nhap:"<<strlen(str1)<<endl;
