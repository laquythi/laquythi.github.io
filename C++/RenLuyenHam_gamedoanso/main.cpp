#include <iostream>
#include <time.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void play();
void loopplay();
int main(int argc, char** argv) {
	srand(time(NULL));
	//play();
	loopplay();
	return 0;
}

void play(){
	int somay=1+rand()%100;
	int solandoan=0;
	int songuoi;
	do{
		cout<<"\nmay tinh da doan so [1..100],moi ban doan:"<<endl;
		cin>>songuoi;
		solandoan++;
		cout<<"ban doan lan thu "<<solandoan<<endl;
		if(songuoi==somay){
			cout<<"ban doan dung,so may="<<somay;
		}else if(songuoi<somay){
			cout<<"ban doan sai,so nguoi < so may";
		}else{
			cout<<"ban doan sai,so nguoi > so may";
		}
		if(solandoan==7){
			cout<<"\nban doan sai qua 7 lan,game over,so may="<<somay;
			break;
		}
	}while(true);
}
void loopplay(){
	do{
		play();
			cout<<"\nban co muon choi tiep khong? (c/k):"<<endl;
			char c;
			cin>>c;
			if(c=='k'){
				break;
			}else if(c=='c'){
				play();
			}else{
				break;
			}
	}while(true);
	cout<<"cam on ban da choi game.";
}

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
