#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int *p;
	p=new int;
	*p=100;
	cout<<"dia chi tai con tro p la:"<<p<<endl;
	cout<<"gia tri tai dia chi ma p tro den la "<<*p;
	delete p;//thu hoi bo nho;
	return 0;
}
//	int *p;
//	p=new int; //cap phat bo nho cho con tro;
//	*p=100;//gan gia tri 100 tai o nho ma p tro toi;
//	cout<<"dia chi tai con tro p="<<p<<endl;
//	cout<<"gia tri tai dia chi ma con tro p tro toi la "<<*p<<endl;
//	delete p;//se bi loi memory leak neu ko thu hoi bo nho;

//	char *p;
//	p=new char;
//	*p='laquythi';
//	cout<<"dia chi tai con tro p="<<p<<endl;
//	cout<<"gia tri tai dia chi ma con tro p tro toi la "<<*p;// ????????????
