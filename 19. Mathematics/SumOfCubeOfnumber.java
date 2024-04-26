/*
Question 1:
write a program to find the total sum of cube of given number of ranges
i.e 
Lower limit = N
upper limit = M

format: 
input N=2, M=5
output = 224

Explanation: 
2^3 + 3^3 + 4^3 + 5^3 = 224
35+64+64+125 =224

constraints:
1<=N<M<=40

*/
import java.util.*;
public class SumOfCubeOfnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int N=sc.nextInt();
        System.out.println("Enter the upper limit: ");
        int M=sc.nextInt();
        
        long ans = sumOfCube(N,M);
        System.out.println("Sum: "+ans);
    }
    public static long sumOfCube(int N, int M){
      
      long sum = 0;
      while(N<=M){
        long x = N*N*N;
        sum += x;
        N++;
      }
      return sum;
    }
}

/*
Output:
Enter the lower limit: 2
Enter the upper limit: 5
Sum: 224

Enter the lower limit: 3
Enter the upper limit: 22
Sum: 64000

*/