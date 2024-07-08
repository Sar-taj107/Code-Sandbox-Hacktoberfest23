import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int res=factorialNum(n);
        System.out.println("Factorial of " +n+":" +res);

    }
    static int factorialNum(int n){
        if(n==0 ||n== 1){
            return 1;
        }
        else{
           return n*factorialNum(n-1);
        } 
    }
}

/*
 
Enter a number: 
5
Factorial of 5:120
Enter a number: 
3
Factorial of 3:6

 */
