//package Easy.1544. Make The String Great;
import java.util.*;
public class MakeTheStringGreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String ans = makeGood(s);
        System.out.print("Good string: "+ans); 
    }
    public static String makeGood(String s) {

        int n=s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-1; i++){
            char ch = s.charAt(i);
            if(sb.length() > 0 && Math.abs(ch - sb.charAt(sb.length()-1))==32){
                sb.deleteCharAt(sb.length() -1);
            }else{
                sb.append(ch);
            }
        }
        if(sb.length() > 0 && Math.abs(s.charAt(n-1) - sb.charAt(sb.length()-1))==32){
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(s.charAt(n-1));
        }
        return sb.toString();
    }
}

/*
Output:

Enter the string: leEeetcode
Good string: leetcode

Enter the string: abBAcC
Good string:

Enter the string: s
Good string: s

*/
