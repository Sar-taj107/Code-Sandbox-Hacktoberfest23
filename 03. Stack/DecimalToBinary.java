import java.util.*;

public class DecimalToBinary {
    private static int top = -1;
    private static int[] stack = new int[50];

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int num = obj.nextInt();

        if (num == 0) {
            System.out.println("Binary is: 0");
        } else {
            binary(num);
            System.out.println("Binary is:");
            for (int k = top; k >= 0; k--) {
                System.out.print(stack[k] + " ");
            }
        }
    }

    private static void binary(int num) {
        int m = num;
        int j = 0;
        while (m > 0) {
            top++;
            stack[top] = m % 2;
            m = m / 2;
            j++;
        }
    }
}
