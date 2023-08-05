public class Day3_Q1 {
    // Definition of the ListNode class
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        ListNode res = head;
        int index = 0, index2 = 0;
        while (cur.next != null) {
            cur = cur.next;
            index++;
        }
        int m = 0;
        if (index % 2 == 1) {
            m = (index / 2) + 1;
        } else {
            m = index / 2;
        }
        while (index2 < m) {
            res = res.next;
            index2++;
        }
        return res;
    }

    public static void main(String[] args) {
        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Testing the middleNode method
        Day3_Q1 solution = new Day3_Q1();
        ListNode middle = solution.middleNode(head);

        // Printing the result
        System.out.println("Middle node value: " + middle.val);
    }
}

