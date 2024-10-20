/*
Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the 
missing number from the first N integers.
Note: There are no duplicates in the list.

Examples: 
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: Here the size of the array is 7, so the range will be [1, 8].
The missing number between 1 to 8 is 5
*/
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n=sc.nextInt();
		int[] nums = new int[n-1];
		System.out.println("Enter the element: ");
		for(int i=0; i<n-1; i++){
		    nums[i]=sc.nextInt();
		}
		int ans=missingNum(nums,n);
		System.out.println("Missing Number: "+ans);	
	}
	public static int missingNum(int[] nums, int n){
	    // int n=nums.length;
	    // int res=0;
	    // Arrays.sort(nums);
	    
	    // for(int i=0; i<n; i++){
	    //     int j=i+1;
	    //     if(nums[i] != j){
	    //       res=j;  
	    //       break;
	    //     }                                
	    // }
	    // return res;
//1.optimize solution
			
		int sum=((n) *(n+1))/ 2;
		for(int i=0; i<n-1; i++){
			sum -= nums[i];
		}
		return sum;
    }
}

/*
Output:

Enter the value of n:5
Enter the element:
3 5 1 4
Missing Number: 2

Enter the value of n:7
Enter the element:
4 2 6 1 7 3
Missing Number: 5

*/
