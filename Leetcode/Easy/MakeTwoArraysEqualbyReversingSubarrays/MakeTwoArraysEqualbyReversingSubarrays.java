package Easy.MakeTwoArraysEqualbyReversingSubarrays;

//package Easy.MakeTwoArraysEqualbyReversingSubarrays;
import java.util.*;
public class MakeTwoArraysEqualbyReversingSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the target size: ");
        int m = sc.nextInt();
        int[] target = new int[m];
        System.out.println("Enter the element: ");
        for(int i=0; i<m; i++){
          target[i] = sc.nextInt();
        }
        
        System.out.println("Enter the arr size:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        
        
        
        boolean ans = canBeEqual(target, arr);
        System.out.println(ans);
    }
    public static boolean canBeEqual(int[] target, int[] arr){
      
      int n=target.length;
      Arrays.sort(arr);
      Arrays.sort(target);
      
      for(int i=0; i<n; i++){
        if(arr[i] != target[i]){
          return false;
        }
      }
      return true;
    }
}
  
/*
Input: target = [1,2,3,4], arr = [2,4,1,3]
Output: true
*/
