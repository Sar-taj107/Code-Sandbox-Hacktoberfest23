/*
 check whether a given string is palindrome or not
 example1 eye     palindrome
 example2 fool    Not a palindrome
 example3 madam     palindrome

 */
import java.util.*;
public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();

        checkPalidroStr(s);
    }
    static void checkPalidroStr(String s){

        int n=s.length();
        String str="";
        for(int i=n-1; i>=0; i--){
            str +=s.charAt(i);
        }
        if(s.equals(str)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
}

//2. second approach using stringbuilder()
//you can use this one it also working

// static void checkPalidroStr(String s){

//         int n=s.length();
//         StringBuilder sb = new StringBuilder();
//         for(int i=n-1; i>=0; i--){
//             sb.append(s.charAt(i));
//         }
//         if(s.equals(sb.toString())){
//             System.out.println("Palindrome String");
//         }else{
//             System.out.println("Not a Palindrome String");
//         }
//     }
