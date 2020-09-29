#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void nhapmatran(int **&M,int n);
void xuatmatran(int **M,int n);
int **congmatran(int **M1,int **M2,int n);
int main(int argc, char** argv) {
	srand(time(NULL));
	int **M1,**M2,n=3;
	nhapmatran(M1,n);
	nhapmatran(M2,n);
	cout<<"ma tran M1:"<<endl;
	xuatmatran(M1,n);
	cout<<"\nma tran M2:"<<endl;
	xuatmatran(M2,n);
	int **M3=congmatran(M1,M2,n);
	cout<<"\nma tran M3:="<<endl;
	xuatmatran(M3,n);
	return 0;
}
void nhapmatran(int **&M,int n){
	M=new int*[n];
	for(int i=0;i<n;i++){
		*(M+i)=new int[n];
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			*(*(M+i)+j)=rand()%11;
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
int **congmatran(int **M1,int **M2,int n){
	int **M3=new int*[n];
	for(int i=0;i<n;i++){
		*(M3+i)=new int[n];
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			*(*(M3+i)+j)=*(*(M1+i)+j)+*(*(M2+i)+j);
		}
	}
	return M3;
}

//	srand(time(NULL));
//	int **M1,**M2,n=3;
//	nhapmatran(M1,n);
//	nhapmatran(M2,n);
//	cout<<"ma tran M1\n";
//	xuatmatran(M1,n);
//	cout<<"\nma tran M2\n";
//	xuatmatran(M2,n);
//	int **M3=congmatran(M1,M2,n);
//	cout<<"\nma tran 3:"<<endl;
//	xuatmatran(M3,n);

//void nhapmatran(int **&M,int n){
//	M=new int*[n];
//	for(int i=0;i<n;i++){
//		*(M+i)=new int[n];
//	}
//	for(int i=0;i<n;i++){
//		for(int j=0;j<n;j++){
//			*(*(M+i)+j)=rand()%11;
//		}
//	}
//}
//void xuatmatran(int **M,int n){
//	for(int i=0;i<n;i++){
//		for(int j=0;j<n;j++){
//			cout<<*(*(M+i)+j)<<"\t";
//		}
//		cout<<"\n";
//	}
//}
//int **congmatran(int **M1,int **M2,int n){
//	int **M3=new int*[n];
//	for(int i=0;i<n;i++){
//		*(M3+i)=new int[n];
//	}
//	for(int i=0;i<n;i++){
//		for(int j=0;j<n;j++){
//			*(*(M3+i)+j)=*(*(M1+i)+j)+*(*(M2+i)+j);
//		}
//	}
//	return M3;
//}
