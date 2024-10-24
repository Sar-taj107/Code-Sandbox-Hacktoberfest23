import java.util.*;
public class ElementFindUsiRecu {
    public static void main(String[] args){
        Node head = new Node(3);
        head.next  = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);
       

        System.out.println("Enter the Element to be search:");
        Scanner sc  = new Scanner(System.in);
        int c;
        c=sc.nextInt();
        System.out.println("Element present at index:"+(searchElement(head,c)));
        
    }
    public static int searchElement(Node head, int x){
       if(head == null){
        return -1;
       }
        if(head.data == x){
            return 1;
        }
        else{
        int taj;
        taj=searchElement(head.next, x); 
        
        if(taj==-1){

            return -1;
            
        
        }else{
            return taj+1;
        }
        }
       }
}
class Node{
    int data;
    Node next;
    Node(int a){
        data = a;
        next = null;
    }
}
