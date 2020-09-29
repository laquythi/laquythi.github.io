#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int a=20,b=15;
	int *pa,*pb,temp;
	pa=&a;
	pb=&b;
	temp=*pa;
	*pa=*pb;
	*pb=temp;
	cout<<"a="<<a<<endl;
	cout<<"b="<<b<<endl;
	cout<<"dia chi cua con tro pa="<<pa<<endl;
	pa++;
	cout<<"dia chi cua con tro pa="<<pa<<endl;
	pa--;
	cout<<"dia chi cua con tro pa="<<&a<<endl;
	return 0;
}
//	int a=20,b=15;
//	int *pa,*pb,temp;
//	pa=&a;
//	pb=&b;
//	temp=*pa;//temp=20;
//	*pa=*pb;//*pa=15(*pb) boi vi *pb=15;
//	*pb=temp;//*pb=20 xuat ra a=15 b=20; co phan giong voi thuat toan noi bot (bugbersort)
//	cout<<"a="<<a<<endl;
//	cout<<"b="<<b<<endl;
//	cout<<"dia chi cua con tro pa="<<pa<<endl;
//	pa++;
//	cout<<"dia chi cua con tro pa="<<pa<<endl;
