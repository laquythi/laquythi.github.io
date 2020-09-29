#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct sinhvien{
	int ma;
	char ten[255];
};
int main(int argc, char** argv) {
	sinhvien teo;
	teo.ma=113;
	strcpy(teo.ten,"Teo");
	cout<<"thong tin teo:"<<endl;
	cout<<teo.ma<<"\t";
	cout<<teo.ten<<endl;
	
	sinhvien *pteo=&teo;
	cout<<"thong tin teo theo con tro:"<<endl;
	cout<<pteo->ma<<"\t"<<pteo->ten<<endl;
	
	pteo->ma=103;
	strcpy(pteo->ten,"teo 2");
	cout<<"thong tin teo sau khi con tro thay doi :"<<endl;
	cout<<pteo->ma<<"\t"<<pteo->ten<<endl;
	
	teo.ma=203;
	strcpy(teo.ten,"teo 203");
	cout<<"thong tin teo theo con tro:"<<endl;
	cout<<pteo->ma<<"\t"<<pteo->ten<<endl;
	
	sinhvien *pty;
	pty=new sinhvien; //cap phat bo nho cho con tro pty;
	pty->ma=114;
	strcpy(pty->ten,"Ty");
	cout<<"thong tin ty:"<<endl;
	cout<<pty->ma<<"\t"<<pty->ten<<endl;
	
	sinhvien *pty2=pty;
	pty2->ma=214;
	cout<<"thong tin cua pty sau khi pty 2 thay doi:"<<endl;
	cout<<pty->ma<<"\t"<<pty->ten<<endl;

	return 0;
}

//struct sinhvien{
//	int ma;
//	char ten[255];
//};

//	sinhvien teo;
//	teo.ma=113;
//	strcpy(teo.ten,"Teo");
//	cout<<"thong tin cua teo:"<<endl;
//	cout<<teo.ma<<"\t"<<teo.ten<<endl;
//	
//	sinhvien *pteo=&teo;
//	cout<<"thong tin cua teo theo con tro:"<<endl;
//	cout<<pteo->ma<<"\t"<<pteo->ten<<endl;
//	
//	pteo->ma=103;
//	strcpy(pteo->ten,"teo 2");
//	cout<<"thong tin cua teo sau khi con tro thay doi gia tri:"<<endl;
//	cout<<pteo->ma<<"\t"<<pteo->ten<<endl;
//	
//	teo.ma=203;
//	strcpy(teo.ten,"teo 203");
//	cout<<"thong tin cua teo theo con tro:"<<endl;
//	cout<<pteo->ma<<"\t"<<pteo->ten<<endl;
//	
//	sinhvien *pty;
//	pty=new sinhvien;
//	pty->ma=114;
//	strcpy(pty->ten,"Ty");
//	cout<<"thong tin cua ty:"<<endl;
//	cout<<pty->ma<<"\t"<<pty->ten<<endl;
//	
//	sinhvien *pty2=pty;
//	pty2->ma=214;
//	cout<<"thong tin cua pty sau khi pty2 thay doi:";
//	cout<<pty->ma<<"\t"<<pty->ten<<endl;
