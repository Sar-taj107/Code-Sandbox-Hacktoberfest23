//package Easy.387. First Unique Character in a String;
import java.util.*;
public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        int ans=firstUniqChar(s);
        System.out.println(ans);
    }
    public static int firstUniqChar(String s){
        int n=s.length();
        int[] frequ = new int[26];
        for(char ch:s.toCharArray()){
            frequ[ch-'a']++;
        }
        for(int i=0;i<n; i++){
            char ch=s.charAt(i);
            if(frequ[ch-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}

/*
Output:

Enter the String: leetcode
0
Enter the String: loveleetcode
2
Enter the String: aabb
-1
*/