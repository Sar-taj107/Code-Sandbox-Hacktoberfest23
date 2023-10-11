import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, N, i;

        System.out.println("Enter the size of an array here:");
        N = scanner.nextInt();
        int[] a = new int[N];

        System.out.println("Enter the elements of the array here:");
        for (i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to search here:");
        num = scanner.nextInt();

        System.out.println("Array is:");
        for (i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (i = 0; i < N; i++) {
            if (a[i] == num) {
                System.out.printf("Number found at index %d%n", i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Number Not Found in the array");
        }
    }
}
