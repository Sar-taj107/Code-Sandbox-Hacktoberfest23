//package Easy.1137. N-th Tribonacci Number;
import java.util.*;
public class NthTribonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int ans= tribonacci(n);
        System.out.print("Nth tribonacci Number: "+ans);
    }
    public static int tribonacci(int n){

        int[] res = new int[n+1];
        if(n==0) return 0;
        if(n==1 || n==2){
            return 1;
        }
        res[0] = 0;
        res[1] =res[2] = 1;
        for(int i=3; i<=n; i++){
            res[i] = res[i-3] + res[i-2] + res[i-1];
        }
        return res[n];
    }
}

/*
Output :

Enter the value of n: 2
Nth tribonacci Number: 1

Enter the value of n: 4
Nth tribonacci Number: 4

Enter the value of n: 25
Nth tribonacci Number: 1389537

*/

