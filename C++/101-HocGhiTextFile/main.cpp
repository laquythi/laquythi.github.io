#include <iostream>
#include <stdio.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void luutext(){
	FILE *file=fopen("csdl.txt","w");
	fputs("sv01;thi;7/9/1991\n",file);
	fputs("sv02;trang;25/9/1996\n",file);
	fputs("sv03;nhung;7/1/2000\n",file);
	fclose(file);
}
void doctext(){
	FILE *file=fopen("csdl.txt","r");
	char *s="\n";//co the la "\0" hoac bat ky ky tu nao......
	do{
		char line[150];//dinh nghia moi dong co 150 ky tu;
		s=fgets(line,150,file);//lay noi dung ben trong line;
		if(s==NULL){
			break;
		}else{
			cout<<s;//in ra noi dung tung dong(line) trong file;
		}
	}while(true);
	fclose(file);
}
int main(int argc, char** argv) {
	doctext();
	return 0;
}
