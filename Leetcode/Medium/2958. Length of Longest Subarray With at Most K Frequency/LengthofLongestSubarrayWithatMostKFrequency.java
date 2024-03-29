//package Medium.2958. Length of Longest Subarray With at Most K Frequency;
import java.util.*;
public class LengthofLongestSubarrayWithatMostKFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the ELement: ");
        for(int i=0; i<n; i++){
            nums[i] =sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int ans = maxSubarrayLength(nums,k);
        System.out.print("Maximum length subarray of freq k: "+ans);
    }
    public static int maxSubarrayLength(int[] nums, int k){
        int n=nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0;
        int j=0;
        for(int i=0; i<n; i++){
            
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
            while(j<i && mp.get(nums[i]) > k){
                j++;
                mp.put(nums[j], mp.get(nums[j]) - 1);
            }
            maxLen = Math.max(maxLen, i - j +1);
        }
        return maxLen;
    }
}

/*
Output:

Enter the array size: 8
Enter the ELement: 1 2 3 1 2 3 1 2
Enter the value of k: 2
Maximum length subarray of freq k: 6

Enter the array size: 8
Enter the ELement: 1 2 1 2 1 2 1 2
Enter the value of k: 1
Maximum length subarray of freq k: 2

*/

