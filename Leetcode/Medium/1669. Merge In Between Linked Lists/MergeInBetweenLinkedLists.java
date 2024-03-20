//package Medium.1669. Merge In Between Linked Lists;
 
public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2){
        ListNode left = null;
        ListNode right = list1;

        for(int i=0; i<=b; i++){
            if(i == a-1){
                left = right;
            }
            right = right.next;
        }
        left.next = list2;
        ListNode tmp = list2;

        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = right;
        return list1;
    }
}

/*

Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [10,1,13,1000000,1000001,1000002,5]

Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]

*/