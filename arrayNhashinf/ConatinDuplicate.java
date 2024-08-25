package arrayNhashinf;

import java.util.HashSet;
import java.util.Set;

public class ConatinDuplicate {
    
   
    public Boolean containdup(int [] nums){
        Set<Integer> duplicates = new HashSet<>() ;

        for(int i = 0;i<nums.length;i++){
            if(duplicates.contains(nums[i])){
                return true ;
            }
            duplicates.add(nums[i]);
        }
  return false ;
    }
}
