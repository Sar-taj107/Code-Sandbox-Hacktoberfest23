//package Medium.2958. Length of Longest Subarray With at Most K Frequency;
import java.util.*;
public class LongestStrictlyIncreasingorStrictlyDecreasingSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int ans = longestMonotonicSubarray(nums);
        System.out.print("Longest subarray len: "+ans);
    }
    public static int longestMonotonicSubarray(int[] nums){

        int n=nums.length;
        int inc=1, dec=1;
        int maxLen =1;
        for(int i=1; i<n; i++){
            if(nums[i] > nums[i-1]){
                inc++;
                dec =1;
            }else if(nums[i] < nums[i-1]){
                dec++;
                inc =1;
            }else{
                inc=1;
                dec=1;
            }
            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }
        return maxLen;
    }
}

/*
Output:

Enter the array Size: 5
Enter the Element: 1 4 3 3 2
Longest subarray len: 2

Enter the array Size: 4
Enter the Element: 3 3 3 3
Longest subarray len: 1

Enter the array Size: 3
Enter the Element: 3 2 1
Longest subarray len: 3

*/

