//package Medium.1642. Furthest Building You Can Reach;

import java.util.*;
public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] heights = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            heights[i]=sc.nextInt();
        }
        System.out.print("Enter the bricks: ");
        int bricks=sc.nextInt();
        System.out.print("Enter the ladders: ");
        int ladders=sc.nextInt();
        int ans = furthestBuilding(heights, bricks, ladders);
        System.out.print("Furthest Building we can reach: "+ans);

    }
    public static int furthestBuilding(int[] heights, int bricks, int ladders){
       int n=heights.length;
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int i=1; i<n; i++){
        int diff=heights[i] - heights[i-1];
        if(diff>0){
            pq.offer(diff);
            if(pq.size() > ladders){
                bricks -= pq.poll();
                if(bricks<0){
                    return i-1;
                }
            }
        }
       }
       return n-1;
    }
}

/*
Output:

Enter array size: 9
Enter the Element: 4 12 2 7 3 18 20 3 19
Enter the bricks: 10 
Enter the ladders: 2
Furthest Building we can reach: 7

Enter array size: 4
Enter the Element: 14 3 19 3
Enter the bricks: 17 
Enter the ladders: 0
Furthest Building we can reach: 3

Enter array size: 7
Enter the Element: 4 2 7 6 9 14 12
Enter the bricks: 5  
Enter the ladders: 1
Furthest Building we can reach: 4

*/