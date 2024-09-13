import java.util.*;
public class FindCountOfOneZero {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the binary string: ");
      String s = sc.next();
      
      countOneZero(s);
      
  }
  public static void countOneZero(String s){
    
    int n=s.length();
    int one=0, zero=0;
    for(int i=0; i<n; i++){
      int x = Character.getNumericValue(s.charAt(i)) ^ 1;
      if(x == 0){
        one++;
      }else{
        zero++;
      }
    }
    System.out.println("Number of one: "+one);
    System.out.println("Number of zero: "+zero);
    }
}

/*
Input:
Enter the binary string: 01101
Output:
Number of one: 3
Number of zero: 2

*/
