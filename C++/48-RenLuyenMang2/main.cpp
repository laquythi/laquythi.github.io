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

	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			int temp;
			if(M[i] > M[j]){
				temp = M[i];
				M[i] = M[j];
				M[j] = temp;
			}
		}
	}
	// tim max min cach 2 : dung thuat toan sap xep mang tang dan(hoac giam dan),
	// sau do lay max = phan tu dau tien,min = ptu cuoi cung trong mang
	int sum = 0;
	for(int i=0;i<n;i++){
		sum = sum + M[i];
	}
	cout<<"\nmax = "<<M[0];
	cout<<"\nmin = "<<M[n-1];
	cout<<"\nsum = "<<sum;
	
// tim max , min cach 1,gan max min = phan tu dau tien,
// sau do duyet mang,phan tu nao lon hon max,hoac nho hon min thi gan max min = phan tu do

//	int i=0;
//	int max=M[0];
//	do{
//		if(M[i]>max){
//			max=M[i];
//		}
//		i++;
//	}while(i<n);
	// tim min
//	i=0;
//	int min=M[0];
//	while(i<n){
//		if(M[i]<min){
//			min=M[i];
//		}
//		i++;
//	}
//	
//	int sum=0;
//	for(int i=0;i<n;i++){
//		sum=sum+M[i];
//	}
//	cout<<"\nMax="<<max;
//	cout<<"\nMin="<<min;
//	cout<<"\nSum="<<sum;
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
