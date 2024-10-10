//package Medium.921. Minimum Add to Make Parentheses Valid;
import java.util.*;
public class MinimumAddtoMakeParenthesesValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        int ans = minAddToMakeValid(s);
        System.out.println("Minimum parentheses required: "+ans);
    }
    public static int minAddToMakeValid(String s){
      
      int n = s.length();
      int countOp = 0;
      int countCl = 0;
      
      for(int i=0; i<n; i++){
        char c = s.charAt(i);
        if(c == '('){
          countOp++;
        }else if(countOp > 0 && c == ')'){
          countOp--;
        }else{
          countCl++;
        }
      }
      return countOp + countCl;
    }
  }
  
/*

Example 1:
  
Input: s = "())"
Output: 1
Example 2:
  
Input: s = "((("
Output: 3

*/
