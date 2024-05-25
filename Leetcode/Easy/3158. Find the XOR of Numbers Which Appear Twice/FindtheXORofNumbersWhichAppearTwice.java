//package Easy.3158. Find the XOR of Numbers Which Appear Twice;
import java.util.*;
public class FindtheXORofNumbersWhichAppearTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        
        int ans = duplicateNumbersXOR(nums);
        System.out.println(ans);
    }
    public static int duplicateNumbersXOR(int[] nums){
      
      Map<Integer,Integer> mp = new HashMap<>();
      for(int num : nums){
        mp.put(num, mp.getOrDefault(num, 0)+1);
      }
      int xor = 0;
      for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
        if(entry.getValue() == 2){
          xor = xor ^ entry.getKey();
        }
      }
      return xor;
    }
}

/*

Input: nums = [1,2,1,3]
Output: 1

Input: nums = [1,2,3]
Output: 0

Input: nums = [1,2,2,1]
Output: 3

*/
