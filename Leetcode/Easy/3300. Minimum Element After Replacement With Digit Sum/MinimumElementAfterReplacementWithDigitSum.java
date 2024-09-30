//package Easy.3300. Minimum Element After Replacement With Digit Sum;
import java.util.*;
public class MinimumElementAfterReplacementWithDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();`
        }
        int ans = minElement(nums);
        System.out.println("Minimun Element: "+ans);
        
    }
    public static int minElement(int[] nums){
      
      int idx = 0;
      int[] res = new int[nums.length];
      for(int num : nums){
        
        int sum =0;
        String str = String.valueOf(num);
        for(int i=0; i<str.length(); i++){
          sum += Character.getNumericValue(str.charAt(i));
        }
        res[idx++] = sum;
      }
      Arrays.sort(res);
      return res[0];
    }
  }
  
/*
  Input: nums = [10,12,13,14]
  
  Output: 1
*/
