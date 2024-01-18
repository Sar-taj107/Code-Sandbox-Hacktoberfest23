//15th jan 24 shift-1
//TCS NQT exam Q1
import java.util.*;
public class LowerDiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        lowerMat(mat);
    }
    public static void lowerMat(int[][] mat){
        int n=mat.length;
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i !=j && i<j){
                    arr[i][j] = 0;
                }else{
                    arr[i][j]=mat[i][j];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            if(i==n-1){
                break;
            }else{
                System.out.print(",");
            }
        }
    }
}
/*
Output:

3
1 2 3 
4 5 6
7 8 9
1 0 0 ,4 5 0 ,7 8 9

*/
