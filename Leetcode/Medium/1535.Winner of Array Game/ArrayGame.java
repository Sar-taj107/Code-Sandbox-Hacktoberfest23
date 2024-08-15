/*
 
Find the Winner of an Array Game
Medium 1535

Given an integer array arr of distinct integers and an integer k.

A game will be played between the first two elements of the array (i.e. arr[0] and arr[1]). 
In each round of the game, we compare arr[0] with arr[1], the larger integer wins and remains
at position 0, and the smaller integer moves to the end of the array. The game ends when an
integer wins k consecutive rounds.

Return the integer which will win the game.

It is guaranteed that there will be a winner of the game.

 

Example 1:

Input: arr = [2,1,3,5,4,6,7], k = 2
Output: 5
Explanation: Let's see the rounds of the game:
Round |       arr       | winner | win_count
  1   | [2,1,3,5,4,6,7] | 2      | 1
  2   | [2,3,5,4,6,7,1] | 3      | 1
  3   | [3,5,4,6,7,1,2] | 5      | 1
  4   | [5,4,6,7,1,2,3] | 5      | 2
So we can see that 4 rounds will be played and 5 is the winner because it wins 2 consecutive games.
Example 2:

Input: arr = [3,2,1], k = 10
Output: 3
Explanation: 3 will win the first 10 rounds consecutively.
 

Constraints:

2 <= arr.length <= 10^5
1 <= arr[i] <= 10^6
arr contains distinct integers.
1 <= k <= 10^9

*/
import java.util.*;
public class ArrayGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value of k:");
        int k=sc.nextInt();
        int ans=findWindElem(arr, k);
        System.out.println("Ans: "+ans);

    }
    static int findWindElem(int[] arr, int k){
        int n=arr.length;
        int winCount=0;
        int res=arr[0];
        for(int i=1; i<n; i++){

            if(arr[i] > res){
                res=arr[i];
                winCount=1;
            }else{
                winCount++;
            }

            if(winCount == k){
                break;
            }
        }
        return res;
    }
}

/*

OUTPUT
ex:1
Enter array size:
7
Enter the element:
2 1 3 5 4 6 7
Enter value of k:
2
Ans: 5

ex:2
Enter array size:
3
Enter the element:
3 2 1
Enter value of k:
10
Ans: 3

*/
