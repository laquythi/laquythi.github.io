#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int n;
	int sum=0;
	int i=1;
	cout<<"moi ban nhap 1 so:";
	cin>>n;
	while(i<=n){
		sum+=i; //sum=sum+i;
		i=i+1; //i++;
	}
	cout<<"sum="<<sum;
	return 0;
}

//i = 1,n = 5,sum = 0
//b1 : i <= n <==> 1 <= 5 ==> sum = sum + i <==> sum = 0 + 1 = 1 => i++ ==> i = 2
//
//i = 2 ,n = 5,sum = 1
//b2 : i <= n <==> 2 <= 5 ==> sum = sum + i <==> sum = 1 + 2 = 3 ==> i++ ==> i = 3
//
//i = 3,n = 5,sum = 3
//b3 : i <= n <==> 3 <= 5 ==> sum = sum + i <==> sum = 3 + 3 = 6 ==> i++ ==> i = 4
//
//i = 4,n = 5,sum = 6
//b4 : i <= n <==> 4 <=5 ==> sum = sum + i <==> sum = 6 + 4 = 10 ==> i++ ==> i = 5
//
//i = 5,n = 5,sum = 10
//b5 : i <=n <==> 5 <= 5 ==> sum = sum + i <==> sum = 10 + 5 = 15 ==> i++ ==> i = 6

//i = 6, n = 5, sum = 15
//b6 : i <= n <==> 6 <= 5 ==> false, exit while loop ==> in ra man hinh sum = 15 tu b5




//	i=2 sum=0 nhap n=6;
//th1:	i=2<=6 ==> sum=sum+i=0+2=2;
//			i=i+1=2+1=3;

//th2:	i=3<=6 ==> sum=sum+i=2+3=5;
//		i=i+1=3+1=4;

//th3:	i=4<=6  ==>sum=sum+i=5+4=9;
//		i=i+1=4+1=5;

//th3:	i=5<=6 ==> sum=sum+i=9+5=14;
//		i=i+1=5+1=6;

//th4: i=6<=6 ==> sum=sum+i=14+6=20;
//		i=i+1=6+1=7;

//th5: i=7>6 ==> false => exit while ==> sum=20
	
 

