package top_75_in_java.linkedList;


/**
 * ReverseList
 */

 /**
  * LinkedList
 
 */


public class ReverseList extends LinkedList {

    public void revList(){
               Node prev = null ;
               Node current = (Node) head;
               Node next = null ;
               while ( current != null) {
                next = current.next ;
                current.next = prev ;
                prev = current ;
                current = next ;
               }
               head = prev ;
    }

}
