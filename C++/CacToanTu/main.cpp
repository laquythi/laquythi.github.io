#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	/* int x=5,y=3;
	int z=x-- - ++y +2;
	//step 1: ++y ==> y=4;
	//step 2: z = x-y+2 => z = 5-4+2 = 3;
	//step 3: x-- ==> x = 4
	cout<<"x="<<x<<endl;
	cout<<"y="<<y<<endl;
	cout<<"z="<<z; */
	int x=5,y=10;
	int z=++x - y-- +2;
	//step 1 : x = 6;
	//step 2: z = 6-10+2=-2;
	//step 3: y=9;
	cout<<"x="<<x<<endl;
	cout<<"y="<<y<<endl;
	cout<<"z="<<z;
	return 0;
}
