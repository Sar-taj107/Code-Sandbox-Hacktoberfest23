//1. recursive approach
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    
    public ListNode reverse(ListNode head, ListNode prev){
        if(head == null) return prev;
        ListNode next = head.next;
        head.next = prev;
        return reverse(next, head);
    }
}
----------------------------------------**************************************--------------------------------------
//2. iterative approach
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null. curr = head;
        while(curr != null)
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
