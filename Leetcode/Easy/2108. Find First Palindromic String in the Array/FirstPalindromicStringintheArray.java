//package Easy.2108. Find First Palindromic String in the Array;
//1. approach using StringBuilder
import java.util.*;
public class FirstPalindromicStringintheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        String[] words = new String[n];
        System.out.print("Enter the Element as String: ");
        for(int i=0; i<n; i++){
            words[i] = sc.next();
        }
        String ans = firstPalindrome(words);
        System.out.println("First palindromic String: "+ans);
    }
    public static String firstPalindrome(String[] words){
        int n=words.length;
        for(int i=0; i<n; i++){
            String s=words[i];
            StringBuilder sb = new StringBuilder(s);
            String str = sb.reverse().toString();
            if(str.equals(s)){
                return s;
            }
        }
        return "";
    }
}

/* 
Output:

Enter array size: 5
Enter the Element as String: abc car ada racecar cool
First palindromic String: ada

Enter array size: 2
Enter the Element as String: notapalindrome racecar
First palindromic String: racecar

Enter array size: 2
Enter the Element as String: def ghi
First palindromic String:

*/

//---------------------------------java---------------------------------------
//2.Approach more optimize to minimize the time complexity

import java.util.*;
public class FirstPalindrString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        String[] words = new String[n];
        System.out.print("Enter the Element as String: ");
        for(int i=0; i<n; i++){
            words[i] = sc.next();
        }
        String ans = firstPalindrome(words);
        System.out.println("First palindromic String: "+ans);
    }
    public static String firstPalindrome(String[] words){

        for(String word:words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }
    public static boolean isPalindrome(String word){
        int l=0;
        int r = word.length()-1;
        while (l<r) {
            if(word.charAt(l) != word.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

/* 
Output:

Enter array size: 5
Enter the Element as String: abc car ada racecar cool
First palindromic String: ada

Enter array size: 2
Enter the Element as String: notapalindrome racecar
First palindromic String: racecar

Enter array size: 2
Enter the Element as String: def ghi
First palindromic String:

*/

