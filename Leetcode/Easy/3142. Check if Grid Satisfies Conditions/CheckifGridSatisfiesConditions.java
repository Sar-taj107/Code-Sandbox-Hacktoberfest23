//package Easy.3142. Check if Grid Satisfies Conditions;
import java.util.*;
public class CheckifGridSatisfiesConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r=sc.nextInt();
        System.out.println("Enter the column: ");
        int c=sc.nextInt();
        int[][] grid = new int[r][c];
        System.out.println("Enter the element: ");
        for(int i=0; i<r; i++){
          for(int j=0; j<c; j++){
            grid[i][j] =sc.nextInt();
          }
        }
        boolean ans = satisfiesConditions(grid);
        System.out.println(ans);
        
    }
     public static boolean satisfiesConditions(int[][] grid){
       
       int n=grid.length;
       int m=grid[0].length;
       
       for(int i=0; i<n; i++){
         for(int j=0; j<m; j++){
           if(i+1<n && grid[i][j] != grid[i+1][j]){
             return false;
           }
           if(j+1<m && grid[i][j] == grid[i][j+1]){
             return false;
           }
         }
       }
       return true;
    }
}
  
/*
Output:
  Enter the row: 2
  Enter the column: 3
  Enter the element: 
  1 0 2
  1 0 2
  true
  
  Enter the row: 2
  Enter the column: 3
  Enter the element: 
  1 1 1
  0 0 0
  false
  
*/
