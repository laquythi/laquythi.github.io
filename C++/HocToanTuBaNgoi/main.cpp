#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int n;
	cout<<"moi ban nhap N:";
	cin>>n;
//	if(n%2==0){
//		cout<<n<<" la so chan";
//	}else{
//		cout<<n<<" la so le";
//	}
	cout<<n<<(n%2==0?" la so chan":" la so le");
	return 0;
}
