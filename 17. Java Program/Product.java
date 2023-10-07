import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2st number:");
        int b=sc.nextInt();

        int ans=productOfNumber(a, b);
        System.out.println("Product of two number is "+ans);

    }

    public static int productOfNumber(int a, int b){
        int prod = a*b;
        return prod;
    }

}
