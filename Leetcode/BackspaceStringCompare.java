import java.util.*;
/*
 
844.Backspace String Compare

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        String str1 = applyBackspace(s);
        String str2 = applyBackspace(t);
        return str1.equals(str2);
    }

    private String applyBackspace(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '#' && !stack.isEmpty()) {
                stack.pop();
            } else if (c != '#') {
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string (s): ");
        String s = scanner.nextLine();

        System.out.print("Enter the second string (t): ");
        String t = scanner.nextLine();

        BackspaceStringCompare sb= new BackspaceStringCompare();
        boolean result = sb.backspaceCompare(s, t);
        System.out.println("Result: " + result);
    }
}

/*
 
Enter the first string (s): ab##
Enter the second string (t): a#c#
Result: true

Enter the first string (s): a#c
Enter the second string (t): b
Result: false

 */