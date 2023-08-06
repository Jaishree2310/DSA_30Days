//convert binary number in the LL to integer
public class Day3_Q2 {

    public int getDecimalValue(ListNode head) {
        int len = 0;
        int sum = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        len--;
        curr = head;
        while (curr != null) {
            sum += curr.val * (int) Math.pow(2, len--);
            curr = curr.next;
        }

        return sum;
    }

    // Definition of the ListNode class
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // Create the linked list: 1 -> 0 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        // Create the instance of the class and call the method
        Day3_Q2 solution = new Day3_Q2();
        int decimalValue = solution.getDecimalValue(head);

        // Print the result
        System.out.println("Decimal Value: " + decimalValue);
    }
}
