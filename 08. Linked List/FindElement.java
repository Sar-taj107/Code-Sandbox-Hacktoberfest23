import java.util.Scanner;
public class FindElement {
    public static void main(String[] args){
        Node head = new Node(3);
        head.next  = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);
       

        System.out.println("Enter the Element to be search:");
        Scanner sc  = new Scanner(System.in);
        int c=sc.nextInt();
        System.out.println("Element present at index:"+(searchElement(head,c)));
        
    }
    public static int searchElement(Node head, int x){
        int count = 0;
        Node current = head; 
        while(current!=null){
            count++;
           // System.out.println(head.data+" ");
            
        
        if(current.data==x){
            return count;
        } 
        current = current.next;
        

}
return -1;

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


