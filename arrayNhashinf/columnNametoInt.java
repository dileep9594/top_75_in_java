package arrayNhashinf;

public class columnNametoInt {
    public int titleToNumber(String s){
        int result = 0 ;
        for(char c : s.toCharArray()){
            result *= 26 ;
            result += c-'A' +1 ;
        }
        return result ;
    }
}
