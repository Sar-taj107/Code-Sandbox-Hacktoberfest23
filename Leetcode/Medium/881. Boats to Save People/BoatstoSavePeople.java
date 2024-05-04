//package Medium.881. Boats to Save People;
import java.util.*;
public class BoatstoSavePeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] people = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          people[i] = sc.nextInt();
        }
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();
        int ans = numRescueBoats(people, limit);
        System.out.println("Minimum boat req: "+ans);
    }
     public static int numRescueBoats(int[] people, int limit){
       
       int n= people.length;
       Arrays.sort(people);
       int minBoat =0;
       int start =0;
       int end =n-1;
       int weight =0;
       
       while(start <= end){
         weight = people[start] + people[end];
         if(weight <= limit){
           start++;
           end--;
         }else{
           end--;
         }
         minBoat++;
       }
       return minBoat;
    }
}

/*
Output:

Enter the array size: 4
Enter the element: 3 2 2 1
Enter the limit: 3
Minimum boat req: 3

Enter the array size: 4
Enter the element: 3 5 3 4
Enter the limit: 5
Minimum boat req: 4

*/