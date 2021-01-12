#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	string str1;
	cout<<"nhap chuoi 1:";
	getline(cin,str1);
	cout<<"\nchuoi 1 sau khi nhap la :";
	cout<<str1;
	cout<<"\nkich thuoc chuoi1 ban vua nhap la "<<str1.length();
	
//	char str1[20];
//	cout<<"nhap chuoi 1:";
//	gets(str1);// neu dung cin>>str1;khi nhap chuoi ko dc co khoang trang nao,vd nhap 'thi la quy'==>xuat 'thi';
//	cout<<"chuoi1 sau khi nhap:";
//	cout<<str1;//hoac dung puts(str1);
//	
//	char *str2=new char[25];
//	cout<<"\nnhap chuoi 2:";
//	gets(str2);
//	cout<<"xuat chuoi 2:";
//	puts(str2);
//	
//	char *str3=new char[100];
//	cout<<"nhap chuoi 3:";
//	cin.getline(str3,100);
//	cout<<"chuoi 3 sau khi nhap:";
//	puts(str3);
//	
//	cout<<"kich thuoc thuc su ban nhap:"<<strlen(str1);

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
