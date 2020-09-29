#include <iostream>
#include <math.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
 	int n;
 	double s=0;
 	int x;
 	cout<<"moi ban nhap x:";
 	cin>>x;
 	cout<<"moi ban nhap n:";
 	cin>>n;
 	for(int i=1;i<=n;i++){
 		double tu=pow(x,i);
 		int mau=1;
 		for(int j=1;j<=i;j++){
 			mau=mau*j;
		 }
		 s=s+tu/mau;
	
	 }
	 cout<<"s("<<x<<"),("<<n<<")="<<s;
	return 0;
}
