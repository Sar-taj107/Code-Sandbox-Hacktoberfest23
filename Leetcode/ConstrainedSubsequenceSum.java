import java.util.*;
/*
ques:1425
Given an integer array nums and an integer k, return the maximum sum of a non-empty subsequence
of that array such that for every two consecutive integers in the subsequence,
nums[i] and nums[j], where i < j, the condition j - i <= k is satisfied.
A subsequence of an array is obtained by deleting some number of elements 
(can be zero) from the array, leaving the remaining elements in their original order.

 */
public class ConstrainedSubsequenceSum {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the element:");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k=sc.nextInt();
        int ans =constrainSubseqSum(nums,k);
        System.out.println("Maximum Subsequence sum:" +ans);

   }
     static int constrainSubseqSum(int nums[], int k){

        int n=nums.length;
        int[] dp = new int[n];
        int maxSum=nums[0];

        Deque<Integer> dq = new ArrayDeque<>(); //create double ended-queue

        for(int i=0; i<n; i++){

            while(!dq.isEmpty() && i - dq.peekFirst()>k){       // Ensure the valid range for the maximum value.
                dq.pollFirst();
            }
            dp[i]=nums[i];
            if(!dq.isEmpty()){
               dp[i]=Math.max(dp[i], nums[i]+dp[dq.peekFirst()]);
            }
            while(!dq.isEmpty() && dp[dq.peekLast()] <= dp[i]){   // Maintain maxValues in decreasing order.
                dq.pollLast();
            }
            dq.offerLast(i);
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    } 
}

/*
 
OUtPUT:
exp1.
Enter the array size:
5
Enter the element:
10 2 -10 5 20
Enter the value of K:
2
Maximum Subsequence sum:37

exp2.
Enter the array size:
3
Enter the element:
-1 -2 -3
Enter the value of K:
1
Maximum Subsequence sum:-1

 */