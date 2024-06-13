//package Easy.2037. Minimum Number of Moves to Seat Everyone;
import java.util.*;
public class MinimumNumberofMovestoSeatEveryone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of seats array: ");
        int n=sc.nextInt();
        int[] seats = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          seats[i] = sc.nextInt();
        }
        System.out.println("Enter the size of students array: ");
        int m=sc.nextInt();
        int[] students = new int[m];
        System.out.println("Enter the element: ");
        for(int i=0; i<m; i++){
          students[i] = sc.nextInt();
        }
        int ans = minMovesToSeat(seats,students);
        System.out.println("Minimum moves: "+ans);
    }
    public static int minMovesToSeat(int[] seats, int[] students){
      
      int n=seats.length;
      
      Arrays.sort(seats);
      Arrays.sort(students);
      int maxMoves = 0;
      for(int i=0; i<n; i++){
        maxMoves += Math.abs(seats[i] - students[i]);
      }
      return maxMoves;
    }
}
  
  /*
  Input: seats = [3,1,5], students = [2,7,4]
  Output: 4
  */
