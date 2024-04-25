//package TCS NQT Question.Array;
import java.util.*;
public class RearrangeInIncreasingDecresingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n= sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        System.out.println("increasing and decreasing array: ");
        int[] ans = rearrangArr(nums);
        for(int i=0; i<n; i++){
          System.out.print(ans[i]+" ");
        }
        
    }
    public static int[] rearrangArr(int[] nums){
      int n=nums.length;
      Arrays.sort(nums);
      int[] arr = new int[n];
      int idx = n-1;
      for(int i=0; i<n; i++){
        if(i<n/2){
          arr[i] = nums[i];
        }else{
          arr[i] = nums[idx--];
        }
      }
      return arr;
    } 
}

/*
Output:
Enter the array size: 
6
Enter the element: 
8 7 1 6 5 9
increasing and decreasing array: 
1 5 6 9 8 7 

*/