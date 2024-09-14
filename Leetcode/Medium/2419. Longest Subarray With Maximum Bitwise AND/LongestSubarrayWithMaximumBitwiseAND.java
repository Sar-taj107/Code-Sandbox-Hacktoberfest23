import java.util.*;
public class LongestSubarrayWithMaximumBitwiseAND {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        
        int ans = longestSubarray(nums);
        System.out.println("subarr len with maxVal: "+ans);
    }
    public static int longestSubarray(int[] nums){
      
      int maxVal = 0;
      int res = 0;
      int maxLen = 0;
      
      for(int num : nums){
        maxVal = Math.max(maxVal, num);
      }
      
      for(int num : nums){
        if(num == maxVal){
          maxLen++;
        }else{
          maxLen=0;
        }
        res = Math.max(res, maxLen);
      }
      return res;
    }
}
  
/*
  Enter the array size: 5
  Enter the element: 5 5 5 1 5
  subarr len with maxVal: 3
*/
