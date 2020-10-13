#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int choose(int n,int k){
	if(k == 0 || n == k){
		return 1;
	}else{
		return choose(n-1,k) + choose(n-1,k-1);
	}
}
int main(int argc, char** argv) {
	int n = 5;
	int k = 3;
	int kq = choose(n,k);
	cout<<kq;
	return 0;
}
