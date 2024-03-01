//package Easy.2864. Maximum Odd Binary Number;
//1.approach Tc- O(n), sc - O(n)
import java.util.*;
public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary string: ");
        String s = sc.next();
        String ans = maximumOddBinaryNumber(s);
        System.out.print("Maximum odd binary number: "+ans);
    }
    public static String maximumOddBinaryNumber(String s){

        int n=s.length();
        int oneCount =0, zeroCount =0;
        String str = "";
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1'){
                oneCount++;
            }else{
                zeroCount++;
            }
        }
        str = "1".repeat(oneCount-1) + "0".repeat(zeroCount) +"1";
        return str;
    }
}

/*
Output:

Enter Binary string: 010
Maximum odd binary number: 001

Enter Binary string: 0101
Maximum odd binary number: 1001

Enter Binary string: 010110
Maximum odd binary number: 110001

*/

