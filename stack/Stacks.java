package stack;
import java.util.Stack;

public class Stacks {


    public int[] nextGreaterElement(int [] nums){
        System.out.println(nums);
        int [] res = new int[nums.length] ;
        int n = nums.length ;
        Stack<Integer> st = new Stack() ;
        for(int i = n-1;i>=0;i--){
            while (!st.isEmpty() && nums[i] >= st.peek()) {
                st.pop() ;
            }
            if(st.isEmpty()){
                res[i] = -1 ;
            }
            if(!st.isEmpty()){
            res[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return res ;
    }
    
}