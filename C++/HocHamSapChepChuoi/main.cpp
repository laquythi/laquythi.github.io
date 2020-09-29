#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	char str1[25],str2[25];
	cout<<"nhap chuoi 1:";
	gets(str1);
	cout<<"chuoi 2:";
	strcpy(str2,str1);//sao chep toan bo chuoi 1 sang chuoi 2;
	cout<<str2;
	
	char str3[5];
	strncpy(str3,str1,3);
	cout<<"\nstr3="<<str3;
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
