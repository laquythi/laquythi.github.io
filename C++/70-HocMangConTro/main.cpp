#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int *p[5];
	for(int i=0;i<5;i++){
		p[i]=new int;
		*p[i]=i*2;
	}
	for(int i=0;i<5;i++){
		cout<<p[i]<<"=>"<<*p[i]<<endl;//neu de <<p[i]<<endl se in ra dia chi p[i];
	}
	return 0;
}
//	int *p[5];
//	for(int i=1;i<5;i++){
//		p[i]=new int;
//		*p[i]=i*2;
//	}
//	for(int i=1;i<5;i++){
//		cout<<p[i]<<"=>"<<*p[i]<<endl;
//	}
