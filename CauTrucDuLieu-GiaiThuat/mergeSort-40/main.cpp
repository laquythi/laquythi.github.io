#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void nhapMang(int M[],int n);
void xuatMang(int M[],int n);
void mergeSort(int M[],int left,int fight);
void merge(int M[],int left,int mid,int right);

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu cua mang M[] : \n";
	cin>>n;
	
	int M[n];
	
	nhapMang(M,n);
	cout<<"\nmang sau khi nhap la : \n";
	xuatMang(M,n);
	
	mergeSort(M,0,n-1);
	cout<<"\nmang sau khi sap xep la : \n";
	xuatMang(M,n);
	
	return 0;
}

void nhapMang(int M[],int n){
	for(int i=0;i<n;i++){
		cout<<"nhap M["<<i<<"] ";
		cin>>M[i];
	}
}

void xuatMang(int M[],int n){
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
}

void mergeSort(int M[],int left,int right){
	if(left >= right) return;
	int mid = (left + right) / 2;
	mergeSort(M,left,mid);
	mergeSort(M,mid + 1,right);
	merge(M,left,mid,right);
}

void merge(int M[],int left,int mid,int right){
	int ntemp = right - left + 1;
	int temp[ntemp];
	int pos = 0;
	int i = left;
	int j = mid + 1;
	while(!(i > mid && j > right)){
		if((i <= mid && j <= right && M[i]<M[j]) || j > right){
			temp[pos++] = M[i++];
		}else{
			temp[pos++] = M[j++];
		}
	}
	for(int i=0;i<ntemp;i++){
		M[left + i] = temp[i];
	}
}

