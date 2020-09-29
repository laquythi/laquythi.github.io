#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct phanso{
	int tu;
	int mau;
};
phanso *cong(phanso ps1,phanso ps2);
int ucln(phanso ps);
phanso *toigian(phanso ps);
int main(int argc, char** argv) {
	phanso ps1;
	ps1.tu=1;
	ps1.mau=2;
	phanso ps2;
	ps2.tu=3;
	ps2.mau=4;
	
	//3/5+1/2=(2*3+1*5)/(5*2)=11/10;
	phanso *ps3=cong(ps1,ps2);
	cout<<ps3->tu<<"/"<<ps3->mau<<endl;
	
	cout<<"phan so toi gian = ";
	phanso *ps4=toigian(*ps3);
	cout<<ps4->tu<<"/"<<ps4->mau<<endl;

	return 0;
}

phanso *cong(phanso ps1,phanso ps2){
	//a/b+c/d=(a*d+b*c)/(b*d);
	phanso *ps3=new phanso;
	ps3->tu=ps1.tu*ps2.mau+ps1.mau*ps2.tu;
	ps3->mau=ps1.mau*ps2.mau;
	return ps3;
}

int ucln(phanso ps){
	int min=ps.tu<ps.mau?ps.tu:ps.mau;
	for(int i=min;i>=1;i--){
		if(ps.tu%i==0 && ps.mau%i==0){
			return i; 
		}
	}
	return 1;
}

phanso *toigian(phanso ps){
	int uoc=ucln(ps);
	phanso *pstoigian=new phanso;
	pstoigian->tu=ps.tu/uoc;
	pstoigian->mau=ps.mau/uoc;
	return pstoigian;
}
