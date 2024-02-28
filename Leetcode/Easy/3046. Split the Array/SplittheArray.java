/*
Approach1 using hashmap to store the freq of elem and then check any elem present in array nums having freq greater than 2 then simply return fasle otherwise 
true;
Tc- O(n)
sc- O(n) 
*/

//package Easy.3046. Split the Array;
import java.util.*;
public class SplittheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        boolean ans = isPossibleToSplit(nums);
        System.out.println(ans);
    }
    public static boolean isPossibleToSplit(int[] nums){

        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>2){
                return false;
            }
        }
        return true;
    }
}

/*
Approach2 here we simply sort the given nums array using Arrays.sort method and then iterative the array and then find the element whose count more than twice
then just return false otherwise true.
Tc- O(nlogn)  due to sorting nums array
sc- O(1) 
*/

//package Easy.3046. Split the Array;
import java.util.*;
public class SplittheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        boolean ans = isPossibleToSplit(nums);
        System.out.println(ans);
    }
    public static boolean isPossibleToSplit(int[] nums){
        
        int n=nums.length;
        Arrays.sort(nums);
        int count =1;
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count > 2){
                    return false;
                }
            }else{
                count =1;
            }
        }
        return true;
    }
}
/*
Output:

Enter array size: 6
Enter the Element: 1 1 2 2 3 4
true

Enter array size: 4  
Enter the Element: 1 1 1 1
false

Enter array size: 6
Enter the Element: 2 2 3 4 1 2
false

*/
