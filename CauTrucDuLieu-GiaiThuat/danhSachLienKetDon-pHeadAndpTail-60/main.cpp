#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct Node{
	int data;
	Node *pNext;
};

struct SingleList{
	Node *pHead;
	Node *pTail;
};

void Initialize(SingleList &list){
	list.pHead = list.pTail = NULL;
}

void printList(SingleList list){
	Node *ptmp = list.pHead;
	if(ptmp == NULL){
		cout<<"danh sach rong.";
	}else{
		while(ptmp != NULL){
			cout<<ptmp->data<<"\t";
			ptmp = ptmp->pNext;
		}
	}
}

int sizeOfList(SingleList list){
	Node *ptmp = list.pHead;
	int nSize = 0;
	while(ptmp != NULL){
		nSize++;
		ptmp = ptmp->pNext;
	}
	return nSize;
}

Node *createNode(int d){
	Node *pNode = new Node;
	if(pNode == NULL){
		cout<<"loi cap phat bo nho.";
	}else{
		pNode->data = d;
		pNode->pNext = NULL;
	}
	return pNode;
}

void insertFirst(SingleList &list,int d){
	Node *pNode = createNode(d);
	if(list.pHead == NULL){
		list.pHead = list.pTail = pNode;
	}else{
		pNode->pNext = list.pHead;
		list.pHead = pNode;
	}
}

void insertLast(SingleList &list,int d){
	Node *pNode = createNode(d);
	if(list.pTail == NULL){
		list.pHead = list.pTail = pNode;
	}else{
		list.pTail->pNext = pNode;
		list.pTail = pNode;
	}
}

void insertMid(SingleList &list,int pos,int d){
	if(pos < 0 || pos >= sizeOfList(list)){
		cout<<"nhap sai vi tri\n";
		return;
	}if(pos == 0){
		insertFirst(list,d);
	}else if(pos == sizeOfList(list) - 1){
		insertLast(list,d);
	}else{
		Node *pNode = createNode(d);
		Node *pIns = list.pHead;
		Node *pPre = NULL;
		int i = 0;
		while(pIns != NULL){
			if(i == pos){
				break;
			}else{
				pPre = pIns;
				pIns = pIns->pNext;
				i++;
			}
			pPre->pNext = pNode;
			pNode->pNext = pIns;
		}
	}
}

void removeList(SingleList &list,int d){
	Node *pDel = list.pHead;
	if(pDel == NULL){
		cout<<"danh sach rong.";
	}else{
		Node *pPre = NULL;
		while(pDel != NULL){
			if(pDel->data == d){
				break;
			}else{
				pPre = pDel;
				pDel = pDel->pNext;
			}
		}
		if(pDel == NULL){
			cout<<"ko thay "<<d<<" de xoa";
		}else{
			if(pDel == list.pHead){
				list.pHead = list.pHead->pNext;
				pDel->pNext = NULL;
				delete pDel;
				pDel = NULL;
			}else if(pDel->pNext == NULL){
				list.pTail = pPre;
				pPre->pNext = NULL;
				delete pDel;
				pDel = NULL;
			}else{
				pPre->pNext = pDel->pNext;
				pDel->pNext = NULL;
				delete pDel;
				pDel = NULL;
			}
		}
	}
}

int main(int argc, char** argv) {
	SingleList(list);
	Initialize(list);
	insertLast(list,2020);
	insertFirst(list,91);
	insertFirst(list,9);
	insertLast(list,29);
	insertFirst(list,7);
	insertMid(list,2,17);
	insertMid(list,3,16);
	insertMid(list,0,14);
	insertMid(list,1,30);
	
	cout<<"cac node trong danh sach \n";
	printList(list);
	int size = sizeOfList(list);
	cout<<"\nco "<<size<<" node trong danh sach";
	
	removeList(list,2020);
	cout<<"cac node trong danh sach \n";
	printList(list);
	size = sizeOfList(list);
	cout<<"\nco "<<size<<" node trong danh sach";
	
	return 0;
}
