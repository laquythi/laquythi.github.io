#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
//	int M[4];
//	M[0]=1;
//	M[1]=6;
//	M[2]=10;
//	M[3]=M[1]+M[2];
//	M[4]=0;
//	cout<<M[2]*M[4]<<endl<<"-----------"<<endl;
//	int X[]={3,5,1,-5,10};
//	cout<<"X[3]="<<X[3]<<endl;
//	cout<<"X[0]="<<X[0];

	int M[] = {2,5,4,6,6,2};
	for(int i=0;i<sizeof(M)/sizeof(M[0]);i++){
		cout<<M[i]<<endl;
	}
	cout<<"so phan tu co trong mang M la "<<sizeof(M)/sizeof(M[0]);
	cout<<"\nphan tu thu 3 trong mang M la "<<M[2];
	return 0;
}
