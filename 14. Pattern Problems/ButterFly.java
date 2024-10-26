
/*
ques: Butter fly pattern

                        *             *
                        * *         * *
                        * * *     * * *
                        * * * * * * * *
                        * * * * * * * *
                        * * *     * * *
                        * *         * *
                        *             *
 */
import java.util.*;
public class ButterFly {
    public static void main(String[] args){
        System.out.print("Enter the number of row:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1; i<=n; i++){
            //upper half part 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for print space =2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half part
        for(int i=n; i>=1; i--){
            
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //for print space =2*(n-i)
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
