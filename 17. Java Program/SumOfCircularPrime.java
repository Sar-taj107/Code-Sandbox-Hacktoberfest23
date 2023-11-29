/*
Write a Java program to find the sum of all circular prime numbers within a specified range.
A circular prime is defined as a prime number for which every rotation of its digits results also a
prime number. Implement functions to calculate the sum, check if a number is a circular prime,

Enter starting value:100
Enter  ending Value:150
Sum of all circular prime number: 244
Explanation:
In between 100 to 150 they all are prime  101, 103, 107, 109, 113, 127, 131, 137, 139, and 149 but only 
113 and 131 are circular prim, so the sum these number (113 + 131 = 244).

*/
import java.util.*;
public class SumOfCircularPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting value:");
        int s=sc.nextInt();
        System.out.print("Enter  ending Value:");
        int e=sc.nextInt();
        int ans=circulPrimeSum(s, e);
        System.out.println("Sum of all circular prime number: "+ans);


    }
    public static int circulPrimeSum(int s,int e){
        int sum=0;
        
        int num=s;
        //List<Integer> li = new ArrayList<>();
        while(num<e){
            if(isCircular(num)){
                  
                sum +=num;
            }
            num++;
        }
        return sum;
    }
    public static boolean isCircular(int num){
        if(num<2){
            return false;
        }
        String str = Integer.toString(num);
        //String str = String.valueOf(num);
        int n=str.length();
        for(int i=0; i<n; i++){
            if(!isPrime(Integer.parseInt(str))){
                return false;
            }
            str = str.substring(1) + str.charAt(0);
        }
        return true;
    }

    public static boolean isPrime(int num){
        
        if(num <2){
            return false;
        }
        
        for(int i=2; i*i<=num;i++ ){
            if(num % i== 0){
                return false;
            }
        }
        return true;
    }
}

/*
Output:

Enter starting value:10
Enter  ending Value:90
Sum of all circular prime number: 332

Enter starting value:100
Enter  ending Value:150
Sum of all circular prime number: 244

*/