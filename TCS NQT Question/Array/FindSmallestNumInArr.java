//package TCS NQT Question.Array;
import java.util.*;
public class FindSmallestNumInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        int ans = smallestNum(nums);
        System.out.println(ans);
    }
    public static int smallestNum(int[] nums){
      int n=nums.length;
  //1 approach
      // Arrays.sort(nums);
      // return nums[0];
  // 2 approach
      int sm=Integer.MAX_VALUE;
      for(int i=0; i<n; i++){
        if(nums[i] < sm){
          sm = nums[i];
        }
      }
      return sm;
    }
}
