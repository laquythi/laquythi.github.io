#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void nhapMang(int M[],int n);
void xuatMang(int M[],int n);
void quickSort(int M[],int left,int right);

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu cua mang M[] : \n";
	cin>>n;
	
	int M[n];
	
	nhapMang(M,n);
	cout<<"\nmang ngau nhien la : \n";
	xuatMang(M,n);
	
	quickSort(M,0,n-1);
	cout<<"\nmang sau khi quick sort la : \n";
	xuatMang(M,n);
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

void quickSort(int M[],int left,int right){
	if(left >= right) return;
	int pivot = M[(left + right) / 2];
	int i = left,j = right;
	do{
		while(M[i] < pivot) i++;
		while(M[j] > pivot) j--;
		if(i <= j){
			int temp = M[i];
			M[i] = M[j];
			M[j] = temp;
			i++;
			j--;
		}
	}while(i < j);
	quickSort(M,left,j);
	quickSort(M,i,right);
}
