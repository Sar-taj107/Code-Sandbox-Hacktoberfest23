//package Medium.2997. Minimum Number of Operations to Make Array XOR Equal to K;
import java.util.*;
public class MinimumNumberofOperationstoMakeArrayXOREqualtoK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k= sc.nextInt();
        
        int ans = minOperations(nums, k);
        System.out.println("Minimum Operations require: "+ans);
        
    }
    public static int minOperations(int[] nums, int k){
      
      int tmp = 0;
      for(int num: nums){
        tmp = tmp ^ num;
      }
      
      int minOper=0;
      for(int i=0; i<32; i++){
        if((k & (1<<i)) != (tmp & (1<<i))){
          minOper++;
        }
      }
      return minOper;
    }
}

/*
Output:

Enter the array size: 4
Enter the element: 2 1 3 4 
Enter the value of k: 1
Minimum Operations require: 2

Enter the array size: 4
Enter the element: 2 0 2 0
Enter the value of k: 0
Minimum Operations require: 0

*/