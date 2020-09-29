#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int i=0; //co the khai bao int i ngay trong vong for,vd:for(i=0;i<=n;i++){}
	int n;
	int sum=0;
	cout<<"moi ban nhap n:";
	cin>>n;
	for(i=0;i<=n;i++){
		sum=sum+i; //sum+=i;	
	}
	cout<<"sum="<<sum;
	return 0;
}

//sum=0;i=2;n=6;
//th1:      i=2<=6 ==>sum=sum+i=0+2=2;
//th2:i++==>i=3<=6 ==>sum=sum+i=2+3=5;
//th3:i++==>i=4<=6 ==>sum=sum+i=5+4=9;
//th4:i++==>i=5<=6 ==>sum=sum+i=9+5=14;
//th5:i++==>i=6<=6 ==>sum=sum+i=14+6=20;
//th6:i++=7>6==>exit for;
//
//sum=0;i=1;n=7;
//th1:      i=1<=7==>sum=sum+i=0+1=1;
//th2:i++==>i=2<=7==>sum=sum+i=1+2=3;
//th3:i++==>i=3<=7==>sum=sum+i=3+3=6;
//th4:i++==>i=4<=4==>sum=sum+i=6+4=10;
//th5:i++==>i=5<=7==>sum=sum+i=10+5=15;
//th6:i++==>i=6<=7==>sum=sum+i=15+6=21;
//th7:i++==>i=7<=7==>sum=sum+i=21+7=28;
//th8:i++==>i=8>7==>exit for;


