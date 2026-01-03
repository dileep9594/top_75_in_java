import java.util.ArrayList;
import java.util.List;

public class Main {
    static int solution(int n) {
            int sum = 0 ;
            while(n>0){
                sum += n%10 ;
                n /= 10 ;
            }
        return sum ;
        }


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>() ;
        nums.add(1) ;
        // System.out.println(nums.get(0));
        int  arr [] = {1,23,4} ;
        // System.out.println(arr[2]);
        System.out.println(solution(29));
    }
}