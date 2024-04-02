//package Easy.205. Isomorphic Strings;
import java.util.*;
public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the string s:");
        String s = sc.next();
        System.out.print("Enter the string t:");
        String t = sc.next();
        boolean ans = isIsomorphic(s,t);
        System.out.print(ans);
    }
    public static boolean isIsomorphic(String s, String t){
        int n=s.length();
        Map<Character,Character> mp1 = new HashMap<>();
        Map<Character, Character> mp2 = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(mp1.containsKey(ch1) && mp1.get(ch1) != ch2 ||
            mp2.containsKey(ch2) && mp2.get(ch2) != ch1){
                return false;
            }
            mp1.put(ch1, ch2);
            mp2.put(ch2, ch1);
        }
        return true;
    }
}

/*
Output:

Enter the string s:egg
Enter the string t:add
true

Enter the string s:foo
Enter the string t:bar
false

Enter the string s:paper
Enter the string t:title
true

*/