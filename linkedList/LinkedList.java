package top_75_in_java.linkedList;


class  Node {
    int data ;
    Node next ;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
}

public class LinkedList{
    Node head ;
    
public LinkedList(int val) { this.head.data = val; }

 public void printList() {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
    
}
 