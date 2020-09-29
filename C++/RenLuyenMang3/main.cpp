#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu:"<<endl;
	cin>>n;
	int M[n];
	for(int i=0;i<n;i++){
	 	cout<<"M["<<i<<"]=";
	 	cin>>M[i];
	 	while(M[i]<=M[i-1]){
	 		cout<<"M["<<i<<"]=";
	 		cin>>M[i];
		 }
	}
	cout<<"mang ban vua nhap la:"<<endl;
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
	return 0;
}

//lam bang do while
//int i=0;
//	do{
//		cout<<"M["<<i<<"]=";
//		cin>>M[i];
//		if(i>0&&M[i]<=M[i-1]){
//			continue;
//		}
//		i++;
//	}while(i<n);

//lam bang for
//	int n;
//	cout<<"nhap so phan tu:"<<endl;
//	cin>>n;
//	int M[n];
//	for(int i=0;i<n;i++){
//	 	cout<<"M["<<i<<"]=";
//	 	cin>>M[i];
//	 	while(M[i]<=M[i-1]){
//	 		cout<<"M["<<i<<"]=";
//	 		cin>>M[i];
//		 }
//	}
//	cout<<"mang ban vua nhap la:"<<endl;
//	for(int i=0;i<n;i++){
//		cout<<M[i]<<"\t";
//	}


