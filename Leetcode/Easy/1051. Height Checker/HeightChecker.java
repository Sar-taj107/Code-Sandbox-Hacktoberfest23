//package Easy.1051. Height Checker;
import java.util.*;
public class HeightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int heights[] = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          heights[i] = sc.nextInt();
        }
        
        int ans = heightChecker( heights);
        System.out.println("Ans: "+ans);
    }
    public static int heightChecker(int[] heights){
      
      int n=heights.length;
      int[] expected = new int[n];
      int idx=0;
      for(int x : heights){
        expected[idx++] = x;
      }
      Arrays.sort(expected);
      int count = 0;
      for(int i=0; i<n; i++){
        if(heights[i] != expected[i]){
          count++;
        }
      }
      return count;
    }
}
  
  /*
  Input: heights = [1,1,4,2,1,3]
  Output: 3
  Explanation: 
  heights:  [1,1,4,2,1,3]
  expected: [1,1,1,2,3,4]
  Indices 2, 4, and 5 do not match.
  Example 2:
  
  Input: heights = [5,1,2,3,4]
  Output: 5
  */
