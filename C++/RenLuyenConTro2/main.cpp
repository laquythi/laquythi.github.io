#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void nhapmang(int *&a,int n);//cap phat bo nho cho con tro,nhap gia tri cho con tro
void xuatmang(int *a,int n);//con tro cap 1 tuong duong mang 1 chieu,con tro cap 2 td mang 2 chieu
void sapxepmang(int *&a,int n);
void swap(int *&pa,int *&pb);
int main(int argc, char** argv) {
	int *a;
	int n=10;
	nhapmang(a,n);
	cout<<"mang sau khi nhap ngau nhien la:"<<endl;
	xuatmang(a,n);
	cout<<"\nmang sau khi sap xep la:"<<endl;
	sapxepmang(a,n);
	xuatmang(a,n);
	return 0;
}
void nhapmang(int *&a,int n){
	srand(time(NULL));
	a=new int[n];
	for(int i=0;i<n;i++){
		*(a+i)=rand()%101;
	}
}
void xuatmang(int *a,int n){
	for(int i=0;i<n;i++){
		cout<<*(a+i)<<"\t";
	}
}
void sapxepmang(int *&a,int n){
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(*(a+i)<*(a+j)){
				int *a1=(a+i);
				int *a2=(a+j);
				swap(a1,a2);
			}
		}
	}
}
void swap(int *&pa,int *&pb){
	int temp=*pa;
	*pa=*pb;
	*pb=temp;
}

//	int *a;
//	int n=10;
//	nhapmang(a,n);
//	cout<<"mang sau khi nhap la:"<<endl;
//	xuatmang(a,n);
//	cout<<"\nmang sau khi sap xep la:"<<endl;
//	sapxepmang(a,n);
//	xuatmang(a,n);

//void nhapmang(int *&a,int n){
//	srand(time(NULL));
//	a=new int[n];
//	for(int i=0;i<n;i++){
//		*(a+i)=rand()%101;//=1+rand()%100
//	}
//}
//void xuatmang(int *a,int n){
//	for(int i=0;i<n;i++){
//		cout<<*(a+i)<<"\t";
//	}
//}
//
//void sapxepmang(int *&a,int n){
//	for(int i=0;i<n-1;i++){
//		for(int j=i+1;j<n;j++){
//			if(*(a+i)<*(a+j)){
//				int *a1=(a+i);
//				int *a2=(a+j);
//				swap(a1,a2);
//			}	
//		}
//	}
//}
//void swap(int *&pa,int *&pb){
//	int temp=*pa;
//	*pa=*pb;
//	*pb=temp;
//}

