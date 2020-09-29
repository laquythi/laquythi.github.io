#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
 	int n;
 	cout<<"moi ban nhap n:";
 	cin>>n;
 	int sodu;
 	int sum=0;
 	do{
 		sodu=n%10;
 		n=n/10;
 		sum=sum+sodu;
	 }while(n>0);
	 cout<<"tong cac chu so la:"<<sum;
	return 0;
}

//co the thay bang vong lap while
//	while(n>0){
//		int sodu=n%10;
//		n=n/10;
//		sum=sum+sodu;
//	}

//sum=0
//123%10=3 sodu1=3;
//123/10=12 n1=12;
//sum = sum+sodu1=0+3=3;
//
//12%10=2 sodu2=2;
//12/10=1 n2=1;
//sum=sum+sodu2=3+2=5;
//
//1%10=1; sodu3=1;
//1/10=0 n3=0;
//sum=sum+sodu3=5+1=6 ==>ket qua phep cong tong so 123=6
 

