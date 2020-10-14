#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void NhapMang(float F[],int n);
void XuatMang(float F[],int n);
int BinarySearch(float F[],int n,float x);
int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu:"; 
	cin>>n;
	float F[n];
	NhapMang(F,n);
	cout<<"mang sau khi nhap:"<<endl;
	XuatMang(F,n);
	float x;
	cout<<"nhap so muon tim:";
	cin>>x;
	int kq = BinarySearch(F,n,x);
	if(kq == -1){
		cout<<x<<" ko co trong mang";
	}else{
		cout<<x<<" o vi tri = "<<kq;
	}
	return 0;
}
void NhapMang(float F[],int n){
	for(int i=0;i<n;i++){
		cout<<"F["<<i<<"]="; 
		cin>>F[i];
	}
}
void XuatMang(float F[],int n){
	for(int i=0;i<n;i++){
		cout<<F[i]<<"\t";
	}
}
int BinarySearch(float F[],int n,float x){
	int left = 0;
	int right = n-1;
	int mid;
	do{
		mid = (left + right)/2;
		if(F[mid] == x){
			return mid;
		}else if(F[mid] > x){
			left = mid + 1;
		}else{
			right = mid - 1;
		}
	}while(left <= right);
	return -1;
}
