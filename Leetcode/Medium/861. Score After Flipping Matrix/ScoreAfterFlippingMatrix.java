//package Medium.861. Score After Flipping Matrix;
import java.util.*;
public class ScoreAfterFlippingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r=sc.nextInt();
        System.out.println("Enter the col: ");
        int c=sc.nextInt();
        int[][] grid = new int[r][c];
        System.out.println("Enter the binary value: ");
        for(int i=0; i<r; i++){
          for(int j=0; j<c; j++){
            grid[i][j] =sc.nextInt();
          }
        }
        int ans = matrixScore(grid);
        System.out.println("Maximum score: "+ans);
    }
    public static int matrixScore(int[][] grid){
      
      int n=grid.length;
      int m=grid[0].length;
      
      for(int i=0; i<n; i++){
        if(grid[i][0] == 0){
          for(int j=0; j<m; j++){
            grid[i][j] = 1 - grid[i][j];
          }
        }
      }
      
      for(int j=1; j<m; j++){
        int countOne =0;
        for(int i=0; i<n; i++){
          if(grid[i][j] == 1){
            countOne++;
          }
        }
        int countZero = n - countOne;
        if(countZero > countOne){
          for(int i=0; i<n; i++){
            grid[i][j] = 1 - grid[i][j];
          }
        }
      }
      int score = 0;
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
          int val = grid[i][j] * (int)Math.pow(2, m-j-1);
          score +=val;
        }
      }
      return score;
    }
}

/*
Output:
Enter the row: 3
Enter the col: 4
Enter the binary value: 
0 0 1 1
1 0 1 0
1 1 0 0
Maximum score: 39

*/
