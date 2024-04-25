//package TCS NQT Question.Array;
import java.util.*;
public class CountFreqOfeachElemInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n= sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elment: ");
        for(int i=0; i<n; i++){
          nums[i] = sc.nextInt();
        }
        elemFreq(nums);
    }
    public static void elemFreq(int[] nums){
      
      Map<Integer,Integer> mp = new HashMap<>();
      for(int num : nums){
        mp.put(num, mp.getOrDefault(num,0)+1);
      }
      for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
        System.out.println(entry.getKey()+" "+entry.getValue());
      }
    }
}

/*
Output:
Enter the array size: 
6
Enter the elment:
10 5 10 15 10 5

5 2
10 3
15 1

 */