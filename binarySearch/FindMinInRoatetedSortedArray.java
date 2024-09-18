package binarySearch;

public class FindMinInRoatetedSortedArray {
    
    public int findMinInRoatetedSortedArray (int nums[]){
        int left =0 ;
        int right = nums.length-1;
        while (left <right ){
            int mid = (left + right)/2;

            if(nums[mid] > nums[right]){
                left = mid+1;
            }else{
                right = mid ;
            }

        }
        return nums[left];
        
    }
}
