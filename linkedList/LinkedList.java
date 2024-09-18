package linkedList;


public class LinkedList{

    public ListNode head ;
    public LinkedList(){
        this.head = null ;
    }
    public LinkedList(ListNode node){
        this.head = node;

    } 
    public ListNode addNode(ListNode node){
        ListNode temp = this.head ;
             if(head ==null){
                this.head = node ;
             }
             while (temp.next != null) {
                 temp = temp.next ;                
             }
             temp.next = node ;
            return head;
    }

 public ListNode printList() {
    ListNode current = head;
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;
    }
    System.out.println();
    return head ;
}
public ListNode revList(){
    ListNode prev = null ;
    ListNode current = head;
    ListNode next = null ;
    while ( current != null) {
        next = current.next ;
        current.next = prev ;
        prev = current ;
        current = next ;
    }
        head = prev ;

    return head ;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode current = this.head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
 