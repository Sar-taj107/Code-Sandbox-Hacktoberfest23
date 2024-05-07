//package Medium.2816. Double a Number Represented as a Linked List;
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DoubleaNumberRepresentedasaLinkedList {
    int solve(ListNode head){
        if(head == null){
            return 0;
        }
        int carry = solve(head.next);
        int newValue = (head.val) * 2 + carry;
        head.val = newValue % 10;
        return newValue >= 10 ? 1 : 0;
    }

    public ListNode doubleIt(ListNode head) {
        int lastCarry = solve(head);
        if(lastCarry > 0){
            ListNode newHead = new ListNode(lastCarry);
            newHead.next = head;
            return newHead;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the linked list:");
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for (int i = 0; i < n; i++) {
            cur.next = new ListNode(sc.nextInt());
            cur = cur.next;
        }
        ListNode head = dummy.next;

        DoubleaNumberRepresentedasaLinkedList solution = new DoubleaNumberRepresentedasaLinkedList();
        ListNode result = solution.doubleIt(head);

        System.out.print("Linked list after doubling each node:");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
