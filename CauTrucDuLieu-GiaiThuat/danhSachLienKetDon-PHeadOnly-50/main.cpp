#include <iostream>
#include <list>
using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct Node{
	int data;
	Node *pNext;
};

struct SingleList{
	Node *pHead;
};

void Intialize(SingleList &list){
	list.pHead = NULL;
}

Node *CreateNode(int d){
	Node *pNode = new Node;
	if(pNode != NULL){
		pNode->data = d;
		pNode->pNext = NULL;
	}else{
		cout<<"cap phat bo nho that bai.";
	}
	return pNode;
}

void printList(SingleList list){
	Node *ptmp = list.pHead;
	if(ptmp == NULL){
		cout<<"danh sach rong.";
		return;
	}
	while(ptmp != NULL){
		cout<<ptmp->data<<"\t";
		ptmp = ptmp->pNext;
	}
}

int sizeOfList(SingleList list){
	Node *ptmp = list.pHead;
	int nSize = 0;
	while(ptmp != NULL){
		ptmp = ptmp->pNext;
		nSize++;
	}
	return nSize;
}

void insertFirst(SingleList &list,int d){
	Node *pNode = CreateNode(d);
	if(list.pHead == NULL){
		list.pHead = pNode;
	}else{
		pNode->pNext = list.pHead;
		list.pHead = pNode;
	}
}

void insertLast(SingleList &list,int d){
	Node *pNode = CreateNode(d);
	if(list.pHead == NULL){
		list.pHead = pNode;
	}else{
		Node *ptmp = list.pHead;
		while(ptmp->pNext != NULL){
			ptmp = ptmp->pNext;
		}
		ptmp->pNext = pNode;
	}
}

// dang co BUG o insertMid
//void insertMid(SingleList &list,int pos,int d){
//	if(pos < 0 || pos >= SizeOfList(list)){
//		cout<<"vi tri chen ko hop le.";
//		return;
//	}if(pos == 0)
//		insertFirst(list,d);
//		else if(pos == SizeOfList(list)-1)
//			insertLast(list,d);
//		else{
//			Node *pNode = CreateNode(d);
//			Node *pIns = list.pHead;
//			Node *pPre = NULL;
//			int i = 0;
//			while(pIns != NULL){
//				if(i == pos){ // vi tri muon chen
//					break;
//				pPre = pIns;
//				pIns = pIns->pNext;
//				i++;	
//			}
//			pNode->pNext = pIns;
//			pPre->pNext = pNode;
//		}
//	}
//}

void removeNode(SingleList &list,int d){
	Node *pDel = list.pHead;
	if(pDel == NULL){
		cout<<"danh sach hien dang rong.";
	}else{
		Node *pPre = NULL;
		while(pDel!= NULL){
			if(pDel->data == d){
				break; // da tim thay pDel
			}
			pPre = pDel;
			pDel = pDel->pNext; 
		}
		if(pDel == NULL){
			cout<<"ko tim thay "<<d<<" de xoa.";
		}else{
			if(pDel == list.pHead){
				list.pHead = list.pHead -> pNext;
				pDel -> pNext = NULL;
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

Node *searchNode(SingleList list,int d){
	Node *ptmp = list.pHead;
	while(ptmp != NULL){
		if(ptmp->data == d){
			break;	
		}
		ptmp = ptmp->pNext;
	}
	return ptmp;
}

void sortList(SingleList &list){
	for(Node *ptmp = list.pHead;ptmp != NULL;ptmp = ptmp->pNext){
		for(Node *ptmp2 = ptmp->pNext;ptmp2!= NULL;ptmp2 = ptmp2->pNext){
			if(ptmp2->data<ptmp->data){
				int tmp = ptmp->data;
				ptmp->data = ptmp2->data;
				ptmp2->data = tmp;
			}
		}
	}
}

void freeMemory(SingleList &list){
	cout<<"bat dau thu hoi bo nho\n";
	while(list.pHead != NULL){
		Node *ptmp = list.pHead;
		list.pHead = list.pHead -> pNext;
		ptmp->pNext = NULL;
		cout<<"da xoa so "<<ptmp->data<<"\n";
		delete ptmp;
		ptmp = NULL;
	}
	cout<<"xoa thanh cong danh sach.";
}

int main(int argc, char** argv) {
	SingleList list;
	Intialize(list);
	
	insertFirst(list,8);
	insertLast(list,10);
	insertFirst(list,20);
//	insertMid(list,1,113);
//	insertMid(list,2,118);
	insertLast(list,22);
	insertLast(list,17);
//	insertMid(list,1,17);
	
	printList(list);
	cout<<"\nxoa so 20:\n";
	removeNode(list,20);
	printList(list);
	
	int n = sizeOfList(list);
	cout<<"\nco "<<n<<" node";
	
	int d;
	cout<<"\nnhap gia tri muon tim :\n";
	cin>>d;
	Node *pSearch = searchNode(list,d);
	if(pSearch != NULL){
		cout<<"tim thay "<<pSearch->data<<" trong list";
	}else{
		cout<<"ko tim thay "<<d;
	}
	
	sortList(list);
	cout<<"\nlist sau khi sort la : \n";
	printList(list);
	
	freeMemory(list);
	return 0;
}
