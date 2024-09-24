package tree;

public class Main {
    
    public static void main(String[] args) {
        Node root = new Node(1.0) ;
        root.left = new Node(2.0) ;
        root.right = new Node(3.0);
        root.left.left = new Node(4.0) ;
        root.left.right = new Node(5.0) ;

        Tree tree = new Tree() ;

        Node node = tree.mirror(root);
        tree.inOrder(node);
    }
}
