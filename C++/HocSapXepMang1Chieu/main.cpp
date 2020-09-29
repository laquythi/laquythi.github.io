#include <iostream>
#include<time.h>
#include<stdlib.h>
using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	srand(time(NULL));
	int n;
	cout<<"nhap so phan tu:";
	cin>>n;
	int M[n];
	for(int i=0;i<n;i++){
		M[i]=rand()%100;
	}
	cout<<"mang dc nhap ngau nhien la:"<<endl;
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(M[i]>M[j]){
				int tam=M[i];
				M[i]=M[j];
				M[j]=tam;
			}
		}
	}
	cout<<"\nmang sau khi sap xep la:"<<endl;
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
	return 0;
}
