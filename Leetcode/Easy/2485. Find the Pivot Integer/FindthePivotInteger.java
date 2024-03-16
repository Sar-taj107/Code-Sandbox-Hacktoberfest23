//package Easy.2485. Find the Pivot Integer;
// Tc - O(n) , SC- O(1)
import java.util.*;
public class FindthePivotInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        int ans = pivotEle(n);
        System.out.println("Pivot element is "+ans);

    }
    public static int pivotEle(int n){

        int totalSum =n*(n+1)/2;
        int prefixSum=0;
        for(int i=1; i<=n; i++){
            prefixSum +=i;
            if(2 * prefixSum == totalSum + i){
                return i;
            }
        }
        return -1;
    }
}

/*
Output: 

Enter value of n: 5
Pivot element is -1

Enter value of n: 8
Pivot element is 6

*/

----------------------------------------------------****************************----------------------------------------------------
//2. approach
class Solution {
    public int pivotInteger(int n) {
        
        for(int i=1; i<=n; i++){
            int leftSum = i*(i+1) /2;
            int rightSum = n*(n+1) /2 - leftSum+i; 
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
