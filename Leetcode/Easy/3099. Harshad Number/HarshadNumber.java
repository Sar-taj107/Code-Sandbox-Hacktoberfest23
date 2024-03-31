//package Easy.3099. Harshad Number;
import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int x = sc.nextInt();
        
        int ans = sumOfTheDigitsOfHarshadNumber(x);
        System.out.print(ans);
    }
    public static int sumOfTheDigitsOfHarshadNumber(int x){

        int origiNum =x;
        int sum =0;
        int num=0;
        while (x>0) {
            int rem = x%10;
            sum +=rem;
            x /=10;
        }
        if(origiNum % sum ==0 ){
            num =sum;
        }else{
            num = -1;
        }
        return num;
    }
}

/*
Output:

Enter array size: 18
9

Enter array size: 23
-1

*/