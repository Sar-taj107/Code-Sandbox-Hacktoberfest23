//package Easy.3083. Existence of a Substring in a String and Its Reverse;
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
