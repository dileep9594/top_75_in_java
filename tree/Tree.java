package tree;


import java.util.*;


public class Tree {
    
    public Node mirror(Node root){
        if(root == null){
            return null ;
        }
        Queue<Node> q = new LinkedList() ;
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll() ;

            Node tmep = curr.left ;
            curr.left = curr.right ;
            curr.right = tmep ;
            if(curr.left != null){
                q.add(curr.left) ;
            }
            if (curr.right != null) {
                q.add(curr.right) ; 
            }  
        }
        return root ;
    }

    public void inOrder(Node root){
           if(root == null){
            return  ;
           }
           inOrder(root.left);
           System.err.println(root.data + " ");
           inOrder(root.right);
    }

    public List<Integer> printLeftView(Node root){
        List<Integer> ans = new ArrayList() ;
        Queue<Node> que = new LinkedList() ;
        que.add(root);
        while (!que.isEmpty()) {
            int size = que.size() ;
            for(int i = 1 ;i<size ;i++){
                Node node = que.poll() ;
                  if(i == 1){
                    ans.add(node.data) ;
                  }
                  if(node.left != null){
                    que.add(node.left) ;
                  }
                  if(node.right != null){
                    que.add(node.right) ;
                  }

            }
        }
        return ans ;
    }

    public List<Integer> printRightView(Node root){
        List<Integer> ans = new ArrayList() ;
        Queue<Node> que = new LinkedList() ;
        que.add(root) ;
        while (!que.isEmpty()) {
            int n = que.size() ;
            Node rightMost =null; 
            for(int i =0 ;i<=n;i++){
                Node node = que.poll() ;
                if(node != null){
                    rightMost = node ;
                    que.offer(node.left) ;
                    que.offer(node.right) ;
                }
            }
            if(rightMost != null){
                ans.add(rightMost.data) ;
            }
        }
        return ans ;
    }
    
    public static boolean valid(Node node ,Double left , Double right){
        if (node == null) {
            return true ;            
        }
        if(!(left < node.data && node.data < right)){
            return false ;
        }
        int leftval =  (int) node.data ;
        return (valid(node.left, left, leftval) && valid(node.right, leftval, right) );
    }
    public boolean isValid(Node root){
        return valid(root , Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY) ;
    }
}
