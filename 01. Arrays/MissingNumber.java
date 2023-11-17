/*Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the 
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
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the element: ");
		for(int i=0; i<n; i++){
		    nums[i]=sc.nextInt();
		}
		int ans=missingNum(nums);
		System.out.println("Missing Number: "+ans);
		
	}
	public static int missingNum(int[] nums){
	    int n=nums.length;
	    //int res=nums[0];
	    int res=0;
	    Arrays.sort(nums);
	    
	    for(int i=0; i<n; i++){
	        int j=i+1;
	        if(nums[i] != j){
	          res=j;  
	          break;
	        }
	    }
	    return res;
    }
}

/*
Output:

Enter the array size:5
Enter the element: 
3 2 5 4 6
Missing Number: 1

Enter the array size:7
Enter the element: 
2 4 1 6 3 7 8
Missing Number: 5

*/