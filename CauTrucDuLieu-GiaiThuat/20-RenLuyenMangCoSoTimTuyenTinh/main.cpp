#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void NhapMang(float F[],int n);

void XuatMang(float F[],int n);

int Dem(float F[],int n,float x);

float MaxChan(float F[],int n);

float MaxLe(float F[],int n);

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu:";
	cin>>n;
	float F[n];
	NhapMang(F,n);
	cout<<"mang sau khi nhap:"<<endl;
	XuatMang(F,n);
	float x;
	cout<<"nhap x:";
	cin>>x;
	int d=Dem(F,n,x);
	cout<<x<<" xuat hien "<<d<<" lan"<<endl;
	float maxchan = MaxChan(F,n);
	if(maxchan == -9999){
		cout<<"mang ko co san";
	}else{
		cout<<"Max chan = "<<maxchan;
	}
	float maxle = MaxLe(F,n);
	if(maxle == -9999){
		cout<<"\nmang ko co so le:";
	}else{
		cout<<"\nmax le = "<<maxle;
	}
	return 0;
}

void NhapMang(float F[],int n){
	for(int i=0;i<n;i++){
		cout<<"nhap gia tri phan tu thu "<<i<<":";
		cin>>F[i];
	}
}

void XuatMang(float F[],int n){
	for(int i=0;i<n;i++){
		cout<<F[i]<<"\t";
	}
}

int Dem(float F[],int n,float x){
	int d = 0;
	for(int i=0;i<n;i++){
		if(F[i]==x){
			d++;
		}
	}
	return d;
}

float MaxChan(float F[],int n){
	float max = -9999;
	for(int i=0;i<n;i++){
		int f2 = (int)F[i];
		if(f2 == F[i]){
			if(F[i] > max && f2 % 2 == 0){
				max = F[i];
			}
		}
	
	}
	return max;
}

float MaxLe(float F[],int n){
	float max = -9999;
	for(int i=0;i<n;i++){
		int f2 = (int)F[i];
		if(f2 == F[i]){
			if(F[i] > max && f2 % 2 != 0){
				max = F[i];
			}
		}
	
	}
	return max;
}
