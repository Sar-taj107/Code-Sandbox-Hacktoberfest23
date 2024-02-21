//package Medium.201. Bitwise AND of Numbers Range;
import java.util.Scanner;
public class BitwiseANDofNumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter left value:");
        int l=sc.nextInt();
        System.out.println("Enter right value:");
        int r=sc.nextInt();
        int val = rangeBitwiseAnd(l,r);
        System.out.println("ans: "+val);
    }
    public static int rangeBitwiseAnd(int left, int right){
        while(left < right){
            right = right & (right -1);
        }
        return right;
    }
}

/*
Output:

Enter left value: 5
Enter right value: 7
ans: 4

Enter left value: 0
Enter right value: 0
ans: 0

Enter left value: 1
Enter right value: 2147483647
ans: 0

Enter left value: 11
Enter right value: 11
ans: 11

Enter left value: 1073741824
Enter right value: 2147483647
ans: 1073741824

*/

