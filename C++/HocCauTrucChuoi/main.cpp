#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	char *str="hello";
	cout<<str<<endl;
	char str2[]="thi la quy";
	cout<<str2<<endl;
	char str3[]={'t','h','i'};
	cout<<str3<<endl;
	char str4[13];
	str4[0]='t';
	str4[1]='h';
	str4[2]='u';
	cout<<str4<<endl;
	return 0;
}

//	char *str="hello";
//	cout<<str<<endl;
//	char str2[]="la quy thi";
//	cout<<str2<<endl;
//	char str3[]={'l','a',' ','t','h','i'};//ko can ky tu cuoi cung '\0' van dc?????
//	cout<<str3<<endl;
//	char str4[4];
//	str4[0]='c';
//	str4[1]='+';
//	str4[2]='+';
//	str4[3]='\0';
//	cout<<str4;
