#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	srand(time(NULL));
	int n;
	cout<<"nhap so phan tu trong mang:"<<endl;
	cin>>n;
	int M[n];
	for(int i=0;i<n;i++){
		M[i]=rand()%100;
	}
	cout<<"mang dc nhap ngau nhien la:"<<endl;
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
	int sole=0;
	for(int i=0;i<n;i++){
		if(M[i]%2!=0){
			sole++; //sole=sole+1;
		}
	}
	cout<<"\nco "<<sole<<" so le trong mang"<<endl;
	for(int i=0;i<n;i++){
		if(M[i]%2!=0){
			cout<<M[i]<<"\t";
		}
	}
	
	int sochan=0;
	for(int i=0;i<n;i++){
		if(M[i]%2==0){
			sochan++; //sochan=sochan+1;
		}
	}
	cout<<"\nco "<<sochan<<" so chan trong mang"<<endl;
	for(int i=0;i<n;i++){
		if(M[i]%2==0){
			cout<<M[i]<<"\t";
		}
	}
	int songto = 0;
	for(int i = 0; i<n; i++)
	{
		int dem =0;
		for(int j = 1; j<=M[i];j++)
		{
			if(M[i] % j == 0)
			dem++;
		}
		if(dem == 2)
		{
			songto++;
		}
	}
	cout<<"\nCo "<<songto<<" so nguyen to trong mang : ";
	for(int i = 0; i<n; i++)
	{
		int dem =0;
		for(int j = 1; j<=M[i];j++)
		{
			if(M[i] % j ==0)
			dem++;
		}
		if(dem == 2)
		{
			cout<<M[i]<<"\t";
		}
	}
	
	return 0;
}


	
	
	
//	cout<<"\ncac so nguyen to trong mang:"<<endl;
//	for(int i=0;i<n;i++){
//		int dem=0;
//		for(int j=1;j<=M[i];j++){
//			if(M[i]%j==0){
//				dem++;
//			}
//		}
//		if(dem==2){
//			cout<<M[i]<<"\t";
//		}
//	}

//int songto = 0;
//	for(int i = 0; i<n; i++)
//	{
//		int dem =0;
//		for(int j = 1; j<=M[i];j++)
//		{
//			if(M[i] % j == 0)
//			dem++;
//		}
//		if(dem == 2)
//		{
//			songto++;
//		}
//	}

//	cout<<"\nCo "<<songto<<" so nguyen to trong mang : ";
//	for(int i = 0; i<n; i++)
//	{
//		int dem =0;
//		for(int j = 1; j<=M[i];j++)
//		{
//			if(M[i] % j ==0)
//			dem++;
//		}
//		if(dem == 2)
//		{
//			cout<<M[i]<<"\t";
//		}
//	}
