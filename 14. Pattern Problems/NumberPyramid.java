import java.util.*;
public class NumberPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of row:");
        Scanner sc  = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1; i<=n; i++){
            //print spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //print number itself no. of times
            for(int j=1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
