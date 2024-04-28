//package Easy.3131. Find the Integer Added to Array I;
import java.util.*;
public class FindtheIntegerAddedtoArrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nums1 size: ");
        int n= sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the nums2 size: ");
        int m= sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums2[i] = sc.nextInt();
        }
        
        int ans = addedInteger(nums1, nums2);
        System.out.println("Min val: "+ans);
    }
    public static int addedInteger(int[] nums1, int[] nums2){
      
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int diff = nums2[0] - nums1[0];
      return diff;
    }
}

/*
Output:

Enter the nums1 size: 3
Enter the element: 2 6 4
Enter the nums2 size: 3
Enter the element: 9 7 5
Min val: 3

*/