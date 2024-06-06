//package Easy.409. Longest Palindrome;
import java.util.*;
public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String s = sc.next();
        int ans = longestPalindrome(s);
        System.err.println(ans);
    }
    public static int longestPalindrome(String s) {
        Map<Character,Integer> freq = new HashMap<>();

        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        int len=0, count=0;
        
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
             
            if(entry.getValue()%2==0){
                len += entry.getValue();
            }else if(entry.getValue()%2 != 0 && count == 0){
                len += entry.getValue();
                count++;
            }else{
                len += entry.getValue() - 1;
            }
        }
        return len;
    }
}

<<<<<<< HEAD
=======
/*
Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1
*/
>>>>>>> e7ebb4edb9183a9f2500f36336d42c702a399cfb
