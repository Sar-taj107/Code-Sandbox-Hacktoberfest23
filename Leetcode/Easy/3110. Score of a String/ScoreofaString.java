//package Easy.3110. Score of a String;

import java.util.*;
public class ScoreofaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        int ans = scoreOfString(s);
        System.out.print("Score of string: "+ans);
    }
    public static int scoreOfString(String s){

        if(s==null || s.length()<=1){
            return 0;
        }
        int strScore =0;
        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i-1);
            char ch1 = s.charAt(i);
            strScore += Math.abs((ch1 - ch));
        }
        return strScore;
    }
}

/*
Output:

Enter the string: hello
Score of string: 13

Enter the string: zaz
Score of string: 50

*/
