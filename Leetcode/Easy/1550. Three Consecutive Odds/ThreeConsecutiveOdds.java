//package Easy.1550. Three Consecutive Odds;
import java.util.*;
public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Entert the array size: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = threeConsecutiveOdds(arr);
        System.out.println(ans);
    }
    public static boolean threeConsecutiveOdds(int[] arr){

        int n=arr.length;
        int count=0;
        for(int i=0; i<n; i++){
            int x = arr[i] % 2;
            if(x!=0){
                count++;
                if(count>=3) return true;
            }else{
                count=0;
            }
        }
        return false;
    }
}

/*
Output:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true

*/