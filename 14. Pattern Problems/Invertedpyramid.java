import java.util.Scanner;

/*
reverse half pyramid rotate with 180

                    *
                  * *
                * * *
              * * * *
                    
 */



public class Invertedpyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number of row:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //outer loop 
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
