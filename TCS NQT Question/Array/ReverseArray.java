//package TCS NQT Question.Array;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter the array size: ");
          int n=sc.nextInt();
          int[] nums = new int[n];
          System.out.print("Enter the element: ");
          for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
          }
          int [] ans = reverseArr(nums);
          System.out.println("reverse Array: ");
          for(int x: ans){
            System.out.print(x+" ");
          }
    }
    public static int[] reverseArr(int[] nums){
      int n=nums.length;
      int[] res = new int[n];
      int idx=0;
      for(int i=n-1; i>=0; i--){
        res[idx++] = nums[i];
      }
      return res;
    }
}

/*
Output:

Enter the array size: 5
Enter the element: 0 4 8 2 1
reverse Array: 
1 2 8 4 0

*/