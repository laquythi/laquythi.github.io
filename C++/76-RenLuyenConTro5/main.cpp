#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int * capphatbonho(int n);
void nhapmang(int *&pM,int n);
void xuatmang(int *pM,int n);
int *danhsachmax(int *pM,int n);
void sapxepgiamdan(int *&pM,int n);
int main(int argc, char** argv) {
	int *pM=capphatbonho(5);
	nhapmang(pM,5);
	cout<<"mang sau khi nhap:"<<endl;
	xuatmang(pM,5);
	int *pX=danhsachmax(pM,5);
	cout<<"\n3 phan tu lon nhat la:"<<endl;
	xuatmang(pX,3);
	return 0;
}
int * capphatbonho(int n){
	int *pM=new int[n];
	return pM;
}
void nhapmang(int *&pM,int n){
	for(int i=0;i<n;i++){
		cout<<"nhap phan tu thu "<<i<<":";
		cin>>*(pM+i);
	}
}
void xuatmang(int *pM,int n){
	for(int i=0;i<n;i++){
		cout<<*(pM+i)<<"\t";
	}
}
int *danhsachmax(int *pM,int n){
	int m=n>3?3:n;
	int *pX=capphatbonho(m);
	sapxepgiamdan(pM,n);
	for(int i=0;i<m;i++){
		*(pX+i)=*(pM+i);
	}
	return pX;
}
void sapxepgiamdan(int *&pM,int n){
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			int a=*(pM+i);
			int b=*(pM+j);
			if(a<b){
				int temp=*(pM+i);
				*(pM+i)=*(pM+j);
				*(pM+j)=temp;
			}
		}
	}
}

//	int *pM=capphatbonho(5);
//	nhapmang(pM,5);
//	cout<<"du lieu sau khi nhap:\n";
//	xuatmang(pM,5);
//	int *pX=danhsachmax(pM,5);
//	cout<<"\n3 phan tu lon nhat la:"<<endl;
//	xuatmang(pX,3);

//int * capphatbonho(int n){
//	int *pM=new int[n];
//	return pM;
//}
//void nhapmang(int *&pM,int n){
//	for(int i=0;i<n;i++){
//		cout<<"nhap phan tu thu "<<i<<":";
//		cin>>*(pM+i);
//	}
//}
//void xuatmang(int *pM,int n){
//	for(int i=0;i<n;i++){
//		cout<<*(pM+i)<<"\t";
//	}
//}
//int *danhsachmax(int *pM,int n){
//	int m=n>3?3:n;
//	int *pX=capphatbonho(m);
//	sapxepgiamdan(pM,n);
//	for(int i=0;i<m;i++){
//		*(pX+i)=*(pM+i);
//	}
//	return pX;
//}
//void sapxepgiamdan(int *&pM,int n){
//	for(int i=0;i<n-1;i++){
//		for(int j=i+1;j<n;j++){
//			int a=*(pM+i);
//			int b=*(pM+j);
//			if(a<b){
//				int temp=*(pM+i);
//				*(pM+i)=*(pM+j);
//				*(pM+j)=temp;
//			}
//		}
//	}
//}
