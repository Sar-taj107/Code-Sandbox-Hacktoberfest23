 #include<iostream>
using namespace std;
class node{
    public:
    int data;
    node* next;
    node(int data){
        this->data=data;
        next=NULL;
    }
};
node* takeinput(){
        int data;
        cin>>data;                             
        node*head=NULL;
        node*tail=NULL;

        while(data!=-1){
            node* newnode= new node(data);
         if(head==NULL){                                           
            head=newnode;
            tail=newnode;

        }
        else{
            tail->next=newnode;
            tail=tail->next;}
        cin>>data;}
        return head;}
        
      node* insertnode(node *head,int i,int data){
        node*temp=head;
        node*newnode=new node(data);
        int count=0;
        if(i==0){
            newnode->next=head;
            head=newnode;
            return head;      
        }                        
      while(temp!=NULL && count<i-1){
        temp=temp->next;
        count++;
        }
        if(temp!=NULL){
           newnode->next=temp->next;
           temp->next=newnode;
        }
        return head;
       };
      
        void reverseList(node*head){
           if(head->next!=NULL){
            reverseList(head->next);
             }  
           cout<<head->data<<" ";
           return;
           
        };
        void print(node*head){node*temp=head;
            while(temp!=NULL){
                cout<<temp->data<<" " ;
                temp=temp->next;}
                cout<<endl;
        }
        int main(){
             node*head=takeinput();
             insertnode(head,3,99);
             print(head);
             reverseList(head);


 }