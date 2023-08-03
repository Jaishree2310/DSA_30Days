//206. Reverse Linked List


// public class Day1_Q2 {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;  
//         ListNode current = head;
    
//         while (current != null) { 
//             ListNode next = current.next; 
//             current.next = prev;
//             prev = current;
//             current = next;
//         }
        
//         return prev; 
//     }
// }


public class Day1_Q2 {
    public ListNode reverseList(ListNode head) {
        return head;
    
    }
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        Day1_Q2 day1 = new Day1_Q2();
        ListNode reversedList = day1.reverseList(head);

        // Print the reversed list to verify the result.
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}
