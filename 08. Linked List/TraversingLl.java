public class TraversingLl {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(13);
        head.next.next.next.next.next.next.next = new Node(15);

        callFun(head);
    }
    public static void callFun(Node head){
        Node current = head;
        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
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
