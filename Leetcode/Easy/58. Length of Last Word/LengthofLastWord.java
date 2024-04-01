//package Easy.58. Length of Last Word;

import java.util.Scanner;
public class LengthofLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = lengthOfLastWord(s);
    }
    public static int lengthOfLastWord(String s) {
        
        s=s.trim();
        int n=s.length();
        int len=0;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            len++;
        }
        return len;
    }
}

/*

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

*/