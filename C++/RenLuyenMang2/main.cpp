#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu:";
	cin>>n;
	int M[n];
	for(int i=0;i<n;i++){
		cout<<"M["<<i<<"]=";
		cin>>M[i];
	}
	cout<<"\nmang ban vua nhap la:"<<endl;
	for(int  i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
	int i=0;
	int max=M[0];
	do{
		if(M[i]>max){
			max=M[i];
		}
		i++;
	}while(i<n);
	
	i=0;
	int min=M[0];
	while(i<n){
		if(M[i]<min){
			min=M[i];
		}
		i++;
	}
	
	int sum=0;
	for(int i=0;i<n;i++){
		sum=sum+M[i];
	}
	cout<<"\nMax="<<max;
	cout<<"\nMin="<<min;
	cout<<"\nSum="<<sum;
	return 0;
}

//	int n;
//	cout<<"nhap so phan tu:"<<endl;
//	cin>>n;
//	int M[n];
//	for(int i=0;i<n;i++){
//		cout<<"M["<<i<<"]=";
//		cin>>M[i];
//	}
//	cout<<"mang sau khi nhap:"<<endl;
//	for(int i=0;i<n;i++){
//		cout<<M[i]<<"\t";
//	}
//	int max=M[0];
//	for(int i=1;i<n;i++){ //o  day int i=0 ket qua van dung ???
//		if(M[i]>max){
//			max=M[i];
//		}
//	}
//	int min=M[0];
//	for(int i=1;i<n;i++){ //day int i=0 ket qua van dung ???
//		if(M[i]<min){
//			min=M[i];
//		}
//	}
//	int sum=0;
//	for(int i=0;i<n;i++){
//		sum+=M[i]; //sum=sum+M[i]
//	}
//	cout<<"\nmax="<<max;
//	cout<<"\nmin="<<min;
//	cout<<"\nsum="<<sum;


//	int n;
//	cout<<"nhap so phan tu:"<<endl;
//	cin>>n;
//	int M[n];
//	for(int i=0;i<n;i++){
//		cout<<"M["<<i<<"]=";
//		cin>>M[i];
//	}
//	cout<<"mang sau khi nhap:"<<endl;
//	for(int  i=0;i<n;i++){
//		cout<<M[i]<<"\t";
//	}
//	int max=M[0];
//	int i=1;
//	while(i<n){
//		 if(M[i]>max){
//		 	max=M[i];
//		 }
//      i++;
//	}

//int min=M[0];
//i=0;
//do{
//	if(M[i]<min){
//		min=M[i];
//	}
//	i++;
//}while(i<n);
//
//int sum=0;
//for(int  i=0;i<n;i++){
//	sum=sum+M[i];
//}
//cout<<"\nMax="<<max;
//cout<<"\nMin="<<min;
//cout<<"\nSum="<<sum;
