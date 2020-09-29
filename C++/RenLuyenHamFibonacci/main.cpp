#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int fib(int n);
void xuatdayfib(int n);
int main(int argc, char** argv) {
	int n;//lam bang cach nhap vi tri trong ham fibonnaci
	cout<<"nhap vi tri trong ham fibonacci ";
	cin>>n;
	cout<<"gia tri cua phan tu tai vi tri thu "<<n<<" la ";
	cout<<fib(n);
	cout<<"\nxuat day fibonacci"<<endl;
	xuatdayfib(n);
	return 0;
}
int fib(int n){
	if(n<=2){
		return 1;
	}else{
		return fib(n-1)+fib(n-2);
	}
}
void xuatdayfib(int n){
	int i=1;
//	do{ //xuat day fibonacci bang vong lap do while
//		cout<<fib(i)<<"\t";
//		i++;
//	}
	while(i<=n){ //xuat day fibonacci bang vong lap while
		cout<<fib(i)<<"\t";
		i++;
	}
}

//int fib(int n);
//void xuatdayfib(int n);
//int main(int argc, char** argv) {
//	int n=30;
//	cout<<fib(n);
//	cout<<"\nday so chi tiet la:"<<endl;
//	xuatdayfib(n);
//	return 0;
//}
//int fib(int n){
//	if(n<=2){
//		return 1; //1 1 2 3 5 8 13 21 34
//	}else{
//		return fib(n-1)+fib(n-2);
//	}
//}
//void xuatdayfib(int n){
//	for(int i=1;i<=n;i++){
//		cout<<fib(i)<<"\t";
//	}
//}
