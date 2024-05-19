//package Easy.3151. Special Array I;
import java.util.*;
public class SpecialArrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] =sc.nextInt();
        }
        boolean ans = isArraySpecial(nums);
        System.out.println(ans);
    }
    public static boolean isArraySpecial(int[] nums){
      
      int n=nums.length;
      if(n < 2) return true;
      
      for(int i=0; i<n-1; i++){
        int x = nums[i] ;
        int y = nums[i+1];
        if(((x%2 == 0) && (y%2 == 0)) || ((x%2 != 0) && (y%2 != 0))){
          return false;
        }
      }
      return true;
    }
}

/*
Output:
Enter the array size: 3
Enter the element: 2 1 4
true

Enter the array size: 4
Enter the element: 4 3 1 6
false

*/