/*
Write a program, where you are given 2 unbiased dice i.e d1 & d2 containing 6 faces.
You will be given an input sum which should be obtained by throwing two dices. You 
need to print the total number of possibilities where the sum on both the dices is 
equal to the input sum. If there are no possibilities then print 0.
*/
import java.util.*;
public class TwoDicesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum of both dices: ");
        int n=sc.nextInt();
        int ans = findNumberOfPosibility(n);
        System.out.println("Total number of possibility: "+ans);
        
    }
    static int findNumberOfPosibility(int n){

        int posiblty=0;
        if(n<2 || n>12){
            return 0; 
        }
        
        for(int i=1; i<=6; i++){
            if(n-i <= 6 && n-i > 0){
                posiblty++;
            }
        }
        return posiblty;
        
    }
}

/*

Output:

Enter the sum of both dices: 
6
Total number of possibility: 5

Enter the sum of both dices: 
12
Total number of possibility: 1

*/