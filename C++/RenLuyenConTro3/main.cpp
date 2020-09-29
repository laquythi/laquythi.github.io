#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void nhapmatran(int **&M,int n);
void xuatmatran(int **M,int n);
int max(int **M,int n);
int main(int argc, char** argv) {
	 int **M;
	 int n=5;
	 nhapmatran(M,n);
	 cout<<"ma tran sau khi nhap la:"<<endl;
	 xuatmatran(M,n);
	 int m=max(M,n);
	 cout<<"Max="<<m<<endl;
	return 0;
}

void nhapmatran(int **&M,int n){
	srand(time(NULL));
	M=new int*[n];
	for(int i=0;i<n;i++){
		*(M+i)=new int[n];
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			*(*(M+i)+j)=-50+rand()%151;
		}
	}
}
void xuatmatran(int **M,int n){
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cout<<*(*(M+i)+j)<<"\t";
		}
		cout<<"\n";
	}
}
int max(int **M,int n){
	int m=*(*(M+0)+0);
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(m<*(*(M+i)+j)){
				m=*(*(M+i)+j);
			}
		}
	}
	return m;
}
//	int **M;//khai bao con tro cap 2;
//	int n=5;
//	nhapmatran(M,n);
//	cout<<"ma tran sau khi nhap la:"<<endl;
//	xuatmatran(M,n);
//	int m=max(M,n);
//	cout<<"MAX="<<m<<endl;

//void nhapmatran(int **&M,int n){
//	srand(time(NULL));
//	M=new int*[n];
//	for(int i=0;i<n;i++){
//		*(M+i)=new int[n];
//	}
//	for(int i=0;i<n;i++){
//		for(int j=0;j<n;j++){
//			*(*(M+i)+j)=-50+rand()%151;
//		}
//	}
//}
//void xuatmatran(int **M,int n){
//	for(int i=0;i<n;i++){
//		for(int j=0;j<n;j++){
//			cout<<*(*(M+i)+j)<<"\t";
//		}
//		cout<<endl;
//	}
//}
//int max(int **M,int n){
//	int m=*(*(M+0)+0); //*(*(M+i)+j);
//	for(int i=0;i<n;i++){
//		for(int j=0;j<n;j++){
//			if(m<*(*(M+i)+j)){
//				m=*(*(M+i)+j);
//			}
//		}
//	}
//	return m;
//}
