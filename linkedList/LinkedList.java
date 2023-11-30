package top_75_in_java.linkedList;




public class LinkedList{
    ListNode head ;
    
    public LinkedList(){
        
    }

 public void printList() {
    ListNode current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
    
}
 