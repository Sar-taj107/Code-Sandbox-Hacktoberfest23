//package Medium.442. Find All Duplicates in an Array;
import java.util.*;
public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        List<Integer> ans = findDuplicates(nums);
        System.out.print("Duplicate Element: ");
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static List<Integer> findDuplicates(int[] nums){

        ArrayList<Integer> res  = new ArrayList<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            int idx = Math.abs(nums[i]) -1;
            if(nums[idx] < 0){
                res.add(idx + 1);
            }else{
                nums[idx] = -nums[idx];
            }
        }
        return res;
    }
}

/*
Output:

Enter the array size: 8
Enter the Element: 4 3 2 7 8 2 3 1
Duplicate Element: 2 3

Enter the array size: 3
Enter the Element: 1 1 2
Duplicate Element: 1

Enter the array size: 1
Enter the Element: 1
Duplicate Element:

*/

