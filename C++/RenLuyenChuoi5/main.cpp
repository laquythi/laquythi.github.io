#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void xoakhoangtrang(char *str){
	int j=0;
	for(int i=0;i<strlen(str);i++){
		if(str[i]!=' '){
			str[j++]=str[i];
		}else if(j>0&&str[i+1]!=' '){
			str[j++]=str[i];
		}
	}
	if(str[j-1]==' '){
		str[j-1]='\0';
	}else{
		str[j]='\0';
	}
}
char *layten(char *str){
	int k=0;
	for(int i=strlen(str);i>=0;i--){
		if(str[i]==' '){
			k=i+1;
			break;
		}
	}
	char *strten=new char[10];
	int i2=0;
	for(int i=k;i<strlen(str);i++){
		strten[i2++]=str[i];
	}
	return strten;
}

int main(int argc, char** argv) {
	char *str=new char[255];
	strcpy(str,"  la   quy hong anh");
	cout<<"chuoi ban dau la:"<<str<<endl;
	cout<<"chieu dai chuoi la:"<<strlen(str)<<endl;
	xoakhoangtrang(str);
	cout<<"chuoi sau khi xoa khoang trang la:"<<str<<endl;
	cout<<"chieu dai chuoi la:"<<strlen(str)<<endl;
	
	char *ten=layten(str);
	cout<<"ten="<<ten<<endl;
	return 0;
}

//void xoakhoangtrang(char *str){
//	int j=0;
//	for(int i=0;i<strlen(str);i++){
//		if(str[i]!=' '){
//			str[j++]=str[i];
//		}else if(j>0&&str[i+1]!=' '){
//			str[j++]=str[i];
//		}
//	}
//	if(str[j-1]==' '){
//		str[j-1]='\0';
//	}else{
//		str[j]='\0';
//	}
//}

//	char *str=new char[255];
//	strcpy(str,"  nguyen thi   thu trang");
//	cout<<"chuoi ban dau:"<<str<<endl;
//	cout<<"chieu dai="<<strlen(str)<<endl;
//	xoakhoangtrang(str);
//	cout<<"chuoi sau khi xoa khoang trang:"<<str<<endl;
//	cout<<"chieu dai="<<strlen(str)<<endl;
//	char *ten=layten(str);
//	cout<<"ten="<<ten<<endl;

//char *layten(char *str){
//	int k=0;
//	for(int i=strlen(str);i>=0;i--){
//		if(str[i]==' '){
//			k=i+1;
//			break;
//		}
//	}
//	char *strten=new char[10];
//	int i2=0;
//	for(int i=k;i<strlen(str);i++){
//		strten[i2++]=str[i];
//	}
//	return strten;
//}
