import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args)
    {
        int i=2, n;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();

        while (i <= n/2) {
            if(n%i==0)
            {
                flag=false;
                break;
            }    
            i++;
        }
        if(!flag){
            System.out.println(+n+ " is not a prime number");
        }
        else{
            System.out.println(+n+" is a prime number");
        }     
    }
}
