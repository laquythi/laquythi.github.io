#include <iostream>
#include<time.h>
#include<stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	srand(time(NULL));//bien doi dong thanh cot trong ma tran
	int m,n;
	cout<<"nhap so dong:";
	cin>>m;
	cout<<"nhap so cot:";
	cin>>n;
	int M[m][n];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			M[i][j]=rand()%100;
		}
	}
	cout<<"mang sau khi nhap ngau nhien la:"<<endl;
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			cout<<M[i][j]<<"\t";
		}
		cout<<"\n";
	}
	int MT[n][m];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			MT[j][i]=M[i][j];
		}
	}
	cout<<"ma tran hoan vi la:"<<endl;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cout<<MT[i][j]<<"\t";
		}
		cout<<"\n";
	}
	return 0;
}
