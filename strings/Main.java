package strings;

import java.util.ArrayList;

public class Main {
    public static void subsequenes(int i , String s,ArrayList<String> ans,String temp){
        if(i >= s.length()){
           ans.add(temp);
           return ;
        }  
        subsequenes(i+1,s,ans, temp+s.charAt(i)) ;
        subsequenes(i+1,s,ans, temp) ;
        

    }
    public static void main(String[] args) {
        // Utils  util = new Utils() ;
        // System.out.println(util.s1 == util.s3);
       ArrayList<String> ans = new ArrayList<>() ;
       subsequenes(0,"kumar",ans,"")  ;
       System.out.println(ans);
    }
}
