//package Medium.1347. Minimum Number of Steps to Make Two Strings Anagram;
import java.util.*;
public class MinimumNumberofStepstoMakeTwoStringsAnagram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s=sc.nextLine();
        System.out.print("Enter string t: ");
        String t=sc.nextLine();
        int ans =miniNumOfStepMakeAnagram(s, t);
        System.out.println("Minimum number of step to make Anagram: "+ans);
    }
    public static int miniNumOfStepMakeAnagram(String s,String t){
        int res=0;
        int[] count = new int[26];   //initialize count arr to store freq of character
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<count.length; i++){
            int val=count[i];
            if(val>0){
                res +=val;
            }
        }
        return res;
    }
}

/*
OUTPUT:

Enter string s: bab
Enter string t: aba
Minimum number of step to make Anagram: 1

Enter string s: leetcode
Enter string t: practice
Minimum number of step to make Anagram: 5

*/
