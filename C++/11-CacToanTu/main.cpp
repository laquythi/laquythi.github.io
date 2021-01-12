#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	// bai nay hoc ve Prefix & Postfix(tien to va hau to)
	/* int x=5,y=3;
	int z=x-- - ++y +2;
	
	//step 1: ++y ==> y=4;
	
	//step 2: z = x-y+2 => z = 5-4+2 = 3;
	
	//step 3: x-- ==> x = 4
	
	cout<<"x="<<x<<endl;
	cout<<"y="<<y<<endl;
	cout<<"z="<<z; */
	
	int x = 3,y = -6;
	int z = ++y - x-- + 5;
	cout<<"z = "<<z<<endl; // z = -3
	// step 1 : ++y ==> y = -5 prefix thuc hien truoc
	// step 2 : z = ++y - x-- + 5 => z = -5 -3 + 5 = -3 sau do thuc hien noi dung ham
	// step 3 : x-- ==> x = 2 // postfix thuc hien cuoi cung
	cout<<"x = "<<x<<endl; // x = 2
	cout<<"y = "<<y; // y = -5
	return 0;
}
