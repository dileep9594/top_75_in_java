package top_75_in_java.linkedList;


/**
 * ReverseList
 */

 /**
  * LinkedList
 
 */


public class ReverseList extends LinkedList {

    public void revList(){
               ListNode prev = null ;
               ListNode current = (ListNode) head;
               ListNode next = null ;
               while ( current != null) {
                next = current.next ;
                current.next = prev ;
                prev = current ;
                current = next ;
               }
               head = prev ;
    }

}
