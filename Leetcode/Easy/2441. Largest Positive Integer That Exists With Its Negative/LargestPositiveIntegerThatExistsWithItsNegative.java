//package Easy.2441. Largest Positive Integer That Exists With Its Negative;
//Complexity
//without sorting Tc - O(n) , Sc - O(n)   //1 approach
// with sorting  Tc - O(nlogn) , Sc - O(n)  //2 approach
import java.util.*;
public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        int ans = findMaxK(nums);
        System.out.println("Max element: "+ans);
    }
    public static int findMaxK(int[] nums){     //1 Approach
      
      int n=nums.length;
      Set<Integer> st = new HashSet<>();
      for(int i=0; i<n; i++){
        if(nums[i] < 0){
          st.add(nums[i]);
        }
      }
      
      int maxEle = -1;
      for(int i=0; i<n; i++){
        if(nums[i] >0 && st.contains(-nums[i])){
          maxEle = Math.max(maxEle, nums[i]);
        }
      }
      return maxEle;
    }
}  

//2 Approach 
class Solution {
    public int findMaxK(int[] nums) {
        
       int n=nums.length;
       Set<Integer> st = new HashSet<>();
       for(int i=0; i<n; i++){
        if(nums[i]<0){
            st.add(nums[i]);
        }
       }
       Arrays.sort(nums);
       for(int i=n-1; i>=0; i--){
        int x= -nums[i];
        if(st.contains(x)){
            return nums[i];
        }
       }
       return -1;
    }
}

/*
Output:

Enter the array size: 4
Enter the element: -1 2 -3 3
Max element: 3S

Enter the array size: 6
Enter the element: -1 10 6 7 -7 1
Max element: 7

*/
