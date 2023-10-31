package top_75_in_java.stack;

public class Main {
    public static void main(String[] args){
    String s = "(])" ;
    validParanthesis vs = new validParanthesis() ;
    boolean res = vs.isValid(s) ;
    System.out.println(res);
    }
}
