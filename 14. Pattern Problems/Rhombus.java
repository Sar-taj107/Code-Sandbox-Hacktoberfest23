import java.util.Scanner;

/*
ques:print  regular rhombus 

                             *****
                            *****
                           *****
                          *****
                         *****
 */

public class Rhombus {
    public static void main(String[] args) {
        System.out.print("Enter the number of row:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            //print spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //print star
            for(int j=1;j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
