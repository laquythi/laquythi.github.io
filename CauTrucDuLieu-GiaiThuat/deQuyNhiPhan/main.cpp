#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int Fib(int n){
	if(n<=2){
		return 1;
	}return Fib(n-1) + Fib(n-2);
}
int main(int argc, char** argv) {
	int n=16;
	int f=Fib(n);
	cout<<f;
	return 0;
}
