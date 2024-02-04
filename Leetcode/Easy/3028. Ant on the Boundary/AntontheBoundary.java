//package Easy.3028. Ant on the Boundary;
import java.util.*;
public class AntontheBoundary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the element: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = returnToBoundaryCount(nums);
        System.out.println("Number of time an ant return to the boundary: "+ans);
    }
    public static int returnToBoundaryCount(int[] nums){
        int n=nums.length;
        int sum=0;
        int retTOBoundary=0;
        for(int i=0; i<n; i++){
            sum +=nums[i];
            if(sum==0){
                retTOBoundary++;
            }
        }
        return retTOBoundary;
    }
}

/*
Output:

Enter array size: 3
Enter the element: 2 3 -5
Number of time an ant return to the boundary: 1

Enter array size: 4
Enter the element: 3 2 -3 -4
Number of time an ant return to the boundary: 0

*/