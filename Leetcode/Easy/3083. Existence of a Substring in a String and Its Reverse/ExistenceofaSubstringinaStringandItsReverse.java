//package Easy.3083. Existence of a Substring in a String and Its Reverse;
//1.Approach linear sol 
//Tc -O(n) Sc - O(1)
import java.util.*;
public class ExistenceofaSubstringinaStringandItsReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        boolean ans = isSubstringPresent(s);
        System.out.print(ans);

    }
    public static boolean isSubstringPresent(String s){
        int n=s.length();
        for(int i=0; i<n-1; i++){
            String subStr = s.substring(i, i+2);
            if(s.indexOf(new StringBuilder(subStr).reverse().toString()) != -1){
                return true;
            }
        }
        return false;
    }
}

/*
Output:

Enter the String: leetcode
true

Enter the String: abcba
true

Enter the String: abcd
false

*/

---------------------------------------------------------********************************-----------------------------------------------------
//2. approach using HashSet 
//Tc -O(n^2) Sc- O(n)
class Solution {
    public boolean isSubstringPresent(String s) {
        int n=s.length();
        Set<String> st = new HashSet<>();
        for(int i=0; i<n-1; i++){
            int j=i+2;
            String str = s.substring(i,j);
            st.add(str);
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String str1 = new String(sb);
        for(int i=0; i<str1.length()-1; i++){
            int j=i+2;
            String s1 = str1.substring(i,j);
            if(st.contains(s1)){
                return true;
            }
        }
        return false;
    }
}
