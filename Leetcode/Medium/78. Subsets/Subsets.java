//package Medium.78. Subsets;
import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        
        List<List<Integer>> res = new ArrayList<>();
        generateSubset(nums, 0, new ArrayList<>(), res);

        System.out.print("All subsets are: ");
        for (int i = 0; i < res.size(); i++) {
              List<Integer> subset = res.get(i);
              System.out.print("[");
              for (int j = 0; j < subset.size(); j++) {
                  System.out.print(subset.get(j));
                  if (j < subset.size() - 1) {
                      System.out.print(", ");
                  }
              }
              System.out.print("] ");
          }
    }
    public static void generateSubset(int[] nums, int idx, List<Integer> curSubset, List<List<Integer>> res){
      
      int n=nums.length;
      res.add(new ArrayList<>(curSubset));
      
      for(int i=idx; i<n; i++){
        curSubset.add(nums[i]);
        generateSubset(nums, i+1, curSubset, res);
        curSubset.remove(curSubset.size() - 1);
      }
    }
}

/*
Output:
Enter the array Size: 3
Enter the element: 1 2 3
All subsets are: [] [1] [1, 2] [1, 2, 3] [1, 3] [2] [2, 3] [3]

*/