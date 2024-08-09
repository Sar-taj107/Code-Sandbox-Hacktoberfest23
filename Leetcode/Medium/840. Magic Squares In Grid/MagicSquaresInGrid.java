import java.util.*;
public class MagicSquaresInGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the col: ");
        int c = sc.nextInt();
        
        int grid[][] = new int[r][c];
        System.out.println("Enter the value: ");
        for(int i=0; i<r; i++){
          for(int j=0; j<c; j++){
            grid[i][j] =sc.nextInt();
          }
        }
        
        int ans =  numMagicSquaresInside(grid);
        System.out.println("Total magic square: "+ans);
    }
    public static int  findRsum(int[][] grid, int r, int c){
      boolean[] visited = new boolean[10];
      int sum = 0;
      for(int i=0; i<3; i++){
        int rowS = 0;
        for(int j=0; j<3; j++){
          int val = grid[r+i][c+j];
          if(val == 0 || val >= 10 || visited[val]){
            return -1;
          }
          visited[val] = true;
          rowS += val;
        }
        if(i==0){
          sum =rowS;
        }else{
          if(sum != rowS){
            return -1;
          }
        }
      }
      return sum;
    }
    public static int  findCsum(int[][] grid, int r, int c){
      
      int sum = 0;
      for(int j=0; j<3; j++){
        int rowS = 0;
        for(int i=0; i<3; i++){
          int val = grid[r+i][c+j];
          rowS += val;
        }
        if(j==0){
          sum =rowS;
        }else{
          if(sum != rowS){
            return -1;
          }
        }
      }
      return sum;
    }
    public static int findDsum(int[][] grid, int r, int c){
      int d1 = grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2];
      int d2 = grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c];
      if(d1 == d2){
        return d1;
      }
      return -1;
    }
    public static boolean isMagicSq(int[][] grid, int r, int c){
      
      int rSum = findRsum(grid, r,c);
      if(rSum == -1){
        return false;
      }
      int cSum = findCsum(grid, r, c);
      if(cSum == -1){
        return false;
      }
      int dSum = findDsum(grid, r, c);
      if(dSum == -1){
        return false;
      }
      if(rSum == cSum && rSum == dSum){
        return true;
      }
      return false;
    }
    
    public static int numMagicSquaresInside(int[][] grid){
      
      int rows = grid.length;
      int cols = grid[0].length;
      
      int count = 0;
      for(int i=0; i<rows-2; i++){
        for(int j=0; j<cols-2; j++){
          if(isMagicSq(grid, i, j)){
            count++;
          }
        }
      }
      return count;
    }
}
  
/*
Input: grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
Output: 1  
*/

