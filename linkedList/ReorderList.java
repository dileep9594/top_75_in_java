package linkedList;

public class ReorderList {
    
    public void ReorderList(ListNode head){
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
    
        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    
        // Step 2: Reverse the second half of the list
        ListNode prev = null;
        ListNode current = slow.next;
        slow.next = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    
        // Step 3: Merge the two halves together
        ListNode first = head;
        ListNode second = prev;
        while (first != null && second != null) {
            ListNode next1 = first.next;
            ListNode next2 = second.next;
            first.next = second;
            second.next = next1;
            first = next1;
            second = next2;
        }

    }
}
