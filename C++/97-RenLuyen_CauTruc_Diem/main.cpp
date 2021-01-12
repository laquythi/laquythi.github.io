#include <iostream>
#include <math.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct diem{
	double x;
	double y;
};
double khoangcach(diem a,diem b);
double dodaicacdiem(diem arrdiem[],int n);
void nhaptoadocacdiem(diem arrdiem[],int n);
void xuattoadocacdiem(diem arrdiem[],int n);
int main(int argc, char** argv) {
	diem a;
	a.x=1;
	a.y=1;
	diem b;
	b.x=3;
	b.y=3;
	double kc=khoangcach(a,b);
	cout<<"khoang cach tu A("<<a.x<<","<<a.y<<")->B("<<b.x<<","<<b.y<<")="<<kc<<endl;
	
	diem arrdiem[3];
	nhaptoadocacdiem(arrdiem,3);
	cout<<"danh sach cac diem ban vua nhap:"<<endl;
	xuattoadocacdiem(arrdiem,3);
	cout<<"\ntong do dai="<<dodaicacdiem(arrdiem,3);
	return 0;
}
double khoangcach(diem a,diem b){
	return sqrt(pow(a.x-b.x,2)+pow(a.y-b.y,2));
}

double dodaicacdiem(diem arrdiem[],int n){
	double tongkc=0;
	for(int i=0;i<n-1;i++){
		double kc=khoangcach(arrdiem[i],arrdiem[i+1]);
		tongkc+=kc;
	}
	return tongkc;
}

void nhaptoadocacdiem(diem arrdiem[],int n){
	for(int i=0;i<n;i++){
		cout<<"nhap diem thu "<<i<<endl;
		cout<<"nhap toa do x=";
		cin>>arrdiem[i].x;
		cin.ignore();
		cout<<"nhap toa do y=";
		cin>>arrdiem[i].y;
		cin.ignore();
	}
}

void xuattoadocacdiem(diem arrdiem[],int n){
	for(int i=0;i<n;i++){
		 cout<<"("<<arrdiem[i].x<<","<<arrdiem[i].y<<"),";
	}
}
