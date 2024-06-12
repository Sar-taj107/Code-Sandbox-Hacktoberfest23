//package Medium.75. Sort Colors;
import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums =new int[n];
        
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i]  = sc.nextInt();
        }
        sortColors(nums);
        
    }
    public static void sortColors(int[] nums){
      int n=nums.length;
      int[] count = new int[3];
      
      for(int num : nums){
        count[num]++;
      }
      
      for(int i=1; i<3; i++){
        count[i] = count[i] + count[i-1];
      }
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[--count[nums[i]]] = nums[i];
      }
      for(int i=0; i<n; i++){
        nums[i] = arr[i];
      }
      System.out.print("Ans: ");
      for(int i=0; i<n; i++){
        System.out.print(nums[i]+" ");
      }
    }
}
  
  /*
  Input: nums = [2,0,2,1,1,0]
  Output: [0,0,1,1,2,2]
  Example 2:
  
  Input: nums = [2,0,1]
  Output: [0,1,2]
  */

