#include <iostream>
#include <string.h>
#include<stdio.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
//	khai bao str1,str2 duoi dang string
//	string str1,str2;
//	cout<<"nhap chuoi 1:";
//	getline(cin,str1);
//	cout<<"chuoi 1 ban vua nhap la:";
//	cout<<str1;
//	
//	cout<<"\nnhap chuoi 2:";
//	getline(cin,str2);
//	cout<<"chuoi 2 ban vua nhap la:";
//	cout<<str2;

//	khai bao str1,str2 duoi dang character
	char str1[20],str2[20],str3[30];
	cout<<"nhap chuoi1:";
	gets(str1);
	cout<<"chuoi 1 sau khi nhap la:"<<str1; // thi 
	
	cout<<"\nnhap chuoi2:";
	gets(str2);
	cout<<"chuoi 2 sau khi nhap la:"<<str2; // la quy
	
	// copy noi dung str2 sang str1
//	strcpy(str1,str2);
//	cout<<"\nchuoi 1 sau khi dc copy la:"<<str1; la quy
	
	// noi chuoi 2 vao chuoi 1
	strcat(str1,str2);
	cout<<"\nchuoi1 sau khi dc noi them chuoi2 la:"<<str1;
	return 0;
}

//	char str1[10],str2[10];
//	cout<<"nhap chuoi 1:"<<endl;
//	gets(str1);
//	cout<<"chuoi 2:"<<endl;
//	strcpy(str2,str1);//sao chep chuoi 1 sang chuoi 2;
//	cout<<str2;
//	
//	char str3[4];
//	strncpy(str3,str1,4);
//	cout<<"\nchuoi str3="<<str3<<endl;
