//package TCS NQT Question.Array;
import java.util.*;
public class FindLargestNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        int ans = largestNum(nums);
        System.out.println(ans);
    }
    public static int largestNum(int[] nums){
      int n=nums.length;
  //1 approach
      // Arrays.sort(nums);
      // return nums[n-1];
  // 2 approach
      int lag=Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
        if(nums[i] > lag){
          lag = nums[i];
        }
      }
      return lag;
    }
}
/*
Output:
Enter the array size: 
5
Enter the element: 
1 4 2 -3 22
22

*/