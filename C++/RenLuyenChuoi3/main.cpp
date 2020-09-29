#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void tachlaytrai(char *strgoc,char *&strdau,char *&strsau);
void tachlayphai(char *strgoc,char *&strcuoi,char *&strtruoc);
int main(int argc, char** argv) {
	char *strgoc=new char[255];
	strcpy(strgoc,"Obama biladen");//tach
	char *strdau=new char[255];//lay
	char *strsau=new char[255];//ky tu 
	tachlaytrai(strgoc,strdau,strsau);//dau tien
	cout<<strdau<<endl;//ben
	cout<<strsau<<endl;//trai;
	
	cout<<"\n-------------------\n";
	char *strcuoi=new char[255];//tach
	char *strtruoc=new char[255];//lay
	strcpy(strcuoi,"");//ky tu
	strcpy(strtruoc,"");//dau
	tachlayphai(strgoc,strcuoi,strtruoc);//tien
	cout<<strcuoi<<endl;//ben
	cout<<strtruoc<<endl;//phai
	return 0;
}
void tachlaytrai(char *strgoc,char *&strdau,char *&strsau){
	//nguyen van minh;
	char *p=strchr(strgoc,' ');
	int lspace=p-strgoc;
	strncpy(strdau,strgoc,lspace);
	p=p+1;
	strsau=p;
}

void tachlayphai(char *strgoc,char *&strcuoi,char *&strtruoc){
	//nguyen van minh;
	int j=0;//tao 1 bien tam;
	for(int i=strlen(strgoc)-1;i>=0;i--){
		if(strgoc[i]==' '){
			j=i+1;
			break;
		}
	}
	int i2=0;
	for(int i=j;i<strlen(strgoc);i++){
		strcuoi[i2]=strgoc[i];
		i2++;
	}
	strncpy(strtruoc,strgoc,j-1);
}
//void tachlayphai(char *strgoc,char *&strcuoi,char *&strtruoc){
//	int j=0;
//	for(int i=strlen(strgoc)-1;i>=0;i--){
//		if(strgoc[i]==' '){
//			j=i+1;
//			break;
//		}
//	}
//	int i2=0;
//	for(int i=j;i<strlen(strgoc);i++){
//		strcuoi[i]=strgoc[i];
//		i2++;
//	}
//	strncpy(strtruoc,strgoc,j-1);
//}

//	char *strgoc=new char [255];
//	strcpy(strgoc,"obama va putin an baba");
//	char *strdau=new char [255];
//	char *strsau=new char [255];
//	tachlaytrai(strgoc,strdau,strsau);
//	cout<<strdau<<endl;
//	cout<<strsau<<endl;
//	cout<<"\n---------------\n";
//	char *strcuoi=new char[255];
//	char *strtruoc=new char[255];
//	strcpy(strcuoi,"");
//	strcpy(strtruoc,"");
//	tachlayphai(strgoc,strcuoi,strtruoc);
//	cout<<strcuoi<<endl;
//	cout<<strtruoc<<endl;

//	char *p=strchr(strgoc,' ');
//	int lspace=p-strgoc;
//	strncpy(strdau,strgoc,lspace);
//	p=p+1;
//	strsau=p;
