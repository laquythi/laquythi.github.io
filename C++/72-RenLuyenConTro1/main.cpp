#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void swap(double *&pa,double *&pb);//ham swap de doi gia tri a va b;
int main(int argc, char** argv) {
	double a=5.5;
	double b=6.5;
	swap(a,b);
	cout<<"a="<<a<<endl;
	cout<<"b="<<b;
	return 0;
}
void swap(double *&pa,double *&pb){
	double temp=*pa;
	*pa=*pb;
	*pb=temp;
}


//void swap(double *&pa,double *&pb);
//	double a=5.5,b=6.5;
//	swap(a,b);
//	cout<<"a="<<a<<";b="<<b;
//void swap(double *&pa,double *&pb){
//	double temp=*pa;
//	*pa=*pb;
//	*pb=temp;
//}
