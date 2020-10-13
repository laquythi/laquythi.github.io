#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int factorial(int n){
	if(n==0){
		return 1;
	}else{
		return n*factorial(n-1);
	}
}
int main(int argc, char** argv) {
 	int n;
 	cout<<"nhap n:";
 	cin>>n;
 	int ketqua = factorial(n);
 	cout<<n<<"!="<<ketqua;
	return 0;
}
