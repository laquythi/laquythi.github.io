#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void hamgido(int x,int y=10){ // doi so,parameter mac dinh luon phai khai bao sau.
	cout<<x+y<<endl;	
}

void function(int a,int b=9){
	cout<<a+b<<endl;
}

int main(int argc, char** argv) {
	hamgido(9,5); // return 14
	hamgido(11); // return 21
	
	function(10);
	function(23,9);
	return 0;
}


