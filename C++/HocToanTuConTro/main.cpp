#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int count=100;
	int *m=&count;//hoac int *m;dong tiep theo m=&count;
	cout<<"dia chi cua bien count="<<&count<<endl;
	cout<<"gia tri cua bien count="<<count<<endl;
	cout<<"dia chi cua con tro m="<<m<<endl;
	cout<<"gia tri ma con tro m dang tro toi="<<*m<<endl;
	
	int p=*m;//p la bien thong thuong,co gia tri bang gia tri ma con tro m dang tro toi;
	cout<<"gia tri cua p="<<p<<endl;
	int *x=m;
	cout<<"dia chi cua con tro x="<<x<<endl;
	cout<<"gia tri cua con tro x="<<*x<<endl;
	*x=15;
	cout<<"gia tri ma con tro m dang tro toi="<<*m<<endl;
	cout<<"gia tri cua bien count="<<count<<endl;
	return 0;
}

//	int count=100;
//	int *m=&count;
//	cout<<"dia chi cua bien count="<<&count<<endl;
//	cout<<"gia tri cua bien count="<<count<<endl;
//	cout<<"dia chi cua con tro m="<<m<<endl;
//	cout<<"gia tri ma con tro m dang tro toi="<<*m;
//	
//	int p=*m;
//	cout<<"\ngia tri cua p="<<p;
//	int *x=m;
//	cout<<"\ndia chi cua con tro x="<<x<<endl;
//	cout<<"gia tri ma con tro x tro toi la "<<*x<<endl;
//	*x=15;
//	cout<<"gia tri ma con tro m dang tro toi la "<<*x<<endl;
//	cout<<"gia tri cua bien count="<<count<<endl;
