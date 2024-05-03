//package Medium.165. Compare Version Numbers;
import java.util.*;
public class CompareVersionNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the version 1: ");
        String v1 = sc.next();
        System.out.println("Enter the version 2: ");
        String v2 = sc.next();
        
        int ans = compareVersion(v1, v2);
        System.out.println("Ans: "+ans);
    }
    public static int compareVersion(String v1, String v2){
      
      String[] ver1 = v1.split("\\.");
      String[] ver2 = v2.split("\\.");
      
      int len = Math.max(ver1.length,ver2.length);
      for(int i=0; i<len; i++){
        int num1 = i< ver1.length ? Integer.parseInt(ver1[i]):0;
        int num2 = i< ver2.length ? Integer.parseInt(ver2[i]):0;
        
        if(num1 < num2){
          return -1;
        }else if( num1 > num2){
          return 1;
        }
       }
       return 0;
    }
}
/*
Output:

Enter the version 1: 1.01
Enter the version 2: 1.001
Ans: 0

Enter the version 1: 1.0
Enter the version 2: 1.0.0
Ans: 0

Enter the version 1: 0.1
Enter the version 2: 1.1
Ans: -1

*/

