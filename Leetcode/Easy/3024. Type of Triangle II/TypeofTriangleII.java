//package Easy.3024. Type of Triangle II;
import java.util.*;
public class TypeofTriangleII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of triangle: 3 ");
        int n=sc.nextInt();
        int[] nums= new int[n];
        System.out.print("Enter the side length: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        String ans = triangleType(nums);
        System.out.println("Triangle Type: "+ans);
    }
    public static String triangleType(int[] nums){
        String res = "";
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];

        if(a+b > c && b+c > a && a+c > b){
            if(a==b && b==c){
                res ="equilateral";
            }else if(a==b || b==c || c==a){
                res ="isosceles";
            }else{
                res ="scalene";
            }
        }else{
            res ="none";
        }
        return res;
    }
}

/*
Output:
Enter side of triangle: 3
Enter the side length: 3 3 3
Triangle Type: equilateral

Enter side of triangle: 3
Enter the side length: 2 2 3
Triangle Type: isosceles

Enter side of triangle: 3
Enter the side length: 3 4 5
Triangle Type: scalene

Enter side of triangle: 3
Enter the side length: 1 2 1
Triangle Type: none

*/
