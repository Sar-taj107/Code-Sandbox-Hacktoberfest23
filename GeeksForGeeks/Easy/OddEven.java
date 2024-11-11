package GeeksForGeeks.Easy;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if(n % 2 != 0){
            System.out.println(n+" is odd number");
        }else{
            System.out.println(n+" is even number");
        }
    }
}

/*

Output:
Enter the number: 5
5 is odd number
Enter the number: 12
12 is odd number

*/
