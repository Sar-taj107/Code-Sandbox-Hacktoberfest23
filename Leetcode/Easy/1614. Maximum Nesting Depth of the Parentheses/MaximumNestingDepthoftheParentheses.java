//package Easy.1614. Maximum Nesting Depth of the Parentheses;
import java.util.*;
public class MaximumNestingDepthoftheParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        int ans = maxDepth(s);
        System.out.print("Maximum nesting depth: "+ans);
    }
    public static int maxDepth(String s){

        int depth =0;
        int maxDepth = 0;
        char[] ch = s.toCharArray();
        for(char c : ch){
            if( c=='(' ){
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }else if( c==')' ){
                depth--;
            }
        }
        return maxDepth;
    }
}

/*
Output:

Enter the String: (1+(2*3)+((8)/4))+1
Maximum nesting depth: 3

Enter the String: (1)+((2))+(((3)))
Maximum nesting depth: 3

Enter the String: () 
Maximum nesting depth: 1
 
*/

