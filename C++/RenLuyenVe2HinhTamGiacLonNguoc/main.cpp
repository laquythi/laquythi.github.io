#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int h;
	cout<<"nhap chieu cao:";
	cin>>h;
	for(int i=0;i<h;i++){
		for(int j=0;j<h;j++){
			if((j==0&&i<=h/2)||(j==h-1&&i>=h/2)||i==j||i==h/2){
				cout<<"*";
			}else{
				cout<<" ";
			}
		}
		cout<<"\n";
	}
	return 0;
}

//	int h;
//	cout<<"moi ban nhap chieu cao:";
//	cin>>h;
//	for(int i=0;i<h;i++){
//		for(int j=0;j<h;j++){
//			if((j==0&&i<=h/2)||(j==h-1&&i>=h/2)||i==j||i==h/2){
//				cout<<"*";
//			}else{
//				cout<<" ";
//			}
//		}
//		cout<<"\n";
//	}


//bai tap ve hinh tam giac
//	int h;
//	cout<<"moi ban nhap chieu cao:";
//	cin>>h;
//	for(int  i=0;i<h;i++){
//		for(int j=0;j<h;j++){
//			if(i==j||j==0||i==h-1){
//				cout<<"*";
//			}else{
//				cout<<" ";
//			}
//		}
//		cout<<"\n";
//	}
