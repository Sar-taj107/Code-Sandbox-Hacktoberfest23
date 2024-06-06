import java.util.*;
public class HandofStraights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int n = sc.nextInt();
        int[] hand = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          hand[i] = sc.nextInt();
        }
        System.out.println("Enter the groupSize: ");
        int groupSize = sc.nextInt();s
        
        boolean ans = isNStraightHand(hand, groupSize);
        System.out.println(ans);
    }
    public static boolean check(int[] hand, int groupSize, int i){
          int n=hand.length;
          int x = hand[i];
          hand[i] = -1;
          int count=1;
          i++;
          while(count < groupSize && i<n){
              if(hand[i] == (x+1)){
                  count++;
                  x++;
                  hand[i] = -1;
              }
              i++;
          }
          if(count==groupSize){
              return true;
          }else{
              return false;
          }
      }
    public static boolean isNStraightHand(int[] hand, int groupSize){
      
      int n = hand.length;
      
      if(n % groupSize != 0) return false;
      
      for(int i=0; i<n; i++){
        if(hand[i] != -1){
          if(check(hand, groupSize, i) == false){
            return false;
          }
        }
      }
      return true;
    }
}
