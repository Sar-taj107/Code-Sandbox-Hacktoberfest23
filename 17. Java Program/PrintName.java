import java.util.Scanner;

public class PrintName {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        printMyName(name);

    }
    public static void printMyName(String name){
        System.out.println("Your name is "+name);
        return;
    }
}
