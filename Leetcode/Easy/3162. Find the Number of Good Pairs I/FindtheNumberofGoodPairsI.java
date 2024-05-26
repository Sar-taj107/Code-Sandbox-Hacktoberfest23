//package Easy.3162. Find the Number of Good Pairs I;
import java.util.*;
public class FindtheNumberofGoodPairsI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of nums1: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums1[i] = sc.nextInt();
        }
        
        System.out.println("Enter size of nums2: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter the element: ");
        for(int i=0; i<m; i++){
          nums2[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        
        int ans = numberOfPairs(nums1, nums2, k);
        System.out.println("Total number of good pairs: "+ans);
    }
    public static int numberOfPairs(int[] nums1, int[] nums2, int k){
      
      int count =0;
      for(int i=0; i<nums2.length; i++){
        int x = nums2[i] * k;
        for(int j=0; j<nums1.length; j++){
          if(nums1[j] % x ==0){
            count++;
          }
        }
      }
      return count;
    }
  }
  
  /*
  Output:
  
  Enter size of nums1: 3
  Enter the element: 1 3 4
  Enter size of nums2: 3
  Enter the element: 1 3 4
  Enter the value of k: 1
  Total number of good pairs: 5
  
  Enter size of nums1: 4
  Enter the element: 1 2 4 12
  Enter size of nums2: 2
  Enter the element: 2 4
  Enter the value of k: 3
  Total number of good pairs: 2
  
  */

