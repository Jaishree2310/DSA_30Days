//2. Add Two Numbers

public class Day11_Q1 {
    public static void main(String[] args) {
        // You can create instances of ListNode and call the addTwoNumbers method here
        // For example:
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Day11_Q1 solution = new Day11_Q1();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result or perform any other operations you need
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    // You can keep your existing addTwoNumbers method here
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return l2;
    
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
