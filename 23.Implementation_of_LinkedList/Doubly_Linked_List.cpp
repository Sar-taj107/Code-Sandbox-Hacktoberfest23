#include<iostream>
using namespace std;
class Node {
    public:
    int data;
    Node* prev;
    Node* next;
Node(int d ) {
        this-> data = d;
        this->prev = NULL;
        this->next = NULL;
        }
~Node(){
        int val=this->data;
        if(next!=NULL) {
            delete next;
            next=NULL;
        }
        cout<<"deleted the node with data "<<val<< endl;
    }
};

void print(Node* head) {
    Node*temp=head ;
    while(temp != NULL) {
        cout<<temp->data << " ";
        temp=temp->next;
    }
    cout<<endl;
}

void insertAtHead(Node* &tail, Node* &head, int d) {
if(head==NULL) {
        Node*temp=new Node(d);
        head=temp;
        tail=temp;}
    else{
        Node*temp=new Node(d);
        temp->next=head;
        head ->prev=temp;
        head= temp;
    }

}


void insertAtTail(Node* &tail,Node* &head, int d){
    if(tail==NULL) {
        Node*temp = new Node(d);
        tail=temp;
        head=temp;
    }
    else{
        Node* temp = new Node(d);
        tail->next=temp;
        temp->prev=tail;
        tail=temp;
    }

}

void insertAtPosition(Node* & tail, Node* &head, int position, int d) {
    if(position==1) {
        insertAtHead(tail,head,d);
        return;
    }
    Node*temp=head;
    int cnt= 1;
while(cnt<position-1) {
        temp=temp->next;
        cnt++;}

    if(temp->next == NULL) {
        insertAtTail(tail,head,d);
        return ;
    }

    Node* nodeToInsert= new Node(d);
    nodeToInsert ->next= temp -> next;
    temp->next->prev=nodeToInsert;
    temp->next= nodeToInsert;
    nodeToInsert -> prev= temp;
};

void deleteNode(int position, Node* & head) { 

    if(position==1) {
        Node* temp = head;
        temp->next-> prev = NULL;
        head= temp ->next;
        temp-> next = NULL;
        delete temp;
    }
    else
    {  Node* curr=head;
         Node* prev=NULL;
      int cnt=1;
        while(cnt < position) {
            prev=curr;
            curr=curr->next;
            cnt++;}
       curr->prev= NULL;
        prev->next= curr -> next;
        curr->next= NULL;
        delete curr;
        }
};

void updateNode(Node* & tail, Node* &head, int position, int d){
    deleteNode(position,head);
    insertAtPosition(tail,head,position,d);
    return;
};
int main(){
 Node* head = NULL;
    Node* tail = NULL;
    insertAtHead(tail,head,5);
    insertAtHead(tail,head,9);
    insertAtHead(tail,head,12);
    insertAtHead(tail,head,15);
    insertAtTail(tail,head,20);
    insertAtPosition(tail,head,1,10);
   insertAtPosition(tail,head,4,13);
   insertAtPosition(tail,head,2,8);
    deleteNode(7, head);
    updateNode(tail,head,4,19);
    print(head);






return 0;
}