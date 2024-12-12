//package Easy.2558. Take Gifts From the Richest Pile;
import java.util.*;
public class TakeGiftsFromtheRichestPile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] gifts = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          gifts[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        
        long ans = pickGifts(gifts, k);
        System.out.println("Remaining gifts after k operation: "+ans);
    }
    public static long pickGifts(int[] gifts, int k){
      
      long remGifts = 0;
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      
      for(int num : gifts){
        pq.add(num);
      }
      
      while(k > 0 && !pq.isEmpty()){
        int maxEle = pq.poll();
        int val = (int)Math.floor(Math.sqrt(maxEle));
        pq.add(val);
        k--;
      }
      for(int ele : pq){
        remGifts += ele;
      }
      return remGifts;
    }
}

/*
Output:

Enter the array size: 5
Enter the element: 25 64 9 4 100
Enter the value of k: 4
Remaining gifts after k operation: 29

*/