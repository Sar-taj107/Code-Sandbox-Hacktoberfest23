import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string here: ");
        String input = scanner.nextLine();
        scanner.close();

        int len1 = input.length();
        System.out.println(len1);
        System.out.println("Reversed String without using function");
        for (int i = len1 - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
        System.out.println("Reversed String using function");
        System.out.println(reverseString(input));
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}

/*

Output:

Enter the string here: 10
Reversed String without using function
yrots edoc
Reversed String using function
yrots edoc

*/
