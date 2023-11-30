package top_75_in_java.linkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class mergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
        return null;
    }

    PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<ListNode>() {
        public int compare(ListNode a, ListNode b) {
            return a.data - b.data;
        }
    });

    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    for (ListNode list : lists) {
        if (list != null) {
            minHeap.add(list);
        }
    }

    while (!minHeap.isEmpty()) {
        ListNode minNode = minHeap.poll();
        current.next = minNode;
        current = current.next;

        if (minNode.next != null) {
            minHeap.add(minNode.next);
        }
    }

    return dummy.next;
}

}
