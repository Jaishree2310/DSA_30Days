//141. Linked List Cycle


// public class Day8_Q2 {

//         public boolean hasCycle(ListNode head) {
//              ListNode fast = head;
//             ListNode slow = head;
//             while (fast != null && fast.next != null) {
//                 fast = fast.next.next;
//                 slow = slow.next;
//                 if (fast == slow) {
//                     return true;
//                 }
//             }
//             return false;
//         }
//     }

public class Day8_Q2 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage of the hasCycle method
        Day8_Q2 solution = new Day8_Q2();

        // Create a linked list with a cycle for testing
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creating a cycle

        boolean result = solution.hasCycle(node1);
        System.out.println("Cycle detected: " + result);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
