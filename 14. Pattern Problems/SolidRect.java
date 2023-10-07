import java.util.Scanner;
import java.util.*;

//question:
/*
 * if rows=5 , column=4
                         ****
                         ****
                         ****
                         ****
                         ****
 
 */



public class SolidRect {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of column:");
        int m=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
