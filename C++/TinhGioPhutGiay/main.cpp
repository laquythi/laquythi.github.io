#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
 	int t;
 	int hour,minute,second;
 	cout<<"moi ban nhap vao so giay:";
 	cin>>t;
 	hour=(t/3600)%24;
 	minute=(t%3600)/60;
 	second=(t%3600)%60;
 	int hourtemp;
 	hourtemp=hour>12?hour-12:hour;
 	cout<<hourtemp<<":"<<minute<<":"<<second<<(hour>12?" PM":" AM");
	return 0;
}
