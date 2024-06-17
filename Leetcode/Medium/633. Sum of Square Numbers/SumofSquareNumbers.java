//package Medium.633. Sum of Square Numbers;
import java.util.*;
public class SumofSquareNumbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.err.println("Enter the value of c: ");
        int c=sc.nextInt();

        boolean ans = judgeSquareSum(c);
        System.err.println(ans);
    }
    public static boolean judgeSquareSum(int c){

        int l=0;
        int r = (int)Math.sqrt(c);
        while ( l <= r) {
            long sum = (long)l*l + (long)r*r;
            if(sum == c){
                return true;
            }
            if(sum < c){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
}
