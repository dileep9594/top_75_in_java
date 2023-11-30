package top_75_in_java.linkedList;



public class Main {
    public static void main(String[] args)
    {
        ReverseList list = new ReverseList() ;
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);
        System.out.println("Original LinkedList");
        list.printList();

        list.revList();

        System.out.println("Reversed linkedlist ");
        list.printList();
        LinkedList list1 = new LinkedList();
        list1.head = new ListNode(1);
        list1.head.next = new ListNode(3);
        list1.head.next.next = new ListNode(5);

        LinkedList list2 = new LinkedList();

        list2.head = new ListNode(2);
        list2.head.next = new ListNode(4);
        list2.head.next.next = new ListNode(6);

        // mergeTwoLists merge = new mergeTwoLists() ;
        // Node res = merge.mergeLists(list1, list2) ;
    }
    
}
