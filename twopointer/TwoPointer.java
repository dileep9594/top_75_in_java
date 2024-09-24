package twopointer;

import java.util.ArrayList;
import java.util.List;

public class TwoPointer {

    public boolean isPalindrome(String s) {
    return true ;    
    }

    public int[] twoSum(int[] numbers, int target) {
        int ans [] = new int[2];
        return ans ;
    }

    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> ans = new ArrayList() ;
        int n = nums.length; 
        for(int i =0 ;i<n;i++){
            for(int j =0 ;j<n;j++){
                for(int k =0 ;k<n;k++){
                     
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> temp = new ArrayList<>() ;
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]) ;

                        ans.add(new ArrayList(temp));
                    }
                }
            }

        }
        return ans ;
    }
   
    public int maxArea(int[] heights) {
    
        return 0;
    }
  
    public int trap(int[] height) {
        return 0;
    }




}
