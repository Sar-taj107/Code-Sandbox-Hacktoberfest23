//package Medium.1653. Minimum Deletions to Make String Balanced;
import java.util.*;
public class MinimumDeletionstoMakeStringBalanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        int ans =  minimumDeletions(s);
        System.out.println("Minimum number of deletions: "+ans);
    }
    public static int minimumDeletions(String s){
      
       int n=s.length();
       int count = 0;
       
       Stack<Character> st = new Stack<>();
       for(int i=0; i<n; i++){
         if(!st.empty() && s.charAt(i) == 'a' && st.peek() == 'b'){
           st.pop();
           count++;
         }else{
           st.push(s.charAt(i));
         }
       }
       return count;
    }
}
/*
  Input: s = "aababbab"
  Output: 2
*/
