//package Medium.1219. Path with Maximum Gold;
import java.util.*;
public class PathwithMaximumGold {
    static int maxGold = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r=sc.nextInt();
        System.out.println("Enter the column:");
        int c=sc.nextInt();
        int[][] grid = new int[r][c];
        System.out.println("Enter the elment: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int ans = getMaximumGold(grid);
        System.err.println(ans);
    }
    public static void collectGold(int[][] grid, int i, int j, boolean[][] visited, ArrayList<Integer> bag){

        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || visited[i][j] == true || grid[i][j]==0){
            return;
        }
        int curGold  = grid[i][j];
        bag.add(curGold);
        visited[i][j] = true;
        int sum =0;
        for(int val : bag){
            sum += val;
        }
        if(sum > maxGold){
            maxGold = sum;
        }
        collectGold(grid, i-1, j, visited, bag);
        collectGold(grid, i+1, j, visited, bag);
        collectGold(grid, i, j-1, visited, bag);
        collectGold(grid, i, j+1, visited, bag);
        visited[i][j] = false;
        bag.remove(bag.size() - 1);

    }
    public static int getMaximumGold(int[][] grid){

        int n=grid.length;
        int m=grid[0].length;

        boolean[][] visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ArrayList<Integer> bag = new ArrayList<>();
                if(grid[i][j] != 0  && visited[i][j]==false){
                    collectGold(grid, i, j, visited,bag);
                }
            }
        }
        return maxGold;
    }
}
/*
Output:
Enter the row: 
Enter the column:
Enter the elment: 
0 6 0
5 8 7
0 9 0

Maximum Gold: 24
*/