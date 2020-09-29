#include <iostream>
#include <stdio.h>
#include <stdlib.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void luufile(int number);
int main(int argc, char** argv) {
	while(true){
		int number;
		cout<<"nhap so:";
		cin>>number;
		luufile(number);
		char h;
		cout<<"nhap tiep khong?(c/k):";
		cin>>h;
		if(h=='k'){
			break;
		}
	}
	cout<<"ban da nhap xong!";
	FILE *file=fopen("csdl.txt","r");//r de doc file;
	int MChan[1000],iChan=0;
	while(true){
		char *line="\0";
		char buffer[5];
		line=fgets(buffer,5,file);
		if(line!=NULL){
			int number=atoi(line);
			//cout<<number<<endl;
			if(number%2==0){
				MChan[iChan++]=number;
			}
		}else{
			break;
		}
	}
	fclose(file);
	cout<<"\ncac so chan:";
	for(int i=0;i<iChan;i++){
		cout<<MChan[i]<<"\t";
	}
	return 0;
}

void luufile(int number){
	FILE *file=fopen("csdl.txt","a");//a la noi duoi file;
	char str[5];
	itoa(number,str,10);
	fputs(str,file);
	fputs("\n",file);
	fclose(file);
}
