//package Medium.287. Find the Duplicate Number;

import java.util.*;
public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n+1];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n+1; i++){
            nums[i] = sc.nextInt();
        }
        int ans = findDuplicate(nums);
        System.out.print("Duplicate Element: "+ans);
    }
    public static int findDuplicate(int[] nums){
        
        int slow = nums[0];
        int fast = nums[0];

        slow = nums[slow];
        fast = nums[nums[fast]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = nums[slow];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

/*
Output:

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3

Example 3:
Input: nums = [3,3,3,3,3]
Output: 3
*/
