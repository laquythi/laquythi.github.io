#include <iostream>
#include <math.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void ptb2(int a,int b,int c);
int main(int argc, char** argv) {
	cout<<"5x^2+7x-12=0"<<endl;
	ptb2(5,7,-12);
	cout<<"x^2-4x+2=0"<<endl;
	ptb2(1,-4,2);
	cout<<"\nx^2+x+1=0"<<endl;
	ptb2(1,1,1);
	cout<<"\n0x^2-4x+3=0"<<endl;
	ptb2(0,-4,3);
	return 0;
}
void ptb2(int a,int b,int c){
	if(a==0){ //bx+c=0
		if(b==0 && c==0){
			cout<<"pt vo so nghiem";
		}else if(b==0 && c!=0){
			cout<<"pt vo nghiem";
		}else{
			double x=-c*1.0/b;
			cout<<"pt co 1 nghiem x="<<x;
		}
	}else{
		double delta=pow(b,2)-4*a*c;
		if(delta<0){
			cout<<"pt vo nghiem";
		}else if(delta==0){
			double x=-b/(2*a);
			cout<<"pt co nghiem kep x1=x2="<<x;
		}else{
			double x1=(-b-sqrt(delta))/(2*a);
			double x2=(-b+sqrt(delta))/(2*a);
			cout<<"pt co 2 nghiem phan biet:";
			cout<<"x1="<<x1<<endl;
			cout<<"x2="<<x2;
		}
	}
}


//cout<<"5x^2+7x-12=0"<<endl;
//	ptb2(5,7,-12);
//	cout<<"\nx^2-4x+2=0"<<endl;
//	ptb2(1,-4,2);
//	cout<<"\nx^2+x+1=0"<<endl;
//	ptb2(1,1,1);
//	cout<<"\n-4x+3=0"<<endl;
//	ptb2(0,-4,3);
//	
//void ptb2(int a,int b,int c){
//	if(a==0){ //bx+c=0
//		if(b==0 && c==0){
//			cout<<"phuong trinh co vo so nghiem";
//		}else if(b==0 &&c!=0){
//			cout<<"phuong trinh vo nghiem";
//		}else{ //bx+c=0 ==>x=-c/b
//			double x=-c*1.0/b;
//			cout<<"phuong trinh co 1 nghiem x="<<x;
//		}
//	}else{
//		double delta=pow(b,2)-4*a*c;
//		if(delta<0){
//			cout<<"phuong trinh vo nghiem";
//		}else if(delta==0){
//			double x=-b/(2*a);
//			cout<<"phuong trinh co nghiem kep x1=x2="<<x;
//		}else{
//			double x1=(-b-sqrt(delta))/2*a;
//			double x2=(-b+sqrt(delta))/2*a;
//			cout<<"phuong trinh co 2 nghiem phan biet"<<endl;
//			cout<<"x1="<<x1;
//			cout<<"\nx2="<<x2;
//		}
//	}
//}
