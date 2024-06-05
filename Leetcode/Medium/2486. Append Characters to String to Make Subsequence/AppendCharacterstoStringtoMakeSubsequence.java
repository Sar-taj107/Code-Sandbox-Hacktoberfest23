//package Medium.2486. Append Characters to String to Make Subsequence;

import java.util.*;
public class AppendCharacterstoStringtoMakeSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s:");
        String s =sc.next();
        System.out.println("Enter the string t: ");
        String t = sc.next();
        
        int ans = appendCharacters(s, t);
        System.out.println(ans);
    }
    public static int appendCharacters(String s, String t){
      
      int sIdx = 0;
      int tIdx = 0;
        while(sIdx < s.length() && tIdx < t.length()){
  
          if(s.charAt(sIdx) == t.charAt(tIdx)){
                tIdx++;
          }
          sIdx++;
        }
        return t.length() - tIdx;
    }
}

/*

Output:
Enter the string s:
Enter the string t: 
4

*/