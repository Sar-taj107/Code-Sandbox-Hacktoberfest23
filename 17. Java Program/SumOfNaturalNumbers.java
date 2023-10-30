import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        int sum = calculateSum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }

    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n * (n + 1)) / 2;
    }
}
