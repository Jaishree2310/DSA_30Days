//19 august 23
//86. Partition List

// public class Day17_Q1 {
//     public ListNode partition(ListNode head, int x) {
    
//         if(head == null || head.next == null) return head;
//         ListNode tem = head;
//         ListNode node = new ListNode(-1);
//         ListNode tem2 = node;
//         while(tem!=null){
//             if(tem.val<x){
//                 ListNode n = new ListNode(tem.val);
//                 node.next = n;
//                 node = n;
//             }
//             tem = tem.next;
//         }
//         tem = head;
//         while(tem!=null){
//             if(tem.val>=x){
//                 ListNode n = new ListNode(tem.val);
//                 node.next = n;
//                 node = n;
//             }
//             tem = tem.next;
//         }
//         return tem2.next;
// }
// }

public class Day17_Q1 {
    public static void main(String[] args) {
        // You can add your testing code here if needed
    }

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        
        ListNode smallerHead = new ListNode(-1);
        ListNode smaller = smallerHead;
        ListNode largerHead = new ListNode(-1);
        ListNode larger = largerHead;
        
        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                smaller.next = new ListNode(current.val);
                smaller = smaller.next;
            } else {
                larger.next = new ListNode(current.val);
                larger = larger.next;
            }
            current = current.next;
        }
        
        smaller.next = largerHead.next;
        return smallerHead.next;
    }
}

