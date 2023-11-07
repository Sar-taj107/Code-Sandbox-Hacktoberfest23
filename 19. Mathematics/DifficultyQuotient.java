import java.util.*;

public class DifficultyQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        int difficultyQuotient = findDifficultyQuotient(s);
        System.out.println("Difficulty Quotient: " + difficultyQuotient);
    }

    static int findDifficultyQuotient(String s) {
        if (s == null) {
            return 0;
        }

        String[] words = s.split(" ");
        int n = words.length;
        int hard = 0;
        int easy = 0;

        for (int i = 0; i < n; i++) {
            char[] ch = words[i].toCharArray();
            int countVowel = 0;
            int countCons = 0;
            int consecConso = 0;
            boolean isHard = false;

            for (int j = 0; j < ch.length; j++) {
                char c = ch[j];
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    countVowel++;
                } else {
                    countCons++;
                    consecConso++;
                    if (consecConso >= 3) {
                        isHard = true;
                    }
                }
            }

            if (countVowel < countCons || isHard) {
                hard++;
            } else {
                easy++;
            }
        }

        int difficultyQuotient = (5 * hard) - (2 * easy);
        return difficultyQuotient;
    }
}

/*
 
OUTPUT 
Enter the String:
qiewldoaa life ace by fantasy
Difficulty Quotient: 11

*/

/*
 Ques:
 The function accepts a string str of length ten as its argument Sting Str contains  space separated words. A word is hard if at least one of the 2 condition are true

1. There are more consonants than vowels
2. There are 3 consecutive consonants

Otherwise, the word is easy Implement the function to find the difficulty quotient of the string and return the same

Difficulty quotient (5* hard) -(2* easy)

where, hard = count of hard words in the string

and, easy =count of easy words in the string

Note:

Return 0 if string is null 
string  contains only lower-case alphabets and spaces

Output lies within integral range.

Example:

Input:

str: qiewldoaa life ace by fantasy

Output:

11

Explanation:

3 hard words are:

qiewldoaa : 3 consecutive consonants 'wid'

by: 2 consonants

fantasy : 3 consonants and 2 vowels

2 easy words  are : life and ace 

*/
