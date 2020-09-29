#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu trong mang: ";
	cin>>n;
	int M[n];
	cout<<"nhap du lieu cho mang"<<endl;
	for(int i=0;i<n;i++){
		cout<<"M["<<i<<"]=";
		cin>>M[i];
	}
	cout<<"mang ban vua nhap la:"<<endl;
	for(int i=n-1;i>=0;i--){
		cout<<M[i]<<"\t";
	}
	int k;
	cout<<"nhap k:";
	cin>>k;
	bool kq=false;
	int dem=0;
	for(int i=0;i<n;i++){
		if(M[i]==k){
			kq=true;
			dem++;
		}
	}
	if(kq==true){
		cout<<"thay "<<k<<" xuat hien trong mang "<<dem<<" lan";
	}else{
		cout<<"khong thay "<<k<<" xuat hien trong mang";
	}
	return 0;
}

//	int n;
//	cout<<"nhap so phan tu trong mang:";
//	cin>>n;
//	int M[n];
//	cout<<"moi ban nhap gia tri cho phan tu:"<<endl;
//	for(int i=0;i<n;i++){
//		cout<<"M["<<i<<"]=";
//		cin>>M[i];
//	}
//	cout<<"mang sau khi nhap la:"<<endl;
//	for(int i=0;i<n;i++){
//		cout<<M[i]<<"\t";
//	}
//	int k;
//	cout<<"nhap K muon tim:";
//	cin>>k;
//	bool kq=false;
//	int dem=0;
//	for(int i=0;i<n;i++){
//		if(M[i]==k){
//			kq=true;
//			//break;
//			dem++;
//
//		}
//	}
//	if(kq==true){
//		cout<<"thay "<<k<<" xuat hien "<<dem<<" lan trong mang"; //vd 1 1 2 3 4 ,tim 1==>ket qua la:thay 1 hai(2) lan xuat hien trong mang
//	}else{
//		cout<<"ko thay "<<k<<" trong mang"; 
//	}
