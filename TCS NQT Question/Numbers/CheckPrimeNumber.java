//package TCS NQT Question.Numbers;
import java.util.*;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        boolean ans = checkPrime(n);
        System.out.println(ans);
    }
    public static boolean checkPrime(int n){
      if(n<2) return false;
      for(int i=2; i*i<=n; i++){
        if(n % i == 0){
          return false;
        }
      }
      return true;
    }
}

/*
Output:
Enter a Number: 2
true

Enter a Number: 4
false 

*/