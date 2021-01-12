#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	char str1[]="LA QUY THI THAI BINH";
	int n1=strlen(str1);//lay ra so luong ky tu trong chuoi str1 ra;
	for(int i=0;i<strlen(str1);i++){ // co the viet ngan gon thanh i < strlen(str1)
//		putchar(str1[i]); // la quy thi thai binh;
		putchar(tolower(str1[i])); // la quy thi thai binh ==> ko can gan tung ky tu cho bien "c" nhu vi du phia duoi
	}
	
	cout<<endl;
	
//	for(int i=0;i<n1;i++){
//		char c=str1[i];//lay 1 ky tu nao do trong vong lap for;
//		putchar(toupper(c));//putchar:xuat ky tu ra,toupper la xuat cac ky tu dang in hoa; LA QUY THI THAI BINH
//	}
	
	cout<<"\n";
//	char str2[]="DONG SON DONG HUNG THAI BINH";
//	int n2=strlen(str2);
//	for(int i=0;i<n2;i++){
//		char c=str2[i];
//		putchar(tolower(c));//tolower la xuat cac ky tu dang in thuong;
//	}
	return 0;
}

//	char str1[]="laquythi thai binh";
//	int n1=strlen(str1);
//	for(int i=0;i<n1;i++){
//		char c=str1[i];
//		putchar(toupper(c));//putchar la xuat ra ky tu,c la 1 ky tu bat ky nao do;
//	}
//	
//	cout<<"\n";
//	char str2[]="DONG SON DONG HUNG THAI BINH";
//	int n2=strlen(str2);
//	for(int i=0;i<n2;i++){
//		char c=str2[i];
//		putchar(tolower(c));
//	}
