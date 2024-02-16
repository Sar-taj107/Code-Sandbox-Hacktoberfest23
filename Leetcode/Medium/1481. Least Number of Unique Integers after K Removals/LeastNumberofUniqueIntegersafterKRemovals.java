//package Medium.1481. Least Number of Unique Integers after K Removals;
import java.util.*;
public class LeastNumberofUniqueIntegersafterKRemovals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k=sc.nextInt();
        int ans = findLeastNumOfUniqueInts(arr,k);
        System.out.print("Least number of unique ELement after remove k: "+ans);
    }
    public static int findLeastNumOfUniqueInts(int[] arr, int k){
        int n=arr.length;
        Map<Integer,Integer> mp =new HashMap<>();
        for(int num : arr){                                            //store the freq of element in map in key-value pair
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        
        int[] countFreq = new int[n+1];      // here using counting sort to store freq of elem and the index represent the of that no. of element present at that index the no.of times or freq 
        for(int count:mp.values()){
            countFreq[count]++;
        }

        int leastUniElement=mp.size();
        for(int i=1; i<=n; i++){
            int numToremove = Math.min(k/i,countFreq[i]);
            k -=(i*numToremove);
            leastUniElement -= numToremove;
            if(k<i){
                return leastUniElement;
            }
        }
        return 0;
    }
}

/*
Output:
TC- O(n)

Enter array size: 7
Enter the element: 4 3 1 1 3 3 2
Enter value of k: 3
Least number of unique ELement after remove k: 2

Enter array size: 3
Enter the element: 5 5 4
Enter value of k: 1
Least number of unique ELement after remove k: 1

Enter array size: 6
Enter the element: 3 2 1 1 4 1
Enter value of k: 3
Least number of unique ELement after remove k: 1

*/

