#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int h;
	cout<<"moi ban nhap chieu cao:";
	cin>>h;
	int i=0;
	int j=0;
	for(i=1;i<h;i++){
		for(j=1;j<h;j++){
			if(i==j||i==(h-1)||j==1){
				cout<<"*";
			}else{
				cout<<" ";
			}
		}
		cout<<"\n";
	}
	return 0;
}


//cach 2 dung while
//	int h;
//	cout<<"moi ban nhap chieu cao:";
//	cin>>h;
//	int i=0;
//	while(i<h){
//		i++;
//		int j=0;
//		while(j<h){
//			j++;
//			if(i==j || i==h || j==1){
//				cout<<"*";
//			}else{
//				cout<<" ";
//			}
//		}
//		cout<<"\n";
//	}
