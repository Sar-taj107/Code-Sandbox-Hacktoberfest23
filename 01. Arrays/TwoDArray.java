import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of cols:");
        int c= sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter the element:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Required 2D array:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
Output:

Enter the number of rows:
3
Enter the number of cols:
3
Enter the element:
3 4 6 
0 9 7
1 -3 2
Required 2D array:
3 4 6 
0 9 7
1 -3 2

 */
