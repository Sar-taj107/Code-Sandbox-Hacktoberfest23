//package Medium.2966. Divide Array Into Arrays With Max Difference;
import java.util.*;
public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter the ELement: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k=sc.nextInt();
        int[][] ans = divideArray(nums, k);
        System.out.print("Output: [");
        for (int i = 0; i < ans.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(Arrays.toString(ans[i]));
        }
        System.out.println("]");
    }
    public static int[][] divideArray(int[] nums, int k){
        int n=nums.length;
        Arrays.sort(nums);
        int[][] res = new int[n/3][3];
        int ixd = 0;
        for(int i=0; i<=n-3; i+=3){
            if(nums[i+2] - nums[i] > k){
                return new int[0][0];
            }else{
                res[ixd++] = new int[]{nums[i], nums[i+1], nums[i+2]};
            }
        }
        return res;
    }
}

/*

Enter array size: 9
Enter the ELement: 1 3 4 8 7 9 3 5 1
Enter value of k: 2
Output: [[1, 1, 3], [3, 4, 5], [7, 8, 9]]

Enter array size: 6
Enter the ELement: 1 3 3 2 7 3
Enter value of k: 3
Output: []

*/