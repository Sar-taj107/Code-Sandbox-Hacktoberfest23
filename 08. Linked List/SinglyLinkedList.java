public class SinglyLinkedList{
    public static void main(String[] args){
        Node head= new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next=temp1;
        temp1.next=temp2;
       // System.out.println(head.data);
        //System.out.println(temp1.data);
        //System.out.println(temp2.data);
        System.out.println(head.data+ " "+temp1.data+" " +temp2.data);
        
    }
    
}
class Node{
    int data;
    Node next;
    Node(int a){
        data =a;
        next = null;
    }


}