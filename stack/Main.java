package stack;

public class Main {
    public static void main(String[] args){
    String s = "(])" ;
    validParanthesis vs = new validParanthesis() ;
    boolean res = vs.isValid(s) ;
    System.out.println(res);
    Stacks stack = new Stacks() ;
    int []nums = {11,12,45,67,23,4,5,2,8};
    int[] result = stack.nextGreaterElement(nums);

    for(int x:result){
        System.out.print(x + " ");
    }
    }
}
