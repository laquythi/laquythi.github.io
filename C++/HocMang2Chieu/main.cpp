#include <iostream>
#include<time.h>
#include<stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	srand(time(NULL));
	int row,col;
	cout<<"nhap so dong:";
	cin>>row;
	cout<<"nhap so cot:";
	cin>>col;
	int M[row][col];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			M[i][j]=rand()%100;
		}
	}
	cout<<"ma tran ban vua nhap ngau nhien la:"<<endl;
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			cout<<M[i][j]<<"\t";
		}
		cout<<"\n";
	}
	int d;
	cout<<"ban muon xuat dong nao:";
	cin>>d;
	for(int j=0;j<col;j++){
		cout<<M[d][j]<<"\t";
	}
	int c;
	cout<<"\nban muon xuat cot nao:";
	cin>>c;
	for(int i=0;i<row;i++){
		cout<<M[i][c]<<"\n";
	}
	if(row==col){
		cout<<"duong cheo chinh la:"<<endl;
		for(int j=0;j<col;j++){ //hoac co the viet i=0;i<row,i++ coutM[i][i]
			cout<<M[j][j]<<"\t";
		}
		cout<<"duong cheo phu la:"<<endl;
		for(int i=0;i<row;i++){
			cout<<M[i][row-i-1]<<"\t";
		}
	}
	return 0;
}

//	int row,col;
//	cout<<"nhap so dong:";
//	cin>>row;
//	cout<<"nhap so cot:";
//	cin>>col;
//	int M[row][col];
//	for(int i=0;i<row;i++){
//		for(int j=0;j<col;j++){
//			M[i][j]=rand()%100;
//		}
//	}
//	cout<<"mang sau khi nhap ngau nhien la:"<<endl;
//	for(int i=0;i<row;i++){
//		for(int j=0;j<col;j++){
//			cout<<M[i][j]<<"\t";
//		}
//		cout<<"\n";
//	}
//	cout<<"ban muon xuat dong nao:"<<"\t";
//	int r;
//	cin>>r;
//	for(int j=0;j<col;j++){
//		cout<<M[r][j]<<"\t";
//	}
//	cout<<"\nban muon xuat cot nao:"<<"\t";
//	int c;
//	cin>>c;
//	for(int i=0;i<row;i++){
//		cout<<M[i][c]<<"\n";
//	}
//	if(row==col){
//		cout<<"\nduong cheo chinh la:"<<endl;
//		for(int i=0;i<row;i++){
//			cout<<M[i][i]<<"\t"; 
//		}
//		cout<<"\nduong cheo phu la:"<<endl;
//		for(int i=0;i<row;i++){
//			cout<<M[i][row-i-1]<<"\t";
//		}
//	}
