//package Easy.3146. Permutation Difference between Two Strings;
import java.util.*;
public class PermutationDifferencebetweenTwoStrings {
    public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
      System.out.println("Enter the String s: ");
      String s = sc.next();
      System.out.println("Enter the String t: ");
      String t = sc.next();
      int ans = findPermutationDifference(s,t);
      System.out.println(ans);
}
  public static int findPermutationDifference(String s, String t){
    
    int n=s.length();
    int m=t.length();
    int diff = 0;
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        if(s.charAt(i) == t.charAt(j))
        diff += Math.abs(i-j);
      }
    }
    return diff;
    }
}

/*
Output:
Enter the String s: abc
Enter the String t: bac
ans: 2
*/