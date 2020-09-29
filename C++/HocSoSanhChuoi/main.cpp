#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	char s1[25],s2[25];
	strcpy(s1,"LA QUY THI");
	strcpy(s2,"LA QUY THI");
	int kq=strcmp(s1,s2);//so sanh 2 chuoi s1 s2;
	cout<<"kq="<<kq<<endl;
	if(kq==0){
		cout<<"s1=s2";
	}else if(kq>0){
		cout<<"s1>s2";
	}else{
		cout<<"s1<s2";
	}
	
	char s3[25],s4[25];
	strcpy(s3,"la quy thi");
	strcpy(s4,"laquy thi");
	int kq2=strncmp(s3,s4,6);//so sanh 6 ky tu dau tien cua 2 chuoi s3 s4;
	cout<<"\nkq2="<<kq2<<endl;
	if(kq2==0){
		cout<<"s3=s4";
	}else if(kq2>0){
		cout<<"s3>s4";
	}else{
		cout<<"s3<s4";
	}
	return 0; 
}
//	char s1[25];
//	char s2[25];
//	strcpy(s1,"Xin chao!");
//	strcpy(s2,"la quy thi");
//	int kq=strcmp(s1,s2);
//	cout<<"ket qua="<<kq<<endl;
//	if(kq==0){
//		cout<<"s1=s2"<<endl;
//	}else if(kq<0){
//		cout<<"s1<s2";
//	}else{
//		cout<<"s1>s2";
//	}


//	char s1[20];
//	char s2[20];
//	strcpy(s1,"aBc");
//	strcpy(s2,"abc");
//	int kq=strcmp(s1,s2);
//	cout<<"ket qua="<<kq<<endl;
//	if(kq==0){
//		cout<<"s1=s2";
//	}else if(kq>0){
//		cout<<"s1>s2";
//	}else{
//		cout<<"s1<s2";
//	}
//	
//	char s3[25];
//	char s4[25];
//	strcpy(s3,"1abcdef");
//	strcpy(s4,"2ghijkl");
//	int kq2=strncmp(s3,s4,3);//so sanh 3 ky tu;
//	cout<<"\nket qua 2="<<kq2<<endl;
//	if(kq2==0){
//		cout<<"s3=s4";
//	}else if(kq2>0){
//		cout<<"s3>s4";
//	}else{
//		cout<<"s3<s4";
//	}
