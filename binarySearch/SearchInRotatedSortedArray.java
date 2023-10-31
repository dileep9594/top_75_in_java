package top_75_in_java.binarySearch;

public class SearchInRotatedSortedArray {

    public int SearchInRotatedSortedArray(int nums [],int target){
        int left = 0;
        int right = nums.length -1;
        while (left <= right){
            int mid = (left + right)/2;
        
               if (nums[mid] == target) {
                  return mid;
               }
               if (nums[left] <= nums[mid]) {
                    if (target >= nums[left] && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
        }
        }
        return -1 ;
    }
}
