//2095. Delete the Middle Node of a Linked List

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day18_Q2 {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        int count = 0;
        ListNode p1 = head, p2 = head;
        while (p1 != null) {
            count += 1;
            p1 = p1.next;
        }

        int middleIndex = count / 2;

        for (int i = 0; i < middleIndex - 1; ++i)
            p2 = p2.next;
        p2.next = p2.next.next;
        return head;
    }

    public static void main(String[] args) {
        // Create a linked list and test the deleteMiddle method here
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Day18_Q2 solution = new Day18_Q2();
        ListNode newHead = solution.deleteMiddle(head);

        // Print the updated linked list to verify
        ListNode current = newHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
