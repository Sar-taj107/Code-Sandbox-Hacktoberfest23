/*
 Max Unique Exponent
You’re given a string where multiple characters are repeated consecutively.
You’re supposed to reduce the size of this string using mathematical 
logic given as in the example below :

Input :
aabbbbeeeeffggg

Output:
a2b4e4f2g3
 */
import java.util.Scanner;
public class MaxUniqueExponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();

        int n=s.length();
        StringBuilder sb = new StringBuilder();

        int count=1;
        for(int i=0; i<n-1; i++ ){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                sb.append(s.charAt(i));
                if(count>1){
                    sb.append(count);
                }
                count =1;
            }
        }
        sb.append(s.charAt(n-1));
        sb.append(count);
        System.out.println(sb.toString());
    }
}
