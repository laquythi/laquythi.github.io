#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int i=0,n=5;
	int sum=0;
	while(i<n){ //cach 1 lam bang vong lap while
		i++;
		if(i==2||i==4){
			continue;
		}
		sum=sum+i; 
	}
	cout<<"sum="<<sum;	
	return 0;
}

//cach 2 lam bang do while
// 	int i=0,n=5;
// 	int sum=0;
// 	do{
// 		i++;
//		 if(i==2||i==4){
//		 	continue;
//		 }
//		sum=sum+i; 
//	 }while(i<n);
//	 cout<<"sum="<<sum;
