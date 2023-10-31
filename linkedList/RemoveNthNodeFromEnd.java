package top_75_in_java.linkedList;

public class RemoveNthNodeFromEnd {
    

    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
    
        // Move the first pointer n nodes ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
    
        // Move both pointers until the first pointer reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
    
        // Update the second pointer to remove the nth node from the end
        second.next = second.next.next;
    
        return dummy.next;
    }
}
