#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	double a;
	cout<<"moi ban nhap 1 so nguyen:";
	cin>>a;
	
	if(a<0){
		cout<<a<<" la so nguyen am";
	}else{
		cout<<a<<" la so nguyen duong";
	}
	return 0;
}
