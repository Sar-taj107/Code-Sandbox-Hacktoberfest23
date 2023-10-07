import java.util.Scanner;
public class PrintPrime {
    public static void main(String[] args)
    {
        int i,j,n,count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit:");
        n=sc.nextInt();
        System.out.println("prime number from 1 to " +n+ ":");
        for(i=1;i<=n;i++){
           count=0;
           for(j=2;j<=i/2;j++)
           {
            if(i%j==0)
            {
                count++;
                break;
            }
           }
           if(count==0 && i!=1)
           {
            System.out.print(i+" ");
           }
        }
        
    }
}
