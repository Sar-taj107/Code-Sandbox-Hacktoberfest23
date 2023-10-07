import java.util.Arrays;
import java.util.Scanner;

public class NthLargestSmallest {
    public static void main(String[] args) {
        
      System.out.println("Enter the size of array:");
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[] =new int[n];
      
      System.out.println("Enter the element:");
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("Enter the value of element:");
      int x=sc.nextInt(); 
      Arrays.sort(arr);
      
      int nthSmallest = arr[x-1];
      int nthLargest = arr[n - x];
      
      System.out.println("nth Smallest and nth Largest element :"+nthSmallest+" "+nthLargest);
    }
}
