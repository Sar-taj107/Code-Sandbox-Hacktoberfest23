//package Codechef.String.DNA Storage;

import java.util.*;
public class DnaStorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test case: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.print("Enter binary string length: ");
            int n = sc.nextInt();
            System.out.print("Enter binary string: ");
            String s = sc.next();
            String ans = encodedSequence(s);
            System.out.println("Encoded sequence: "+ans);
            // Your code goes here
        }
    }
    public static String encodedSequence(String s){
        
        int n=s.length();
        String  u= "A", v="T", w="C", y="G";
        String str = "";
        for(int i=0; i<n-1; i=i+2){
            int j=i+2;
            String x =s.substring(i,j);
            
            if(x.equals("00")){
                str +=u;
            }else if(x.equals("01")){
                str +=v;
            }else if(x.equals("10")){
                str +=w;
            }else if(x.equals("11")){
                str +=y;
            }
        }
        return str;
    }
}

/*
Output:

Enter number of test case: 4
Enter binary string length: 2
Enter binary string: 00
Encoded sequence: A
Enter binary string length: 4
Enter binary string: 0011
Encoded sequence: AG
Enter binary string length: 6
Enter binary string: 101010
Encoded sequence: CCC
Enter binary string length: 4
Enter binary string: 1001
Encoded sequence: CT

*/
