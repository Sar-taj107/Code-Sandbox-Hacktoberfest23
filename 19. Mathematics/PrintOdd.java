import java.util.*;
public class PrintOdd {
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit:");
        n=sc.nextInt();
        System.out.println("Odd numbers from 1 to "+n+" are:");
        for(i=1;i<n;i++){
            if(i%2!=0){
                System.out.print(i +" ");
            }
        }
    }
}
