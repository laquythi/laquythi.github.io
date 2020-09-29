#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	srand(time(NULL));
	do{
	int somay=1+rand()%100;
	cout<<"chuong trinh choi game doan so:\n";
	int solandoan=0;
	bool iswin=false;
	do{
		cout<<"may tinh da doan so[1..100],moi ban doan so:"<<endl;
		int songuoi;
		cin>>songuoi;
		solandoan++;
		cout<<"ban doan lan thu "<<solandoan<<endl;
		if(songuoi==somay){
			cout<<"ban doan dung,so may= "<<somay<<endl;
			iswin=true;
			break; // doan dung va ngung vong lap;
		}else if(songuoi>somay){
			cout<<"ban doan sai,so nguoi>so may"<<endl;
		}else{
			cout<<"ban doan sai,so nguoi<so may"<<endl;
		}
		if(solandoan==7){
			break; //doan sai 7 lan nen ngung doan
		}
	}while(true);
	if(iswin!=true){
		cout<<"GAME OVER"<<endl;
		cout<<"so cua may = "<<somay;
	}
	cout<<"\nban co muon choi tiep khong? c/k"<<endl;
		char c;
		cin>>c;
		if(c=='c'){
			continue;
		}else if(c=='k'){ //o day bam 'k' thi ngung game,con khi bam bat ky ky tu nao abc.... deu tiep tuc ^^!
			break;
		}
	}while(true);
	cout<<"good bye:";
	
	return 0;
}

//srand(time(NULL));
//	while(true){
//		int somay=1+rand()%100; //ran()%100 cho ra ket qua tu 0(min)-(max)99 ==> 1+ran()%100 se cho ra cac so tu 1-100
//		cout<<"chuong trinh choi game doan so:"<<endl;
//		int solandoan=0;
//		bool iswin=false;
//	do{
//		cout<<"may tinh da doan so [1..100],moi ban doan:"<<endl;
//		int songuoi;
//		cin>>songuoi;
//		solandoan++;
//		cout<<"ban doan lan thu "<<solandoan<<endl;
//		if(songuoi==somay){
//			cout<<"ban da doan trung,so may = "<<somay<<endl;
//			iswin=true;
//			break; // thang va ngung vong lap;
//		}else if(songuoi>somay){
//			cout<<"ban doan sai,so nguoi>so may"<<endl;
//		}else{
//		cout<<"ban doan sai,so nguoi<so may"<<endl;
//		}
//		if(solandoan==7){
//			break;
//		}
//	}while(true);
//	if(iswin!=true){
//		cout<<"game over"<<endl;
//		cout<<"so cua may = "<<somay<<endl;
//	}
//	cout<<"ban co muon choi tiep ko?(c/k):";
//	char c;
//	cin>>c;
//	if(c=='k'){
//		cout<<"GOODBYE!";
//		break; //ngung ko choi game nua;
//	}
//	}
