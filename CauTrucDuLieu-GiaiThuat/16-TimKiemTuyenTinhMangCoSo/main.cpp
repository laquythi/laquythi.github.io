#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void NhapMang(int M[],int n);
void XuatMang(int M[],int n);
int LinearSearch(int M[],int n,int x);
int main(int argc, char** argv) {
	int n = 5;
	int M[n];
	NhapMang(M,n);
	cout<<"mang sau khi nhap ngau nhien la \n";
	XuatMang(M,n);
	int x;
	cout<<"\n nhap phan tu can tim:";
	cin>>x;
	int i;
	int kq = LinearSearch(M,n,x);
	if(kq == -1){
		cout<<"ko co phan tu "<<x<<" trong mang";
	}else{
		cout<<"phan tu "<<x<<" xuat hien tai vi tri "<<kq;
	}
	return 0;
}
void NhapMang(int M[],int n){
	srand(time(NULL));
	for(int i=0;i<n;i++){
	M[i] = rand()%100;
	}
}
void XuatMang(int M[],int n){
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
}
int LinearSearch(int M[],int n,int x){
	for(int i=0;i<n;i++){
		if(M[i] == x){
			return i;
		}
	}
	return -1;
}
