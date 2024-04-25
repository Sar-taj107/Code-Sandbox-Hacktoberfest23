//package TCS NQT Question.String;
import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        checkPalindrome(s);
    }
    public static void checkPalindrome(String s){
      
      StringBuilder sb = new StringBuilder(s);
      sb.reverse();
      String str = new String(sb);
      if(s.equals(str)){
        System.out.println("Palindrome");
      }else{
        System.out.println("Not a Palindrome");
      }
    }
}

/*
Output:
Enter the String: abcba
Palindrome
Enter the String: abacba
Not a Palindrome

*/