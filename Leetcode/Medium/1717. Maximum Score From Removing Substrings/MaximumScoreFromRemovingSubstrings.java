//package Medium.1717. Maximum Score From Removing Substrings;
import java.util.*;
public class MaximumScoreFromRemovingSubstrings {
    static int res = 0;
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String: ");
      String s = sc.next();
      System.out.println("Enter the value of x: ");
      int x= sc.nextInt();
      System.out.println("Enter the value of y: ");
      int y= sc.nextInt();
      
      int ans = maximumGain(s, x, y);
      System.out.println("Maximum Gain: "+ans);
  }
  
  public static String removeSubstr(String s, String str,int val){
    
    Stack<Character> st = new Stack<>();
    int n=s.length();
    for(int i=0; i<n; i++){
      if(s.charAt(i) == str.charAt(1) && (!st.empty()) && st.peek() == str.charAt(0)){
        st.pop();
        res += val;
      }else{
        st.push(s.charAt(i));
      }
    }
    
    StringBuilder sb = new StringBuilder();
    while(!st.empty()){
      sb.append(st.pop());
    }
    sb.reverse();
    return sb.toString();
  }
  public static int maximumGain(String s, int x, int y){
    
    if(x < y){
      s = removeSubstr(s,"ba",y);
      s = removeSubstr(s,"ab",x);
    }else{
      s = removeSubstr(s,"ab",x);
      s = removeSubstr(s,"ba",y);
    }
    return res;
  }
}
