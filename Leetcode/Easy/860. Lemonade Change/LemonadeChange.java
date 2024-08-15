
import java.util.*;
public class LemonadeChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] bills = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          bills[i] = sc.nextInt();
        }
        
        boolean ans = lemonadeChange(bills);
        System.out.println(ans);
    }
    public static boolean lemonadeChange(int[] bills){
        
        int cnt5=0;
        int cnt10=0;
        
        for(int bill : bills){
          if(bill == 5){
            cnt5++;
          }else if( bill == 10){
            if(cnt5 ==0){
              return false;
            }
            cnt5--;
            cnt10++;
          }else{      //20 cost lamonde
            if(cnt5 > 0 && cnt10 > 0){
              cnt10--;
              cnt5--;
            }else if(cnt5 >= 3){
              cnt5 -= 3;
            }else{
              return false;
            }
          }
        }
        return true;
    }
}
  
/*
  Input: bills = [5,5,5,10,20]
  Output: true
  
*/

