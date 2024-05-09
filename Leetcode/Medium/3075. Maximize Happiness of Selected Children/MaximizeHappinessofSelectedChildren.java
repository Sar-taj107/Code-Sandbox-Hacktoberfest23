//package Medium.3075. Maximize Happiness of Selected Children;
import java.util.*;
public class MaximizeHappinessofSelectedChildren {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] happiness = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
          happiness[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        long ans = maximumHappinessSum(happiness, k);
        System.out.print("Maximum happiness: "+ans);
    }
    public static long maximumHappinessSum(int[] happiness, int k){
      
      int n=happiness.length;
      long maxHap = 0;
      Arrays.sort(happiness);
      int j=0;
      for(int i=n-1; i>=0; i--){
        int x=happiness[i] - j;
        if(k>0 && x>0){
          maxHap += x;
        }
        j++;
        k--;
      }
      return maxHap;
    }
}

/*
Output:

Enter the array size: 3
Enter the element: 1 2 3
Enter the value of k: 2
Maximum happiness: 4

Enter the array size: 4
Enter the element: 1 1 1 1
Enter the value of k: 2
Maximum happiness: 1

*/