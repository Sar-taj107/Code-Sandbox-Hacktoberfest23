import java.util.*;
/*
 Leetcode problem : 215

Kth Largest Element in an Array
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
 */
public class KthLargestElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter element in array:");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter value of k:");
        int k=sc.nextInt();
        
        int ans = KthLargestEle(nums, k);
        System.out.println("Kth Largest element in array:"+ans);

    }
    static int KthLargestEle(int nums[], int k){

        int n=nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=n-1 ; i>=0; i--){
            pq.add(nums[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}

/*
sorting takes TC- O(nlogn) to optimize the time complex..

 Using minheap concept tc reduce to
 TC- O(nlogk)

OUTPUT:

Enter the array size:
6
Enter element in array:
3 2 1 5 6 4
Enter value of k:
2
Kth Largest element in array:5

 */