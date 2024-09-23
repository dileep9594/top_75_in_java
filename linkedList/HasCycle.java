package linkedList;

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
    
        ListNode slow = head;
        ListNode fast = head;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move the slow pointer by one step
            fast = fast.next.next;   // Move the fast pointer by two steps
    
            if (slow == fast) {
                // If the slow and fast pointers meet, there is a cycle
                return true;
            }
        }
    
        // If the fast pointer reaches the end of the list, there is no cycle
        return false;
    }
    
}
