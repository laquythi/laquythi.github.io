#include <iostream>
#define n 5
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int M[n];
	cout<<"nhap du lieu cho mang:"<<endl;
	for(int i=0;i<n;i++){
		cout<<"M["<<i<<"]=";
		cin>>M[i];
	}
	cout<<"mang ban vua nhap la:"<<endl;
	for(int  i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
	cout<<"\nmang ban xuat nguoc la:"<<endl;
	for(int i=n-1;i>=0;i--){
		cout<<M[i]<<"\t";
	}
	return 0;
}
