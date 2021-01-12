#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int a[]={7,5,3,2,1};
	int *p = a;
	
//	for(int i=0;i<sizeof(a)/sizeof(a[0]);i++){
//		cout<<a[i]<<"\t";
//		// in ra cac phan tu trong mang a[]
//	}
//	cout<<"\n";
	// cach viet 1
//	for(int i=0;i<sizeof(a)/sizeof(a[0]);i++){
//		cout<<*(p+i)<<"\t";
//	}
	
	// cach viet 2
	for(p=&a[0];p<=&a[4];p++){
		cout<<*p<<"\t";
	}


//	*(p+3)=113;
//	for(int i=0;i<5;i++){
//		cout<<a[i]<<"\t";//di chuyen toi o nho thu i,vd i=0==>p+0=0
//	}
//	cout<<endl;
//	for(int i=0;i<5;i++){
//		cout<<p[i]<<"\t";
//	}
	return 0;
}
//	int a[]={4,5,6,24,0,12};
//	for(int i=0;i<6;i++){
//		cout<<a[i]<<"\t";
//	}
//	cout<<endl;
//	int *p=a;
//	for(int  i=0;i<6;i++){
//		cout<<*(p+i)<<"\t";
//	}
//	*(p+3)=113;
//	cout<<endl;
//	for(int i=0;i<6;i++){
//		cout<<a[i]<<"\t";
//	}
//	cout<<endl;
//	for(int i=0;i<6;i++){
//		cout<<p[i]<<"\t";
//	}
