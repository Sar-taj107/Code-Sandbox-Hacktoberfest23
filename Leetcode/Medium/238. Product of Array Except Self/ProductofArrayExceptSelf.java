//package Medium.238. Product of Array Except Self;

import java.util.*;
public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        System.out.print("Enter the element: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = productExceptSelf(nums);
        System.out.print("Product except itself: ");
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        
    }
    public static int[] productExceptSelf(int[] nums){
        int n=nums.length;
        int zeroCount = 0;
        int prodcWithoutZero =1;
        int[] res = new int[n];
        for(int num : nums){
            if(num == 0){
                zeroCount++;
            }else{
                prodcWithoutZero *= num;
            }
        }
        for(int i=0; i<n; i++){
            int num =nums[i];
            if(num != 0){
                if(zeroCount >0){
                    res[i] = 0;
                }else{
                    res[i] = prodcWithoutZero / num;
                }
            }else{
                if(zeroCount > 1){
                    res[i] = 0;
                }else{
                    res[i] = prodcWithoutZero;
                }
            }
        }
        return res;
    }
}

/*
Output:

Enter array size: 4
Enter the element: 1 2 3 4
Product except itself: 24 12 8 6 

Enter array size: 5
Enter the element: -1 1 0 -3 3
Product except itself: 0 0 9 0 0


*/