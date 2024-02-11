//package Hard.1463. Cherry Pickup II;
import java.util.*;
public class CherryPickupII {
    static int memo[][][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int n=sc.nextInt();
        System.out.print("Enter the column: ");
        int m=sc.nextInt();
        int[][] grid = new int[n][m];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int ans=cherryPickup(grid);
        System.out.print("Maximum number of cherries: "+ans);
    }
    public static int cherryPickup(int[][] grid){
        int row=grid.length;
        int col=grid[0].length;
        memo=new int[71][71][71];      //Memoization we take 3D memo array and fill initially with -1 for storing repeated subprobl
                                    //coz here three variables are change r, c1 & c2.
        for(int i=0; i<71; i++){
            for(int j=0; j<71; j++){
                Arrays.fill(memo[i][j], -1);
            }
        }
        return solve(grid, 0,0,col-1);

    }
    public static int solve(int[][] grid, int r, int c1, int c2){
        if(c1<0 || c1 >=grid[0].length || c2<0 || c2>=grid[0].length){
            return 0;
        }
        int cherry=0;
        cherry +=grid[r][c1];
        if(c1 != c2){
            cherry +=grid[r][c2];
        }
        if(memo[r][c1][c2] != -1){
            return memo[r][c1][c2];
        }
        if(r != grid.length-1){
            int maxCherry=0;
            for(int nCol1=c1-1; nCol1<=c1+1; nCol1++){
                for(int nCol2=c2-1; nCol2<=c2+1; nCol2++){
                    maxCherry =Math.max(maxCherry, solve(grid, r+1, nCol1, nCol2));
                }
            }
            cherry +=maxCherry;
        }
        return memo[r][c1][c2]=cherry;
    }
}

/*
Output:
TC- O(n^3) SC - O(n^3)

Enter the row: 4
Enter the column: 3
Enter the element:
3 1 1 
2 5 1
1 5 5
2 1 1
Maximum number of cherries: 24

Enter the row: 5
Enter the column: 7
Enter the element:
1 0 0 0 0 0 1
2 0 0 0 0 3 0
2 0 9 0 0 0 0
0 3 0 5 4 0 0
1 0 2 3 0 0 6
Maximum number of cherries: 28

*/


