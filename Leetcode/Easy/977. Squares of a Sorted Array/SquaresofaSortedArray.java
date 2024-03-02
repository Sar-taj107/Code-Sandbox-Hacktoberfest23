//package Easy.977. Squares of a Sorted Array;
//1. Approach optimize using Two - pointer TC - O(n) 
import java.util.*;
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = sortedSquares(nums);
        System.err.print("sorted square array: ");
        for(int i=0; i<n; i++){
            System.err.print(ans[i]+" ");
        }

    }
    public static int[] sortedSquares(int[] nums){
        int n=nums.length;
        int left =0;
        int right =n-1;
        int idx =n-1;
        int[] res = new int[n];
        while (left<=right) {
            int leftSqu = nums[left] * nums[left];
            int rightSqu = nums[right] * nums[right];
            if(leftSqu > rightSqu){
                res[idx--] = leftSqu;
                left++; 
            }else{
                res[idx--] = rightSqu;
                right--;
            }
        }
        return res;
    } 
}


/*
Output:

Enter array size: 5
Enter the Element: -4 -1 0 3 10
sorted square array: 0 1 9 16 100

Enter array size: 5
Enter the Element: -7 -3 2 3 11
sorted square array: 4 9 9 49 121

*/
------------------------------------------------------------*******************-----------------------------------------------------------
//2. Approach using sorting TC- O(nlogn)
//package Easy.977. Squares of a Sorted Array;
import java.util.*;
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = sortedSquares(nums);
        System.err.print("sorted square array: ");
        for(int i=0; i<n; i++){
            System.err.print(ans[i]+" ");
        }

    }
    public static int[] sortedSquares(int[] nums){
        int idx = 0;
        int[] res = new int[nums.length];
        for(int num : nums){
            res[idx++] = num * num;
        } 
        Arrays.sort(res);
        return res;
    } 
}


/*
Output:

Enter array size: 5
Enter the Element: -4 -1 0 3 10
sorted square array: 0 1 9 16 100

Enter array size: 5
Enter the Element: -7 -3 2 3 11
sorted square array: 4 9 9 49 121

*/
