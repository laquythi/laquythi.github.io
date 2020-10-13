#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void nhapMang(int M[],int n);
void xuatMang(int M[],int n);
void interchangeSort(int M[],int n);

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu cua mang M[] : \n";
	cin>>n;
	
	int M[n];
	
	nhapMang(M,n);
	cout<<"\nmang ngau nhien la : \n";
	xuatMang(M,n);
	
	cout<<"\nmang sau khi interchange sort la : \n";
	interchangeSort(M,n);
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

void interchangeSort(int M[],int n){
	int i,j;
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			// trong vi du dang sap xep tang dan,neu muon sap xep giam dan chi can doi dieu kien thanh : M[j] > M[i]
			if(M[j] < M[i]){
				int temp = M[i];
				M[i] = M[j];
				M[j] = temp;
			}
		}
	}
	xuatMang(M,n);
}
