//package Easy.231. Power of Two;
//1. approach 
import java.util.*;
public class PowerofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        boolean ans = isPowerOfTwo(n);
        System.out.print(ans);
    }
    public static boolean isPowerOfTwo(int n){
        int tmp=1;
        if(n==1) return true;
        while (tmp<n) {
            int x = 2*tmp;
            if(x==n){
                return true;
            }
            tmp=x;
        }
        return false;
    }
}

/*
Output: 

Enter the value of n: 1
true

Enter the value of n: 2
true

Enter the value of n: 3
false

Enter the value of n: 16
true

*/


//2. approach using bit magic to optimize tc
import java.util.*;
public class PowerofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        boolean ans = isPowerOfTwo(n);
        System.out.print(ans);
    }
    public static boolean isPowerOfTwo(int n){
        int a=n;
        int b=n-1;
        return a>0 && (a & b) == 0;
    }
}

/*
Output: 

Enter the value of n: 1
true

Enter the value of n: 20
false

Enter the value of n: 32
true

Enter the value of n: -16
false

*/
