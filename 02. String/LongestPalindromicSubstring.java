/*
 brute-force tc=O(n^3)
 expandFromcentre algorith tc= O(n^2)
 
input- babad
        cbbd
output - 
        aba or bab      // coz both correct size 3 
        bb
 */
import java.util.*;
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String s = sc.next();
        String x=longPalindromicString(s);
        System.out.println(x);

    }
    public static String longPalindromicString(String s){

        int start =0, end=0;
        for(int i=0; i<s.length(); i++){

            int len1 = expandFromCentre(s,i,i+1);
            int len2 = expandFromCentre(s,i,i);
            int len = Math.max(len1, len2);

            if(end - start < len){
                start = i- (len-1) / 2;
                end = i +len /2;
            }
        }
        return s.substring(start, end+1);
    }
    public static int expandFromCentre(String s, int i , int j){
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
}
