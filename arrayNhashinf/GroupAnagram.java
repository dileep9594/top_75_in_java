package arrayNhashinf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    
    public List<List<String>> groupAnagram(String [] strs){
        Map<String,List<String>> ans = new HashMap<>() ;
        for(String s : strs){
            int[] count = new int[26] ;
            for(char c : s.toCharArray()){
                count[c-'a']++ ;
            }
            String key = Arrays.toString(count) ;

            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
