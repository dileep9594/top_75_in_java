package binarySearch;

public class Main {
     
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2} ;
        FindMinInRoatetedSortedArray finder = new FindMinInRoatetedSortedArray();
        int min = finder.findMinInRoatetedSortedArray(nums) ;
        System.out.println(min);

        SearchInRotatedSortedArray serch = new SearchInRotatedSortedArray();
        int index = serch.searchInRotatedSortedArray(nums, 2) ;
        System.out.println(index);
    }
}
