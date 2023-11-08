import java.util.*;
/*
write a program that takes a string as input and replaces only the alphabetic characters, 
changing uppercase letters to lowercase and vice versa, while keeping all other characters unchanged?
*/
public class ReplaceLowerToUppercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();

        String ans= replaceUpperTolowerCase(s);
        System.out.println("Output: "+ans);
    }
    static String replaceUpperTolowerCase(String s){

        if(s.isEmpty()){
            return s;
        }
        char[] ch = s.toCharArray();
        int n=ch.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            //System.out.println(ch[i]);
            if('A'<= ch[i] && ch[i] <= 'Z'){
               sb.append(Character.toLowerCase(ch[i]));
            }
            else if('a'<= ch[i] && ch[i] <='z'){
                sb.append(Character.toUpperCase(ch[i]));
            }else{
                sb.append(ch[i]);
            } 
        }
        String str = sb.toString();
        return str;
    }
}


/*

Enter the string:
Hello World
Output: hELLO wORLD

Enter the string:
Happy 2 See YOU
Output: hAPPY 2 sEE you

*/