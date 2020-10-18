#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void nhapMang(int M[],int n);
void xuatMang(int M[],int n);
void selectionSort(int M[],int n);
int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu cho mang M[] \n";
	cin>>n;
	
	int M[n];
	nhapMang(M,n);
	
	cout<<"mang sau khi nhap ngau nhien la :  \n";
	xuatMang(M,n);
	
	cout<<"\nmang sau khi selection sort la : \n";
	selectionSort(M,n);
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
void selectionSort(int M[],int n){
	int min;
	for(int i=0;i<n-1;i++){
		// gia su so dau tien trong day la nho nhat (min)
		// dang co BUG,neu nhap so phan tu la chan(1 3 5 7 9....) thi thuat toan dung,neu nhap so ptu le (2 4 6 8 ...) thi sap xep sai
		// resolved BUG
		min = i;
		for(int j=i+1;j<n;j++){
			if(M[j] < M[min]){
				min = j;
			}
		}
		if(min != i){
				int temp = M[i];
				M[i] = M[min];
				M[min] = temp;
			}
	}
	xuatMang(M,n);
}
