package recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void printAllSubSequence(int i, int nums[], int n, List<Integer> res) {
        if (i >= n) {
            if (res.isEmpty()) {
                System.out.println("[]");  // Print empty subsequence
            } else {
                System.out.println(res);  // Print current subsequence
            }
            return;
        }
        
        // Include current element
        res.add(nums[i]);
        printAllSubSequence(i + 1, nums, n, res);
        
        // Exclude current element
        res.remove(res.size() - 1);
        printAllSubSequence(i + 1, nums, n, res);

     
    }
    public static void main(String[] args) {
        System.out.println("hello recusrsion");
        int nums[] = {1,2,3} ;
        List<Integer> res = new ArrayList<>() ;
        printAllSubSequence(0,nums,3,res) ;
    }
}
