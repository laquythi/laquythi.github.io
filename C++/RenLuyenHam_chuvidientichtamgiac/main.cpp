#include <iostream>
#include<math.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int chuvi(int a,int b,int c);
double dientich(int a,int b,int c);
bool kiemtra(int a,int b,int c);
int main(int argc, char** argv) {
	int a,b,c;
	cout<<"nhap a:";
	cin>>a;
	cout<<"nhap b:";
	cin>>b;
	cout<<"nhap c:";
	cin>>c;
	if(kiemtra(a,b,c)==false){
		cout<<"tam giac ban nhap ko hop le";
		return -1;
	}
	int cv=chuvi(a,b,c);
	double dt=dientich(a,b,c);
	cout<<"chu vi="<<cv;
	cout<<"\ndien tich="<<dt;
	return 0;
}
int chuvi(int a,int b,int c){
	return a+b+c;
}
double dientich(int a,int b,int c){
	double p=(a+b+c)/2.0;
	double dt=sqrt(p*(p-a)*(p-b)*(p-c));
	return dt;
}
bool kiemtra(int a,int b,int c){
	if(a<=0 || b<=0 || c<=0 || (a+b)<=c || (a+c)<=b || (b+c)<=a){
		return false;
	}else{
		return true;
	}
}

 

//
//#include<math.h>
//using namespace std;
///* run this program using the console pauser or add your own getch, system("pause") or input loop */
//int chuvi(int a,int b,int c);
//double dientich(int a,int b,int c);//o day tinh dien tich tam giac theo cong thuc herong
//bool kiemtra(int a,int b,int c);
//int main(int argc, char** argv) {
//	int a,b,c;
//	cout<<"nhap canh a:";
//	cin>>a;
//	cout<<"nhap canh b:";
//	cin>>b;
//	cout<<"nhap canh c:";
//	cin>>c;
//	if(kiemtra(a,b,c)==false){
//		cout<<"tam giac ko hop le"<<endl;
//		return -1;
//	}
//	int cv=chuvi(a,b,c);
//	double dt=dientich(a,b,c);
//	cout<<"chu vi="<<cv<<endl;
//	cout<<"dien tich="<<dt<<endl;
//	return 0;
//}
//int chuvi(int a,int b,int c){
//	return a+b+c;
//}
//double dientich(int a,int b,int c){
//	double p=chuvi(a,b,c)/2.0; //nua chu vi
//	double dt=sqrt(p*(p-a)*(p-b)*(p-c));
//	return dt;
//}
//bool kiemtra(int a,int b,int c){
//	if(a<=0 || b<=0 || c<=0 || (a+b)<=c || (a+c)<=b || (b+c)<=a){
//		return false;
//	}else{
//		return true;
//	}
//}
