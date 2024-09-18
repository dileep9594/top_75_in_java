package arrayNhashinf;

import java.util.Arrays;

public class Anagram {
    // sorting method to check if a string is anagram or not O(m*log(m) + n * log(n))
    public static boolean isAnagram(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false ;
        }
        char [] charArray1 = s1.toCharArray() ;
        char [] charArray2  = s2.toCharArray() ;
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }

    public static boolean areAnagrams(String s1 ,String s2){
        if(s1.length() != s2.length()){
            return false ;
        }
        char [] temp1 = s1.toCharArray() ;
        char [] temp2 = s2.toCharArray() ;
        int [] count = new int[26] ;

        for(char c:temp1){
            count[c-'a']++ ;
        }
        for(char c:temp2){
            count[c-'a']--;
                }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        
      return true;
     }
}
