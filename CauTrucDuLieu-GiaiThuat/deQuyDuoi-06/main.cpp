#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int gcd(int m,int n){
	int r;
	if(m<n) return gcd(n,m);
	r=m%n;
	if(r==0){
		return n;
	}else{
		return gcd(n,r);
	}
}
int main(int argc, char** argv) {
	int m=120,n=60;
	int kq=gcd(m,n);
	cout<<kq;
	return 0;
}
