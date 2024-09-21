//package GeeksForGeeks.Easy.Reverse Words;
import java.util.*;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        
        String ans = reverseWords(str);
        System.out.println(ans);
    }
    public static String reverseWords(String str){

        String[] s = str.split("\\.");
        
        StringBuilder sb = new StringBuilder();
        for(int i=s.length-1; i>=0; i--){
            sb.append(s[i]);
            if(i > 0){
                sb.append(".");
            }
        }
        return sb.toString();
    }
}

/*
Output:

Input: str = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole string(not individual words),the input string becomes much.very.program.this.like.i

*/
