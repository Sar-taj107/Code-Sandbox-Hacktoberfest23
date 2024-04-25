//package TCS NQT Question.Array;
import java.util.*;
public class SecondLargestsecSmallestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        int[] ans = lagNum(nums);
        System.out.println("Second largest ans smallest element: "+ans[0]+","+ans[1]);
    }
    public static int[] lagNum(int[] nums){
      int n=nums.length;
      Arrays.sort(nums);
      int secLarg = nums[n-2];
      int secSml = nums[1];
      return new int[] {secLarg,secSml};
    }
}

/*
Output:
Enter the array size: 
5
Enter the element: 
3 0 2 -4 -6
Second largest ans smallest element: 2,-4

*/
