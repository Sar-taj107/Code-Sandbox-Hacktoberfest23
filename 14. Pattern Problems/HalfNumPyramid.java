
/*
 ques:Increasing number triangle
        1
        1 2
        1 2 3 
        1 2 3 4
 */
import java.util.Scanner;
public class HalfNumPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of row:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
