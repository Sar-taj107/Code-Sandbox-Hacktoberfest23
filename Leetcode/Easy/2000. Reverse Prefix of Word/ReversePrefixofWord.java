//package Easy.2000. Reverse Prefix of Word;

import java.util.*;
public class ReversePrefixofWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string word: ");
        String word = sc.next();
        System.out.print("Enter the character ch: ");
        char ch = sc.next().charAt(0);
        String ans = reversePrefix(word, ch);
        System.err.println("Ans: "+ans);
    }
    public static String reversePrefix(String word, char ch){
        int idx =0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                idx =i;
                break;
            }
        }
        int startIdx=idx;
        StringBuilder sb = new StringBuilder();
        while ( idx >=0 ) {
            sb.append(word.charAt(idx));
            idx--;
        }
        String s = new String(sb);
        return s+word.substring(startIdx+1, word.length());
    }
}

/*
Output:

Enter the string word: abcdefd
Enter the character ch: d
Ans: dcbaefd

Enter the string word: xyxzxe
Enter the character ch: z
Ans: zxyxxe

Enter the string word: abcd
Enter the character ch: z
Ans: abcd

 */

