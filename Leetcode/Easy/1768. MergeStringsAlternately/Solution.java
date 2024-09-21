/**
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

**/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        // String output="";
        StringBuilder result = new StringBuilder();
        int x = word1.length();
        int y = word2.length();
        int max = x>y?x:y;
        for(int i=0;i<max;i++){
            // if(i<word1.length()) output=output+word1.charAt(i);
            // if(i<word2.length()) output=output+word2.charAt(i);
            if(i<word1.length()) result.append(word1.charAt(i));
            if(i<word2.length()) result.append(word2.charAt(i));
        }
        return result.toString();
    }
}
