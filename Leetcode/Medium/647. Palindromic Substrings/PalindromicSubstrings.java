//package Medium.647. Palindromic Substrings;

import java.util.*;
public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        int ans=countSubstrings(s);
        System.out.print("Total plaindromic substring: "+ans);
    }
    public static int isPalindrome(String s, int st, int end){
        int count=0;
        while (st>=0 && end<s.length() && s.charAt(st) == s.charAt(end)) {
            count++;
            st--;
            end++;
        }
        return count;
    }
    public static int countSubstrings(String s){
        int n=s.length();
        int totalCount=0;
        for(int i=0; i<n; i++){
            totalCount +=isPalindrome(s,i,i);    
            totalCount +=isPalindrome(s,i,i+1);
        }
        return totalCount;
    }
}

/*
Output:
tc-O(n^2)

Enter the String: abc
Total plaindromic substring: 3

Enter the String: aaa
Total plaindromic substring: 6

*/