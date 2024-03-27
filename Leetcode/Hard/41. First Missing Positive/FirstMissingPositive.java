//package Hard.41. First Missing Positive;
//Tc- O(n)  , Sc - O(1)
import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i] =sc.nextInt();
        }
        int ans = firstMissingPositive(nums);
        System.out.print("First Positive Number: "+ans);
    }
    public static int firstMissingPositive(int[] nums){
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] <= 0 || nums[i] > n){
                nums[i] = n+1;
            }
        }

        for(int i=0; i<n; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(idx >=0 && idx < n && nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }
        for(int i =0; i<n; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }
        return n+1;
    }
}

/*

Enter array size: 3
Enter the Element: 1 2 0
First Positive Number: 3

Enter array size: 4
Enter the Element: 3 4 -1 1
First Positive Number: 2

Enter array size: 5
Enter the Element: 7 8 9 11 12
First Positive Number: 1

*/