#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	char str1[25],str2[25];
	strcpy(str1,"obama");
	strcpy(str2," biladen");
	strcat(str1,str2);
	puts(str1);
	
	char ho[10],ten[10],hovaten[20];
	cout<<"nhap ho:";
	gets(ho);
	cout<<"nhap ten:";
	gets(ten);
	strcpy(hovaten,"");
	strcat(hovaten,ho);
	strcat(hovaten," ");
	strcat(hovaten,ten);
	puts(hovaten);
	
	char str3[25],str4[25];
	strcpy(str3,"coding ");
	strcpy(str4,"is easy");
	strcat(str3,str4);
	//strncat(str3,str4,40);
	puts(str3);
	return 0;
}
//	char str1[25],str2[25];
//	strcpy(str1,"la quy");
//	strcpy(str2," thi");
//	strcat(str1,str2);
//	puts(str1);
//	
//	char ho[25],ten[25],hovaten[50];
//	cout<<"nhap ho:"<<endl;
//	gets(ho);
//	cout<<"nhap ten"<<endl;
//	gets(ten);
//	strcpy(hovaten,"");
//	strcat(hovaten,ho);
//	strcat(hovaten," ");
//	strcat(hovaten,ten);
//	puts(hovaten);
//	
//	char str3[25],str4[25];
//	strcpy(str3,"to be ");
//	strcpy(str4,"or not to be");
//	strncat(str3,str4,6);
//	cout<<"chuoi sau khi noi 1 phan la:"<<endl;
//	puts(str3);
