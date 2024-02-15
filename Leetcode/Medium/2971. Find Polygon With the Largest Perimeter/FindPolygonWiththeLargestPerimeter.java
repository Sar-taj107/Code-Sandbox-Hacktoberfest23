//package Medium.2971. Find Polygon With the Largest Perimeter;
import java.util.*;
public class FindPolygonWiththeLargestPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the element:");
        for(int i =0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        long ans=largestPerimeter(nums);
        System.out.print("Largest Perimeter: "+ans);

    }
    public static long largestPerimeter(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        long prefSum=0;
        for(int i=0;i<n; i++){
            prefSum +=nums[i];
        }
        
        for(int j=n-1; j>=0; j--){
            long val=prefSum-nums[j];
            
            if(val <= nums[j]){
                if(val<=0){
                    return -1;
                }
                prefSum =val;
            }
        }
        return prefSum;
    }
}

/*
Output:

Enter array size: 7
Enter the element:1 12 1 2 5 50 3
Largest Perimeter: 12

Enter array size: 3
Enter the element:5 5 5
Largest Perimeter: 15

Enter array size: 3
Enter the element:5 5 50
Largest Perimeter: -1
 
*/

