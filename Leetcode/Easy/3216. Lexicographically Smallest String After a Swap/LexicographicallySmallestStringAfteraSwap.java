//package Easy.3216. Lexicographically Smallest String After a Swap;
import java.util.*;
public class LexicographicallySmallestStringAfteraSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        
        String ans = getSmallestString(s);
        System.out.println(ans);
    }
    public static boolean isSameParity(char c1, char c2){
      return (c1%2) == (c2%2);
    }
    public static String getSmallestString(String s){
      
      char[] chars = s.toCharArray();
      for(int i=0; i<chars.length-1; i++){
        char c1 = chars[i];
        char c2 = chars[i+1];
        
        if(isSameParity(c1,c2)){
          if(c1 > c2){
            chars[i] = c2;
            chars[i+1] = c1;
            break;
          }
        }
      }
      return new String(chars);
    }
}
  
/*
  Example 1:
  
  Input: s = "45320"
  
  Output: "43520"
*/
