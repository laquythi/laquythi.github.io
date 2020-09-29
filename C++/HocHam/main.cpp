#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int phepcong(int a,int b); //khai bao prototype
void xuatdulieu(int x); //khong co ket qua tra ve
void Output();
int main(int argc, char** argv) {
	int a,b;
	cout<<"nhap a:";
	cin>>a;
	cout<<"nhap b:";
	cin>>b;
	phepcong(a,b);
	int kq=phepcong(a,b);
	cout<<"a"<<"+"<<"b="<<kq<<endl;
	int kq2=phepcong(7,9);
	cout<<kq2<<endl;
	int kq3=phepcong(5,9);
	xuatdulieu(kq3);
	cout<<"ham goi ham:\n";
	Output();
	return 0;
}
int phepcong(int a,int b){
	return a+b;
}
void xuatdulieu(int x){
	cout<<x<<endl;	
}
void Output(){
	int kq=phepcong(8,12);
	xuatdulieu(kq);
}


