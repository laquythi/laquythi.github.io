#include <iostream>
#include <time.h>
#include <stdlib.h>
#include <stdio.h> 

using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void play();
void loopplay();
int main(int argc, char** argv) {
	srand(time(NULL));
	play();
//	loopplay();
	return 0;
}

void play(){
//	int somay=1+rand()%100;
	int somay = 1+rand()%10;
	int solandoan=0;
	int songuoi;
	do{
		cout<<"\nmay tinh da doan so [1..10],moi ban doan:"<<endl;
		cin>>songuoi;
		solandoan++;
		cout<<"ban doan lan thu "<<solandoan<<endl;
		if(songuoi==somay){
			cout<<"ban doan dung,so may="<<somay;
			cout<<"\nban co muon choi tiep khong? (c/k):"<<endl;
			char c;
			cin>>c;
			if(c=='c'){
				play();
			}else{
				cout<<"cam on ban da danh thoi gian.";
				exit(0);
			}
		}else if(songuoi<somay){
			cout<<"ban doan sai,so nguoi < so may";
		}else{
			cout<<"ban doan sai,so nguoi > so may";
		}
		if(solandoan==7){
			cout<<"\nban doan sai qua 7 lan,game over,so may="<<somay;
			cout<<"\nban co muon choi tiep khong? (c/k):"<<endl;
			char c;
			cin>>c;
			if(c=='c'){
				play();
			}else{
				cout<<"cam on ban da danh thoi gian.";
				exit(0);
			}
		}
	}while(true);
}

//void loopplay(){
//	do{
//		play();
//	}while(true);
//	cout<<"cam on ban da choi game.";
//}

// doan code nay viet tu 01-2019,hien dang co bug khi choi lan 2 tro di,'k' or 'anycharacter' => ko the thoat game
// hien tai 01-2021 da fix dc loi,nhung ko can dung ham loopplay()
//	srand(time(NULL));
//	//play();
//	loopplay();

//	void play(){
//	int somay=1+rand()%100;
//	int solandoan=0;
//	int songuoi;
//	do{
//		cout<<"\nmay tinh da doan so [1...1000],moi ban doan:";
//		cin>>songuoi;
//		solandoan++;
//		cout<<"ban doan lan thu "<<solandoan<<endl;
//		if(songuoi==somay){
//			cout<<"ban doan dung,so may = "<<somay;
//		}else if(songuoi>somay){
//			cout<<"ban doan sai,so nguoi > so may";
//		}else{
//			cout<<"ban doan sai,so nguoi < so may";
//		}
//		if(solandoan==7){
//			cout<<"\nban doan sai qua 7 lan,so may = "<<somay;
//			break;
//		}
//	}while(true);
//}
//
//void loopplay(){
//	do{
//		play();
//		cout<<"\nban co muon choi tiep khong? (c/k):\t";
//		char c;
//		cin>>c;
//		if(c=='c'){
//			play();
//		}else{
//			break;
//		}
//	}while(true);
//	cout<<"cam on ban da choi game";
//}
