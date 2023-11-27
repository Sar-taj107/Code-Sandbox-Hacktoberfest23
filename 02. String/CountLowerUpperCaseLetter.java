/*
write a program to count the number of uppercase and lowercase letter present in the given string
and converts the entire string into the case with the greater count. if the count are equal then leave the 
string unchanged. 
*/

import java.util.*;
public class CountLowerUpperCaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String s= sc.nextLine();

        String ans = converString(s);
        System.out.println("Required answer: "+ans);
    }
    public static String converString(String s){

        int n=s.length();
        int smCount=0;
        int capCount=0;
        String str="";

        if(s.isEmpty()){
            return s;
        }
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                capCount++;
            }else{
                smCount++;
            }
        }
        if(smCount > capCount){
            str=s.toLowerCase();
        }else if(smCount<capCount){
            str=s.toUpperCase();
        }else{
            str=s;
        }
        System.out.println("no of lowercase letter: "+smCount);
        System.out.println("no of uppercase letter: "+capCount);
        return str;
    }
}


/*
Output:

Enter the String: SunDAY
no of lowercase letter: 2
no of uppercase letter: 4
Required answer: SUNDAY

Enter the String: HaPpy
no of lowercase letter: 3
no of uppercase letter: 2
Required answer: happy

*/