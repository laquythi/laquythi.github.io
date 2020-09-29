#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void nhapmang(int M[],int n);
void xuatmang(int M[],int n);
int timK(int M[],int n,int k);
void sapxepmang(int M[],int n);
int main(int argc, char** argv) {
	int n;
	cout<<"nhap so phan tu:";
	cin>>n;
	int M[n];
	nhapmang(M,n);
	cout<<"mang sau khi nhap la:"<<endl;
	xuatmang(M,n);
	int k;
	cout<<"nhap k muon tim:";
	cin>>k;
	int ketqua=timK(M,n,k);
	if(ketqua==-1){
		cout<<"khong tim thay "<<k<<" trong mang";
	}else{
		cout<<"tim thay "<<k<<" tai vi tri thu "<<ketqua;
	}
	return 0;
}
void nhapmang(int M[],int n){
	for(int i=0;i<n;i++){
		cout<<"M["<<i<<"]=";
		cin>>M[i];
	}
}
void xuatmang(int M[],int n){
	// co the cout tai day cout<<"mang sau khi nhap la:";
	for(int i=0;i<n;i++){
		cout<<M[i]<<"\t";
	}
}
int timK(int M[],int n,int k){
	for(int i=0;i<n;i++){
		if(M[i]==k){
			return i;
		}
//		else {
//			return -1;
//		}
	}
	return -1;// van chua hieu tai sao phai return -1 ngoai vong for thay vi else return -1 ?????????
}

//	int n;
//	cout<<"nhap so phan tu trong mang:"<<endl;
//	cin>>n;
//	int M[n];
//	nhapmang(M,n);
//	cout<<"mang sau khi nhap la:"<<endl;
//	xuatmang(M,n);
//	int k;
//	cout<<"nhap k can tim:"<<"\t"; 
//	cin>>k;
//	int ketqua=timK(M,n,k);
//	if(ketqua==-1){ //neu viet ketqua==0 thi se  ko tim thay bien tai vi tri dau tien(vi tri 0) trong mang
//		cout<<"khong tim thay "<<k<<" trong mang"<<endl;
//	}else{
//		cout<<"tim thay "<<k<<" tai vi tri thu "<<ketqua<<endl;
//	}
//	sapxepmang(M,n);
//	cout<<"mang sau khi sap xep la:"<<endl;
//	xuatmang(M,n);

//void nhapmang(int M[],int n){
//	for(int i=0;i<n;i++){
//		cout<<"M["<<i<<"]=";
//		cin>>M[i];
//	}
//}
//void xuatmang(int M[],int n){
//	for(int i=0;i<n;i++){
//		cout<<M[i]<<"\t";
//	}
//}
//int timK(int M[],int n,int k){
//	for(int i=0;i<n;i++){
//		if(M[i]==k){
//			return i;
//		}
//	}
//	return -1;
//}
//void sapxepmang(int M[],int n){
//	for(int i=0;i<n-1;i++){
//		for(int j=i+1;j<n;j++){
//			if(M[i]>M[j]){
//				int tam=M[i];
//				M[i]=M[j];
//				M[j]=tam;
//			}
//		}
//	}
//}



//void NhapMang(int M[],int n);
//void XuatMang(int M[],int n);
//int TimK(int M[],int n,int k);
//void SapXepTangDan(int M[],int n);

//	int n;
//	cout<<"nhap so phan tu:";
//	cin>>n;
//	int M[n];
//	NhapMang(M,n);
//	cout<<"mang sau khi nhap:"<<endl;
//	XuatMang(M,n);
//	int k;
//	cout<<"\nnhap K de tim"<<endl;
//	cin>>k;
//	int kqTim=TimK(M,n,k);
//	if(kqTim==0){
//		cout<<"khong thay "<<k<<" trong mang";
//	}else{
//		cout<<"thay "<<k<<" tai vi tri thu "<<kqTim;
//	}
//	SapXepTangDan(M,n);
//	cout<<"\nmang sau khi sap xep"<<endl;
//	XuatMang(M,n);


//void NhapMang(int M[],int n){
//	for(int i=0;i<n;i++){
//		cout<<"M["<<i<<"]=";
//		cin>>M[i];
//	}
//}
//void XuatMang(int M[],int n){
//	for(int i=0;i<n;i++){
//		cout<<M[i]<<"\t";
//	}
//}
//int TimK(int M[],int n,int k){
//	for(int i=0;i<n;i++){
//		if(M[i]==k){ //neu tim thay k trong mang M[n] 
//			return i; //thi xuat ra k
//		}
//	}
//	return 0; //neu ko thay k trong mang M[n] ,return 0 la ko tim thay gi
//}
//void SapXepTangDan(int M[],int n){
//	for(int i=0;i<n-1;i++){
//		for(int j=i+1;j<n;j++){
//			if(M[i]>M[j]){
//				int tam=M[i];
//				M[i]=M[j];
//				M[j]=tam;
//			}	
//		}
//	}
//}

