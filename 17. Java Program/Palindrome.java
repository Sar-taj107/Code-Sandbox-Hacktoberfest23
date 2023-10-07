import java.util.Scanner;
//Both string and number 
/* 
public class Palindrome {
    public static void main(String[] args)
    {
        int i;
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string Or number:");
        original = sc.nextLine();

        int length = original.length();
        for(i=length-1;i>=0;i--)
        reverse = reverse+original.charAt(i);
        if(original.equals(reverse)){
            System.out.println(original+" is a palindrome");
        }
        else{
            System.err.println(original+" is not a palindrome");
        }
    }
}

*/
public class Palindrome{
    public static void main(String[] args){
        int n,r,temp;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r = n%10;
            sum=(sum*10)+r;
            n=n/10;

        }
        if(temp==sum)
        System.out.println("It is a palindrome number");
        else
        System.out.println("It is not a palindrome number");

    }
} 


 