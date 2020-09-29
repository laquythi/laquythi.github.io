#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void hamgido(int x,int y=10){ // doi so,parameter mac dinh luon phai khai bao sau.
	cout<<x+y<<endl;	
}
int main(int argc, char** argv) {
	hamgido(9,5);
	hamgido(11);
	return 0;
}
