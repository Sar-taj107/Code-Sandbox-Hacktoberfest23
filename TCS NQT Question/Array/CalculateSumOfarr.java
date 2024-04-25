//package TCS NQT Question.Array;
import java.util.*;
public class CalculateSumOfarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = findSum(nums);
        System.out.println(ans);
    }
    public static int findSum(int[] nums){

        int sum =0;
        for(int x : nums){
            sum += x;
        }
        return sum;
    }
}

/*
Output:
Enter the array size: 5
Enter the element: 1 2 3 4 5
sum: 15

*/