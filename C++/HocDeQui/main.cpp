#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int TinhGiaiThua(int n);
void H10ToH2(int n);
int main(int argc, char** argv) {
	int gt=TinhGiaiThua(5);
	cout<<"5!="<<gt<<endl;
	H10ToH2(11);
	cout<<"\n";
	H10ToH2(110);
	return 0;
}
int TinhGiaiThua(int n){
	if(n<=1)return 1;
	return n*TinhGiaiThua(n-1);
}
void H10ToH2(int n){
	if(n>0){
		int t=n%2;
		H10ToH2(n/2);
		cout<<t<<" ";
	}
}
