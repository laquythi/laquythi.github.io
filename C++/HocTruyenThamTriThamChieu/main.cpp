#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void ham1(int x); //truyen tham tri,bien trong ham doi gia tri,truoc va sau khi vao ham gia tri ko doi
void ham2(int &x); //truyen tham bien(tham chieu),bien trong ham va sau khi ra khoi ham doi gia tri
int main(int argc, char** argv) {
	int x=5;
	cout<<"x truoc khi vao ham 1="<<x;
	ham1(x);
	cout<<"\nx sau khi vao ham 1="<<x<<endl;
	cout<<"\nx truoc khi vao ham 2="<<x;
	ham2(x);
	cout<<"\nx sau khi vao ham 2="<<x;
	return 0;
}
void ham1(int x){
	x=10;
	cout<<"\nx trong ham 1="<<x;
}
void ham2(int &x){
	x=10;
	cout<<"\nx trong ham 2="<<x;
}

//	int x=5;
//  	cout<<"x truoc khi vao ham 1="<<x;
//  	ham1(x);
//  	cout<<"\nx sau khi vao ham 1="<<x;
//  	
//  	cout<<"\nx truoc khi vao ham 2="<<x;
//  	ham2(x);
//  	cout<<"\nx sau khi vao ham 2="<<x;

//void ham1(int x){
//	x=10;
//	cout<<"\nx trong ham 1="<<x;
//}
//void ham2(int &x){
//	x=20;
//	cout<<"\nx trong ham 2="<<x;
//}
