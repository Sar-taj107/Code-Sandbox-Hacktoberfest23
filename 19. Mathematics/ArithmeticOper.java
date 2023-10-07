import java.util.Scanner;

public class ArithmeticOper {
    public static void main(String[] args)
    {
        int a,b,add,sub,mult;
        double div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer value:");
        a=sc.nextInt();
        System.out.println("Enter 2nd integer value:");
        b=sc.nextInt();
        add=a+b;
        System.out.println("Summation: " + add);
        sub=a-b;
        System.out.println("Difference :" + sub);
        mult=a*b;
        System.out.println("Product: " + mult);
        div=(double) a/b;
        System.out.println("Division: " + div);
    }

}
