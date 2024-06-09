//package Easy.3178. Find the Child Who Has the Ball After K Seconds;
import java.util.*;
public class FindtheChildWhoHastheBallAfterKSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        
        int ans = numberOfChild(n, k);
        System.out.println("ans: "+ans);
    }
    public static int numberOfChild(int n, int k){
      
      int pos = 0;
      int dir =1;
      for(int i=0; i<k; i++){
        pos += dir;
        if(pos==n-1 || pos==0){
          dir = -dir;
        }
      }
      return pos;
    }
}

  /*
  Output:
  
  Enter the value of n: 3
  Enter the value of k: 5
  ans: 1
  
  Enter the value of n: 5
  Enter the value of k: 6
  ans: 2
  
  
  */

