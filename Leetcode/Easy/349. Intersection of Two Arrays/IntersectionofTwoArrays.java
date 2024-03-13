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
// TC - O(n+m)       SC- O(min(n,m))    
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
------------------------------------------------****************************---------------------------------------------------

//2.Approach using Two- pointer concept
// Time complexity: O(nlog(n) + mlog(m))   , Space complexity: O(min(n,m))
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> st = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1=nums1.length;
        int l2=nums2.length;
        int i=0, j=0;
        while(i<l1 && j<l2){
            if(nums1[i] == nums2[j]){
                st.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]< nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int idx=0;
        int[] ans = new int[st.size()];
        for(int num: st){
            ans[idx++] = num;
        }
        return ans;
    }
}

--------------------------------------------*************************************------------------------------------
//3.Approach apply Binary search 
//Time complexity: O((n + m) log n),   Space complexity: *O(min(n, m))
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> st = new HashSet<>();
        Arrays.sort(nums1);
        int l1=nums1.length;
        int l2=nums2.length;
        for(int num : nums2){
            int left =0, right=l1-1;
            while(left<=right){
                int mid = left+(right - left)/2;
                if(nums1[mid] == num){
                    st.add(nums1[mid]);
                    break;
                }else if(nums1[mid] > num){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        int i=0;
        int[] ans = new int[st.size()];
        for(int num : st){
            ans[i++] = num;
        }
        return ans;
    }
}
