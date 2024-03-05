//package Medium.1750. Minimum Length of String After Deleting Similar Ends;
import java.util.*;
public class MinimumLengthofStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int ans = minimumLength(s);
        System.out.println("Length of string after delete: "+ans);
    }
    public static int minimumLength(String s){

        int n=s.length();
        int start = 0;
        int end = n-1;
        while (start < end && s.charAt(start) == s.charAt(end)) {
            char ch = s.charAt(start);
            while(start <= end && s.charAt(start) == ch){
                start++;
            }
            while(start <= end && s.charAt(end) == ch){
                end--;
            }
        }
        return end-start + 1;
    }
}

/*

Enter the string: ca
Length of string after delete: 2

Enter the string: aabccabba
Length of string after delete: 3

Enter the string: cabaabac
Length of string after delete: 0

*/

