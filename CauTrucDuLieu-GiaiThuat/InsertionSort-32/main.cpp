#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void nhapMang(int M[],int n);
void xuatMang(int M[],int n);
void insertionSort(int M[],int n);

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu cua mang M[]\n";
	cin>>n;
	int M[n];
	
	nhapMang(M,n);
	cout<<"mang ngau nhien la : \n";
	xuatMang(M,n);
	
	cout<<"\nmang sau khi insert sort la : \n";
	insertionSort(M,n);
	return 0;
}

void nhapMang(int M[],int n){
	srand(time(NULL));
	for(int i=0;i<n;i++){
		M[i] = rand()%100;
	}
}

void xuatMang(int M[],int n){
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
}

void insertionSort(int M[],int n){
	// luu vi tri can chen
	int pos = 0;
	
	// luu gia tri M[i] tranh bi ghi de khi doi cho cac phan tu
	int x;
	
	// xem doan M[0] da sap xep
	for(int i=0;i<n;i++){
		x = M[i];
		for(pos = i;(pos > 0) && (M[pos - 1] > x );pos-- ){
			M[pos] = M[pos - 1];
		}
		M[pos] = x;
	}
	xuatMang(M,n);
}
