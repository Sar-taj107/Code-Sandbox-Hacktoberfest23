import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}

public class DeleteNodeinaLinkedList {
    public static void deleteNode(ListNode node) {
        ListNode prev = null;
        while (node != null && node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        if (prev != null) {
            prev.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = scanner.nextInt();

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        System.out.println("Enter the values of the nodes:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }

        System.out.println("Original List:");
        printList(dummyHead.next);

        System.out.println("Enter the value of the node to be deleted: ");
        int deleteVal = scanner.nextInt();

        ListNode nodeToDelete = findNode(dummyHead.next, deleteVal);
        if (nodeToDelete != null) {
            deleteNode(nodeToDelete);
            System.out.println("List after deletion:");
            printList(dummyHead.next);
        } else {
            System.out.println("Node with value " + deleteVal + " not found in the list.");
        }

        scanner.close();
    }

    private static ListNode findNode(ListNode head, int target) {
        ListNode current = head;
        while (current != null) {
            if (current.val == target) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

/*
Output:

Enter the number of nodes: 4
Enter the values of the nodes: 4 5 1 9
Original List: 4 5 1 9
Enter the value of the node to be deleted: 5
List after deletion: 4 1 9

Enter the number of nodes: 4
Enter the values of the nodes: 4 5 1 9
Original List:4 5 1 9 
Enter the value of the node to be deleted: 
List after deletion:4 5 9 

*/