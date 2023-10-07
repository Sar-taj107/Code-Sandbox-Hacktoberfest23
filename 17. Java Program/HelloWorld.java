import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args)
    {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
