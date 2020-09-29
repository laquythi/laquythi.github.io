#include <iostream>
#include <math.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int x;//goc nhap tu ban phim;
	double radian;
	const double PI=3.14;
	cout<<"moi ban nhap goc:";
	cin>>x;
	radian=x*PI/180;
	double sinx=sin(radian);
	double cosx=cos(radian);
	double tanx=tan(radian);
	double cotanx=1/tan(radian);
	
	cout<<"sin("<<x<<")="<<sinx<<endl;
	cout<<"cos("<<x<<")="<<cosx<<endl;
	cout<<"tan("<<x<<")="<<tanx<<endl;
	cout<<"cotan("<<x<<")="<<cotanx<<endl;
	return 0;
}
