#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	char *str=new char[255];
	cout<<"nhap chuoi:";
	gets(str);
	int n=strlen(str);
	for(int i=0;i<n;i++){
		char c=*(str+i);
		int ascii=(int)c;
		cout<<c<<"=>"<<ascii<<endl;
	}
	return 0;
}

//	char *str=new char[255];
//	cout<<"nhap 1 chuoi:"<<endl;
//	gets(str);
//	int n=strlen(str);//lay kich thuoc that su cua chuoi;
//	for(int i=0;i<n;i++){
//		char c=*(str+i);//lay gia tri ma con tro dang tro den,o day la lay cac ky tu;
//		int ascii=(int)c;
//		cout<<c<<"=>"<<ascii<<endl;
//	}
