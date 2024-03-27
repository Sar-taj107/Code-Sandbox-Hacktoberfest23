//package Medium.713. Subarray Product Less Than K;

import java.util.*;
public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int ans =  numSubarrayProductLessThanK(nums, k);
        System.out.print("Number of subarray prodcut less than k: "+ans);
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k){

        int n=nums.length;
        int count =0;
        if(k <= 1){
            return 0;
        }
        for(int i=0; i<n; i++){
            int prod =1;
            for(int j=i; j<n; j++){
                prod *= nums[j];
                if(prod < k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}

/*
Output:

Enter the array size: 4
Enter the Element: 10 5 2 6
Enter the value of k: 100
Number of subarray prodcut less than k: 8

Enter the array size: 3
Enter the Element: 1 2 3
Enter the value of k: 0
Number of subarray prodcut less than k: 0

 */