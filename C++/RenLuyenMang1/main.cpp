#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu trong mang:";
	cin>>n;
	double M[n];
	for(int i=0;i<n;i++){
		cout<<"nhap phan tu thu "<<i<<" ";
		cin>>M[i];
	}
	cout<<"mang sau khi nhap la:";
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
	int i=0;
	int j=0;
	double tam=0;
	do{
		int j=i+1;
		do{
			if(M[i]>M[j]){
				double tam=M[i];
				M[i]=M[j];
				M[j]=tam;
			}
			j++;
		}while(j<n);
		i++;
	}while(i<n-1);
	cout<<"\nmang sau khi sap xep la:"<<endl;
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
	return 0;
}
//	int n;
//	cout<<"nhap vao so phan tu:"<<endl;
//	cin>>n;
//	double M[n];
//	for(int i=0;i<n;i++){
//		cout<<"nhap gia tri cho phan tu thu "<<i<<":";
//		cin>>M[i];
//	}
//	int i=0;
//	do{
//		cout<<M[i]<<"\t";
//		i++;
//	}while(i<n);
//	int i=0;
//	int j=0;
//	do{
//		j=i+1;
//		do{
//			if(M[i]<M[j]){
//				double tam=M[i];
//				M[i]=M[j];
//				M[j]=tam;
//			}
//			j++;
//		}while(j<n);
//		i++;
//	}while(i<n-1);
//	cout<<"mang sau khi sap xep "<<endl;
//	i=0;
//	while(i<n){
//		cout<<M[i]<<"\t";
//		i++;
//	}
