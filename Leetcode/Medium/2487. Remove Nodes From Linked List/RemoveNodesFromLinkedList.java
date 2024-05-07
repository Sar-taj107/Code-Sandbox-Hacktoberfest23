//package Medium.2487. Remove Nodes From Linked List;
//TC - O(n) 
//SC - O(n)
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class RemoveNodesFromLinkedList {
    ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
    
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        int maxNode = -1;
        ListNode prev = null;
        ListNode cur = head;

        while(cur != null){
            maxNode = Math.max(maxNode, cur.val);
            if(cur.val < maxNode){
                if(prev != null) {
                    prev.next = cur.next;
                } else {
                    head = cur.next;
                }
                ListNode tmp = cur;
                cur = cur.next;
                tmp.next = null;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return reverseList(head);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the linked list:");
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for (int i = 0; i < n; i++) {
            cur.next = new ListNode(scanner.nextInt());
            cur = cur.next;
        }
        ListNode head = dummy.next;

        RemoveNodesFromLinkedList solution = new RemoveNodesFromLinkedList();
        ListNode result = solution.removeNodes(head);

        System.out.print("Linked list after removing nodes with values less than the maximum encountered:");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
