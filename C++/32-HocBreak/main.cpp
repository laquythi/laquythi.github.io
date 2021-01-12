#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
 	int n;
 	cout<<"chuong trinh tinh tong cac so tu 1-n:";
 	cin>>n;
 	int sum=0;
 	 
 	for(int i=1;i<=n;i++){
 		sum=sum+i; //sum+=i;
 		if(sum>=9)
 			break;
	 }
	 cout<<"sum="<<sum;
	return 0;
}

//sum=0;i=1;n=5; if(sum>=9){break}
//th1:            i=1<=5==>sum=sum+i=0+1=1;
//th2:i++==>i=2<=5==>sum=sum+i=1+2=3;
//th3:i++==>i=3<=5==>sum=sum+i=3+3=6;
//th4:i++==>i=4<=5==>sum=sum+i=6+4=10>=9 ==>break;
//
//sum=0;i=2;n=5;if(sum>=9){break}
//th1:      i=2<=5==>sum=sum+i=0+2=2;
//th2:i++==>i=3<=5==>sum=sum+i=2+3=5;
//th3:i++==>i=4<=5==>sum=sum+i=5+4=9>=9==>break;


