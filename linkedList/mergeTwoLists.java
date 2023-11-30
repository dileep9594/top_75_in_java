package top_75_in_java.linkedList;

public class mergeTwoLists extends LinkedList{
    
    
    public LinkedList mergeLists(LinkedList list1 ,LinkedList list2) {

        ListNode dummy = new ListNode(-1) ;
        ListNode current = dummy ;

        while ( list1 != null || list2 != null) {

            if (list1.data < list2.data) {
                current.next = list1 ;
                list1 = list1.next ;
            }else {
                current.next = list2 ;
                list2 = list2.next ;
            }
            current = current.next ;
            
        }
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
    return dummy.next ;
}

}
