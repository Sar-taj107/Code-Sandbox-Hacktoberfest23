//package Easy.1704. Determine if String Halves Are Alike;
import java.util.*;
public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String s = sc.nextLine();
        boolean ans = isAlike(s);
        System.out.println(ans);
    }
    public static boolean isAlike(String s){
        int n=s.length();
        int half = n/2;
        int count1 =0, count2=0;
        String str = s.toLowerCase();

        String s1 =str.substring(0,half);
        String s2 =str.substring(half);
        for(int i=0; i<s1.length(); i++){
            char c=s1.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count1++;
            }
        }
        for(int i=0; i<s2.length(); i++){
            char c=s2.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count2++;
            }
        }
        return count1 == count2;
    }
}

/*

Enter the String:book
true

Enter the String:textbook
false

*/