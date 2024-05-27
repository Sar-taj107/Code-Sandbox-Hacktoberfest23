//package Easy.1608. Special Array With X Elements Greater Than or Equal X;
import java.util.*;
public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        int ans = specialArray(nums);
        System.out.println("Ans: "+ans);
    }
    public static int specialArray(int[] nums){
      int n=nums.length;
      for(int i=0; i<=n; i++){
        int count=0;
        for(int num : nums){
          if(num >= i){
            count++;
          }
        }
        if(count == i){
          return i;
        }
      }
      return -1;
    }
  }
  
  /*
  Enter the array size: 2
  Enter the element: 3 5
  Ans: 2
  
  Enter the array size: 5
  Enter the element: 0 4 3 0 4
  Ans: 3
  
  */