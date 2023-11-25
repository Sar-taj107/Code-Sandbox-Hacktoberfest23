/*
Sum of Absolute Differences in a Sorted Array

You are given an integer array nums sorted in non-decreasing order.
Build and return an integer array result with the same length as nums such
that result[i] is equal to the summation of absolute differences between 
nums[i] and all the other elements in the array.

In other words, result[i] is equal to sum(|nums[i]-nums[j]|) where
0 <= j < nums.length and j != i (0-indexed).

Example 1:

Input: nums = [2,3,5]
Output: [4,3,5]
Explanation: Assuming the arrays are 0-indexed, then
result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.
Example 2:

Input: nums = [1,4,6,8,10]
Output: [24,15,13,15,21]
 

Constraints:

2 <= nums.length <= 105
1 <= nums[i] <= nums[i + 1] <= 10^4

*/

import java.util.*;
public class sumOfAbsoluteDifferenceInSortedArray{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int[] arr = new int[n];
	    System.out.println("Enter the element:");
	    for(int i=0; i<n; i++){
	        arr[i]=sc.nextInt();
	    }
	    System.out.print("Required Ans:");
	    int ans[] = sumOfAbsoluteDiffInSortedArr(arr);
	    for(int i=0; i<n; i++){
	        System.out.print(ans[i]+" ");
	    }
	    
	    
	}
	public static int[] sumOfAbsoluteDiffInSortedArr(int[] arr){
	    int n=arr.length;
	    int[] res = new int[n];
	    
	    //calculate total sum
        int totalSum=0;
        for(int i=0; i<n; i++){
            totalSum +=arr[i];
        }

        int prefixSum=0;
        for(int i=0; i<n; i++){
            int leftSum = prefixSum;
            int rightSum = totalSum - leftSum - arr[i];
            res[i]= (arr[i] * i) - leftSum + rightSum - (arr[i]*(n-i-1));
            prefixSum +=arr[i];
        }
        return res;
	}
}

/*
Output:

Enter array size:
3
Enter the element:
2 3 5
Required Ans:4 3 5 

Enter array size:
5
Enter the element:
1 4 6 8 10
Required Ans:24 15 13 15 21 s

*/
