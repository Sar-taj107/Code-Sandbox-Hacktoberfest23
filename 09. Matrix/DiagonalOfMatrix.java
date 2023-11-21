/* 
Efficiently compute sums of diagonals of a matrix
Given a 2D square matrix, find the sum of elements in Principal and Secondary diagonals.
For example, consider the following 4 X 4 input matrix.

A00 A01 A02 A03
A10 A11 A12 A13
A20 A21 A22 A23
A30 A31 A32 A33
The primary diagonal is formed by the elements A00, A11, A22, A33. 

Condition for Principal Diagonal: The row-column condition is row = column. 
The secondary diagonal is formed by the elements A03, A12, A21, A30.
Condition for Secondary Diagonal: The row-column condition is 
row = numberOfRows – column -1.
Examples : 

Input : 
4
1 2 3 4
4 3 2 1
7 8 9 6
6 5 4 3
Output :
Principal Diagonal: 16
Secondary Diagonal: 20
*/
import java.util.*;
public class DiagonalOfMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row size: ");
		int row=sc.nextInt();
		System.out.print("Enter the col size: ");
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		
		System.out.println("Enter the element: ");
		for(int i=0; i<row; i++){
		    for(int j=0; j<col; j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		diagonalSum(matrix);
	}
	public static void diagonalSum(int[][] matrix){
	    
	    int n=matrix.length;
	    int m=matrix[0].length;
	    int primSum=0, secodSum=0;
	    
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            if(i==j){
	                primSum +=matrix[i][j];
	            }
	            if(i==n-j-1){
	                secodSum +=matrix[i][j];
	            }
	        }
	    }
	    System.out.println("sum of principal diagonal:"+primSum);
	    System.out.println("sum of secondary diagonal:"+secodSum);
    }
}

/*

Enter the row size: 4
Enter the col size: 4
Enter the element: 
1 2 3 4
4 3 2 1
7 8 9 6
6 5 4 3
sum of principal diagonal:16
sum of secondary diagonal:20

*/
