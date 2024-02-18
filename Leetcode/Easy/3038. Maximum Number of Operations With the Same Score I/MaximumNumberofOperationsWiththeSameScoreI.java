//package Easy.3038. Maximum Number of Operations With the Same Score I;
import java.util.*;
public class MaximumNumberofOperationsWiththeSameScoreI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        System.out.print("Enter the Element: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int ans = maxOperations(nums);
        System.out.println("Maximum number of operation: "+ans);
    }
    public static int maxOperations(int[] nums){
        int n=nums.length;
        int maxOper=0;
        int x=nums[0]+nums[1];
        for(int i=0; i<n-2; i++){
            int j=i+1;
            if(x==nums[i]+nums[j]){
                maxOper++;
            }
            i++;
        }
        return maxOper;
    }
}

/*
Output:

Enter array size: 5
Enter the Element: 3 2 1 4 5 
Maximum number of operation: 2

Enter array size: 5
Enter the Element: 3 2 6 1 4
Maximum number of operation: 1

*/


