//package Easy.349. Intersection of Two Arrays;

/*
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted. 
*/
//1.Approach using HashSet
import java.util.*;
public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of nums1: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.print("Enter the Element of nums1: ");
        for(int i=0; i<n; i++){
            nums1[i]=sc.nextInt();
        }
        System.out.print("Enter size of nums2: ");
        int m=sc.nextInt();
        int[] nums2 = new int[m];
        System.out.print("Enter the Element of nums2: ");
        for(int i=0; i<m; i++){
            nums2[i]=sc.nextInt();
        }
        int[] ans = intersectionOfArr(nums1, nums2);
        System.out.print("Result array: ");
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] intersectionOfArr(int[] nums1, int[] nums2){

        int l=nums2.length;
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        for(int num : nums1){
            st1.add(num);
        }

        for(int num : nums2){
            if(st1.contains(num)){
                st2.add(num);
            }
        }
        int idx =0;
        int[] res  = new int[st2.size()];
        for(int val : st2){
            res[idx++] = val;
        }
        return res;
    }
}
/*
Output:

Enter size of nums1: 4
Enter the Element of nums1: 1 2 2 1
Enter size of nums2: 2 
Enter the Element of nums2: 2 2 
Result array: 2 

Enter size of nums1: 3
Enter the Element of nums1: 4 9 5 
Enter size of nums2: 5
Enter the Element of nums2: 9 4 9 8 4
Result array: 4 9


*/

