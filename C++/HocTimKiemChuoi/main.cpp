#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
 	char str1[25];
 	strcpy(str1,"la quy thi");
 	char *p=strchr(str1,'i');//tim ky tu 'a' trong chuoi 'thi la quy';
 	if(p!=NULL){
 		cout<<"tim thay ky tu 'a' tai vi tri  "<<p-str1<<" trong chuoi";
	}else{
	 	cout<<"khong tim thay ky tu 'a' trong chuoi";
	}
	 
	char str2[200];
	strcpy(str2,"sang ra bo suoi toi vao hang");
	char *p2=strstr(str2,"hang");//tim chuoi con "hang" trong chuoi goc str2;
	if(p2==NULL){
		cout<<"\nkhong tim thay \"hang\" trong chuoi";
	}else{
		cout<<"\ntim thay \"hang\" tai vi tri thu "<<p2-str2<<" trong chuoi";
	}
	return 0;
}

//	char str1[25];
//	strcpy(str1,"la quy thi");
//	char *p=strchr(str1,'l');//tim ky tu "l" trong chuoi str1(la quy thi);
//	if(p!=NULL){
//		cout<<"tim thay 'l' o vi tri="<<p-str1<<endl;
//	}else{
//		cout<<"khong tim thay 'l' trong chuoi";
//	}
//	char str2[250];
//	strcpy(str2,"dong son dong hung thai binh");
//	char *p2=strstr(str2,"binh");tim kiem 1 chuoi con "binh" trong chuoi goc str2;
//	if(p2==NULL){
//		cout<<"khong tim thay \"binh\" trong chuoi";
//	}else{
//		cout<<"thay \"binh\" o vi tri thu "<<p2-str2<<endl;
//	}
