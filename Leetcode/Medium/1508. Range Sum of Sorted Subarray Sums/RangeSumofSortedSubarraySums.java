//package Medium.1508. Range Sum of Sorted Subarray Sums;
import java.util.*;
public class RangeSumofSortedSubarraySums {
    static int M= 1000000007;
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size: ");
      int n=sc.nextInt();
      int[] nums = new int[n];
      System.out.println("Enter the element: ");
      for(int i=0; i<n; i++){
        nums[i] = sc.nextInt();
      }
      System.out.println("Enter the left index: ");
      int left = sc.nextInt();
      System.out.println("Enter the right index: ");
      int right = sc.nextInt();
      
      int ans = rangeSum(nums, n, left, right);
      System.out.println("sum: "+ans);
  }
  public static int rangeSum(int[] nums, int n, int left, int right){
    
    List<Integer> li = new ArrayList<>();
    
    for(int i=0; i<n; i++){
      int sum = 0;
      for(int j=i; j<n; j++){
        sum = (sum+nums[j]) % M;
        li.add(sum);
      }
    }
    
    Collections.sort(li);
    int ans = 0;
    for(int i=left-1; i<right; i++){
      ans = (ans + li.get(i)) % M;
    }
    return ans;
  }
}

/*
Input: nums = [1,2,3,4], n = 4, left = 1, right = 5
Output: 13
*/
