#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	char str[25];
	cout<<"nhap chuoi:";//nhap vao 1 chuoi,ra ra chuoi nguoc lai,vd"abc"=>"cba";
	gets(str);
	for(int i=strlen(str)-1;i>=0;i--){
		cout<<str[i];
	}
	return 0;
}

//	char str[255];
//	cout<<"moi ban nhap 1 chuoi:"<<endl;
//	gets(str); //cin.getline(str,255);
//	for(int i=strlen(str)-1;i>=0;i--){
//		cout<<str[i];//puts(str);
//	}

//	char str[100];
//	cout<<"moi ban nhap vao 1 chuoi:"<<endl;
//	gets(str);
//	cout<<"chuoi sau khi dao nguoc la:"<<endl;
//	for(int i=strlen(str)-1;i>=0;i--){
//		cout<<str[i]; //puts(str); o day dung puts ko dc???????????????/
//	}
