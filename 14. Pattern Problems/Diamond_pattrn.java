import java.util.Scanner;
/*
ques:Diamond-shape pattern

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

 */

public class Diamond_pattrn {
    public static void main(String[] args) {
        System.out.print("Enter the number of row:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        //outer loop
        for(int i=1;i<=n; i++){
            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
