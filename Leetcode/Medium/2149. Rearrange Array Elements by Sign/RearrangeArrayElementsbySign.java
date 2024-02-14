//package Medium.2149. Rearrange Array Elements by Sign;
//1 Approach Tc - O(n)
import java.util.*;
public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int[] ans = rearrangeArray(nums);
        System.out.print("After reaarange: ");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]);
            if(i<n-1){
                System.out.print(",");
            }
        }
    }

    public static int[] rearrangeArray(int[] nums){
        int n=nums.length;
        int[] res = new int[n];
        int pIdx=0, nIdx=1;
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                res[pIdx]=nums[i];
                pIdx +=2;
            }else{
                res[nIdx]=nums[i];
                nIdx +=2;
            }
        }
        return res;
    }
}


/*
Output: 

Enter array size: 6
Enter the Element: 3 1 -2 -5 2 -4
After reaarange: 3,-2,1,-5,2,-4

Enter array size: 2
Enter the Element: -1 1
After reaarange: 1,-1

*/