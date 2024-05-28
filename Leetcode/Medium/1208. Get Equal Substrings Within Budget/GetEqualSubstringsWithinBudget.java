//package Medium.1208. Get Equal Substrings Within Budget;
import java.util.*;
public class GetEqualSubstringsWithinBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s: ");
        String s = sc.next();
        System.out.println("Enter String t: ");
        String t = sc.next();
        System.out.println("Enter maxCost: ");
        int maxCost = sc.nextInt();
        
        int ans = equalSubstring(s, t, maxCost);
        System.out.println("Maximum length substring: "+ans);
    }
     public static int equalSubstring(String s, String t, int maxCost){
       
       int n=s.length();
       int maxLen = 0;
       int i=0, j=0;
       int curCost = 0;
       
       while(j < n){ // sliding window 
         
         curCost += Math.abs(t.charAt(j) - s.charAt(j));
         while(curCost > maxCost){
           
           curCost -= Math.abs(t.charAt(i) - s.charAt(i)); // shrink the window size
           i++;
         }
         maxLen = Math.max(maxLen, j - i + 1);
         j++;
       }      
       return maxLen;
    }
}

/*

Output:
Enter String s: abcd
Enter String t: cdef
Enter maxCost: 3
Maximum length substring: 1

Enter String s: abcd
Enter String t: bcdf
Enter maxCost: 3
Maximum length substring: 3

*/
