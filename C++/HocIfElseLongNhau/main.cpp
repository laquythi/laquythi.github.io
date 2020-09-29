#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
//	double dtb;
//	cout<<"moi ban nhap diem trung binh:";
//	cin>>dtb;
//	if(dtb<0 || dtb>10){
//		cout<<"ban nhap sai diem trung binh";
//	}else{
//		if(dtb<5){
//			cout<<"ban da truot";
//		}else{
//			cout<<"ban da do";
//		}
//	}
//	
	int dotuoi;
	cout<<"moi ban nhap do tuoi:";
	cin>>dotuoi;
	if(dotuoi>=6 && dotuoi<=18){
		cout<<"ban du tuoi di hoc";
	}else if(dotuoi>18){
		 cout<<"ban qua tuoi di hoc";
	}else{
		cout<<"ban chua du tuoi di hoc";
	}
	return 0;
}
