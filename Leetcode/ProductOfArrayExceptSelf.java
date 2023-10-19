import java.util.*;
/*
 
Q238.Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

 
 */
public class ProductOfArrayExceptSelf {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        
        int[] nums = new int[n];

        System.out.println("Enter the element:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = productExceptSelf(nums);
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }

    }
    static int[] productExceptSelf(int nums[]){

        int n=nums.length;
        int[] res = new int[n];

        int leftProduct=1;
        for(int i=0; i<n; i++){
            res[i] = leftProduct;
            leftProduct *=nums[i];
        }

        int rightProduct=1;
        for(int i=n-1; i>=0; i--){
            res[i] *=rightProduct;
            rightProduct *= nums[i];
        }
        return res;
    }
}

/*

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 OUTPUT:
Enter the array size:
4
Enter the element:
1 2 3 4
24 12 8 6 

 */