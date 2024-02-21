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
//--------------------------------------java -----------------------------------
/*
Burte - force approach i.e just iterate the whole range from left to right value so this logic is also works but for large input it give
time limit exceeds TLE in leetcode the last test case. 
Last Executed Input
1073741824
2147483647

//1.approach brute force
        // int res=0;                                   
        // for(int i=left; i<right; i++){                
        //     res = i & (i+1);
        //     if(res==0){
        //         break;
        //     }
        // }
        // return res;
*/
