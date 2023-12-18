import java.util.*;
public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the element:");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int ans = maxProdDiffBetweenPair(nums);
        System.out.println("MaximumProductDifferenceBetweenTwoPairs :"+ans);
    }
    public static int maxProdDiffBetweenPair(int[] nums){
        int n=nums.length;
        Arrays.sort(nums);
        int maxProdDiff=0;
        int l=0, r=0, i=0;
        
        l=nums[i] * nums[i+1];
        r=nums[n-2] * nums[n-1];
        maxProdDiff = (r - l);
        return maxProdDiff;
    }
}

/*
Output: 

Enter the array size:6
Enter the element:2 6 7 1 8 5
MaximumProductDifferenceBetweenTwoPairs :54

Enter the array size:4
Enter the element:3 6 2 7
MaximumProductDifferenceBetweenTwoPairs :36

*/