package top_75_in_java.linkedList;

public class Main {
    public static void main(String[] args)
    {
        ReverseList list = new ReverseList() ;
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        System.out.println("Original LinkedList");
        list.printList();

        list.revList();

        System.out.println("Reversed linkedlist ");
        list.printList();
        LinkedList list1 = new LinkedList();
        list1.head = new Node(1);
        list1.head.next = new Node(3);
        list1.head.next.next = new Node(5);

        LinkedList list2 = new LinkedList();

        list2.head = new Node(2);
        list2.head.next = new Node(4);
        list2.head.next.next = new Node(6);

        // mergeTwoLists merge = new mergeTwoLists() ;
        // Node res = merge.mergeLists(list1, list2) ;
    }
    
}
