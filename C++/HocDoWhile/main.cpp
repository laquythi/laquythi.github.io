#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
 	int i=1;
 	do{
 		cout<<i<<"\t";
 		i++;
	 }while(i<10);
	return 0;
}

//n=0  n<=5;
//th1: xuat n=0;
//n++ ==> n=1<=5 ==> true;
//
//th2: xuat n=1;
//	n++ ==> n=2<=5 ==> true;
//	
//th3: xuat n=2;
//	n++ ==> n=3<=5 ==> true;
//	
//th4: xuat n=3;
//	n++ ==> n=4<=5 ==> true;
//	
//th5: xuat n=4;
//	n++ ==> n=5<=5 ==> true;
//	
//th6: xuat n=5;
//	n++ ==>n=6 >5 ==> false ==> exit do while




