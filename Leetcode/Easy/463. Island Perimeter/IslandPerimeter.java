//package Easy.463. Island Perimeter;

import java.util.*;
public class IslandPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int r=sc.nextInt();
        System.out.print("Enter the column: ");
        int c=sc.nextInt();
        int[][] grid= new int[r][c];
        System.out.println("Enter the value: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int ans = islandPerimeter(grid);
        System.out.println("Perimeter of island: "+ans);
    }
    public static int islandPerimeter(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int island =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    island +=4;
                    if(i>0 && grid[i-1][j]==1)     island--;
                    if(i<n-1 && grid[i+1][j]==1)   island--;
                    if(j>0 && grid[i][j-1]==1)     island--;
                    if(j<m-1 && grid[i][j+1]==1) island--;
                }
            }
        }
        return island;
    }
}

/*
Output:

Enter the row: 4
Enter the column: 4
Enter the value:
0 1 0 0
1 1 1 0
0 1 0 0
1 1 0 0
Perimeter of island: 16

Enter the row: 1
Enter the column: 1
Enter the value:
1
Perimeter of island: 4

Enter the row: 1
Enter the column: 2
Enter the value:
1 0
Perimeter of island: 4

*/