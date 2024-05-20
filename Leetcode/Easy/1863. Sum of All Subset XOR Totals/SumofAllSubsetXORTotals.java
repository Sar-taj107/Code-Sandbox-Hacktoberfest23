//package Easy.1863. Sum of All Subset XOR Totals;
import java.util.*;
public class SumofAllSubsetXORTotals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        int ans = subsetXORSum(nums);
        System.out.println("sum of all subset xor:" +ans);
    }
    public static int subsetXORSum(int[] nums){
      
      int n=nums.length;
      int totalSumXor= 0;
      for(int mask =0; mask <(1<<n); mask++){
        int xor = 0;
        for(int i=0; i<n; i++){
          if((mask & (1<<i)) > 0){
            xor = xor ^ nums[i];
          }
        }
        totalSumXor += xor;
      }
      return totalSumXor;
    }
}

/*
Output:

Enter the array Size: 2
Enter the element: 1 3
sum of all subset xor: 6

Enter the array Size: 3
Enter the element: 5 1 6
sum of all subset xor:28

*/