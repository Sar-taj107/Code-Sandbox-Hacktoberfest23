//package Medium.198. House Robber;
import java.util.*;
public class HouseRobber {
    static int[] t;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int ans = maxMoneyRob(nums);
        System.out.println("Maximum money rob: "+ans);

    }
    public static int solve(int[] nums, int idx, int n){
        int maxMoney=0;
        if(idx>=n){
            return 0;
        }
        if(t[idx] != -1){
            return t[idx];
        }
        int steal = nums[idx] + solve(nums, idx+2, n);
        int skip = solve(nums, idx+1, n);
        maxMoney = Math.max(steal, skip);
        return t[idx] = maxMoney;
    }
    public static int maxMoneyRob(int[] nums){
        int n=nums.length;
        t=new int[101];          //memoize
        Arrays.fill(t,-1);
        return solve(nums,0,n);
    }
}

/*
Output:
Enter array size:4
Enter the Element: 1 3 2 1
Maximum money rob: 4

Enter array size:5
Enter the Element: 2 7 9 3 1
Maximum money rob: 12

Enter array size:2
Enter the Element: 1 2
Maximum money rob: 2
 
*/