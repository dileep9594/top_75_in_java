package slidingwindow;

import java.util.HashSet;

public class SlidingWindow {
    
    public int maxProfit(int[] prices) {
        return  0 ;
    }

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> uniq = new HashSet() ;
        int l =0 ;
        int res = 0 ;
        for(int r =0 ;r<s.length();r++){
            while(uniq.contains(s.charAt(r))){
                uniq.remove(s.charAt(l)) ;
                l++ ;
            }
            uniq.add(s.charAt(r)) ;
            res = Math.max(res, r-l+1) ;
        }
        return res ;
    }

    public int characterReplacement(String s, int k) {
        return 0 ;
    }

    public boolean checkInclusion(String s1, String s2) {
       return true ; 
    }

    public String minWindow(String s, String t) {
        return " ";
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans [] = new int[0] ;
        return ans ;
    }

}
