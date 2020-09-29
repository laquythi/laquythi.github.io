#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int n;
	cout<<"moi ban nhap n:";
	cin>>n;
	int i=1;
	int sum_uoc=0;
	while(i<n){
		if(n%i==0){
			sum_uoc=sum_uoc+i;
		};
	i++;
	}
	if(sum_uoc==n){
		cout<<n<<" la so hoan thien";
	}else{
		cout<<n<<" ko la so hoan thien";
	}
	return 0;
}

//int n;int sum_uoc=0;int i=1;o day nhap n=28 co cac uoc la 1 2 4 7 14 28;
//while(i<n){
//	if(n%i==0) n chia cho i du 0 (n chia het cho i)
//	sum_uoc=sum_uoc+i;
//	i++;
//}
//th1: i=1 ==>i<n(28);sum_uoc=sum_uoc+i=0+1=1;i++ ==>i=2;
//th2:i=2  ==>i<n(28);sum_uoc=sum_uoc+i=1+2=3;i++ ==>i=4;
//th3:i=4  ==>i<n(28);sum_uoc=sum_uoc+i=3+4=7;i++==>i=5 i=6 ko phai la uoc cua n(28);
//th4:i=7  ==>i<n(28);sum_uoc=sum_uoc+i=7+7=14;i++ ==>i= 8 9 10 11 12 13 ko phai la uoc cua n(28);
//th5:i=14 ==>i<n(28);sum_uoc=sum_uoc+i=14+14=28;i++ ==> i= 15 16 17...26 27 ko phai la uoc cua n(28);
//th6:i=28 ==>i=n(28) false ==> ket thuc vong lap.
	





