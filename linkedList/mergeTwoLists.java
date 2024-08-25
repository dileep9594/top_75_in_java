package linkedList;

public class mergeTwoLists {
    
    
    public LinkedList mergeLists(LinkedList list1 ,LinkedList list2) {

        ListNode node = new ListNode(-1) ;
        LinkedList dummy = new LinkedList(node) ;
        LinkedList current = dummy ;

        while ( list1 != null || list2 != null) {

            if (list1.head.data < list2.head.data) {
                current.head.next = list1.head ;
                list1.head = list1.head.next ;
            }else {
                current.head.next = list2.head ;
                list2.head.next = list2.head ;
            }
            current.head.next = current.head.next.next ;

            if (list1 != null) {
                current.head.next = list1.head;
            } else {
                current.head.next = list2.head;
            }
            
        }
       
    return dummy ;
}

}
