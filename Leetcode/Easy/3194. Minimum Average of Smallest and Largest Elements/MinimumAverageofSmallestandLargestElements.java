//package Easy.3194. Minimum Average of Smallest and Largest Elements;
import java.util.*;
public class MinimumAverageofSmallestandLargestElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        double ans = minimumAverage(nums);
        System.out.println(ans);
    }
    public static double minimumAverage(int[] nums){
      
      int n=nums.length;
      List<Double> res = new ArrayList<>();
      Arrays.sort(nums);
      
      int l=0;
      int r=n-1;
      while(l<r){
        
        double avg = (nums[l] + nums[r]) / (double) 2;
        res.add(avg);
        l++;
        r--;
      }
      Collections.sort(res);
      return res.get(0);
    }
}
  
/* 
Output:

//Input: nums = [7,8,3,4,15,13,4,1]
//Output: 5.5

*/