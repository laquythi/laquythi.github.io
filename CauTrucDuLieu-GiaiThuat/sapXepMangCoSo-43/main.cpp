#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void nhapMang(int M[],int n);
void xuatMang(int M[],int n);
void bubbleSort(int M[],int n);
void insertionSort(int M[],int n);
void selectionSort(int M[],int n);
void interchangeSort(int M[],int n);
void quickSort(int M[],int left,int right);
void mergeSort(int M[],int left,int right);
void merge(int M[],int left,int mid,int right);
void menu();

int *M;
int n;

int main(int argc, char** argv) {
	while(true){
		menu();
	}
	
	return 0;
}

void menu(){
	cout<<"\nnhap chuc nang : \n";
	cout<<"1 nhap Mang \n";
	cout<<"2 xuat Mang \n";
	cout<<"3 bubbleSort \n";
	cout<<"4 insertionSort \n";
	cout<<"5 selectionSort \n";
	cout<<"6 interchangeSort \n";
	cout<<"7 quickSort \n";
	cout<<"8 mergeSort \n";
	cout<<"-1 Thoat\n";
	cout<<"\nban chon [1...9]\n";
	int chon;
	cin>>chon;
	
	switch(chon){
		case 1 :
			cout<<"nhap n : ";
			cin>>n;
			if(M != NULL){
				delete M;
				M=NULL;
			}
			M = new int[n];
			nhapMang(M,n);
			break;
		case 2 :
			cout<<"cac phan tu trong mang la : \n";
			xuatMang(M,n);
			break;
		case 3 :
			cout<<"mang sau khi bubble sort la :\n";
			bubbleSort(M,n);
			break;
		case 4 :
			cout<<"mang sau khi insertion sort la :\n";
			insertionSort(M,n);
			break;
		case 5 :
			// dang co BUG o selection sort,chi tiet xem phia noi dung ham
			cout<<"mang sau khi selection sort la :\n";
			selectionSort(M,n);
			break;
		case 6 :
			cout<<"mang sau khi interchange sort la :\n";
			interchangeSort(M,n);
			break;
		case 7 :
			quickSort(M,0,n-1);
			cout<<"\nmang sau khi quick sort la : \n";
			xuatMang(M,n);
			break;
		case 8 :
			mergeSort(M,0,n-1);
			cout<<"\nmang sau khi merge sort la : \n";
			xuatMang(M,n);
			break;
		case 9 :
			exit(0);
		default :
			cout<<"cam on...";
			exit(0);								
	}
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

void bubbleSort(int M[],int n){
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

void selectionSort(int M[],int n){
	int min;
	for(int i=0;i<n-1;i++){
		// gia su so dau tien trong day la nho nhat (min)
		// dang co BUG,neu nhap so phan tu la le(1 3 5 7 9....) thi thuat toan dung,neu nhap so ptu chan (2 4 6 8 ...) thi sap xep sai
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
