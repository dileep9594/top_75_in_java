package linkedList;



public class Main {
    public static void main(String[] args)
    {
     
        LinkedList list = new LinkedList(new ListNode(1)) ;
        list.addNode(new ListNode(2)) ;
        list.addNode(new ListNode(3));
        list.addNode(new ListNode(5));
        System.out.println(list);
        
        System.out.println(list.printList());

        ListNode temp = list.revList() ;
        System.out.println(temp);
    
 }

}
