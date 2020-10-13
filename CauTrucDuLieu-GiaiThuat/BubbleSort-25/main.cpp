#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void nhapMang(int M[],int n);
void xuatMang(int M[],int n);
void sortGiamDan(int M[],int n);
void sortTangDan(int M[],int n);

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu cua mang M[]\n";
	cin>>n;
	int M[n];
	
	nhapMang(M,n);
	cout<<"mang ngau nhien la : \n";
	xuatMang(M,n);
	
	cout<<"\nmang sau khi sap xep giam dan la : \n";
	sortGiamDan(M,n);
	
	cout<<"\nmang sau khi sap xep tang dan la : \n";
	sortTangDan(M,n);
	return 0;
}

void nhapMang(int M[],int n){
	srand(time(NULL));
	for(int i=0;i<n;i++){
		M[i] = rand()%100;
	}
}
	
void xuatMang(int M[],int n)
{
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
}

void sortGiamDan(int M[],int n){
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(M[i] > M[j]){
				int temp = M[i];
				M[i] = M[j];
				M[j] = temp;
			}
		}
	}
	xuatMang(M,n);
}

void sortTangDan(int M[],int n){
		for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(M[i] < M[j]){
				int temp = M[i];
				M[i] = M[j];
				M[j] = temp;
			}
		}
	}
	xuatMang(M,n);
}
