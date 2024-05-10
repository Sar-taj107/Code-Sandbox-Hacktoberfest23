import java.util.*;
public class KthSmallestPrimeFraction {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the array size: ");
      int n=sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the element: ");
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("Enter the value of k: ");
      int k=sc.nextInt();
      int[] ans = kthSmallestPrimeFraction(arr,  k);
      //System.out.print("kth minimum Fraction: ");
      System.out.println("Ans: "+ans[0]+" "+ans[1]);
      
  }
  public static int[] kthSmallestPrimeFraction(int[] arr, int k){
    
    int n=arr.length;
    PriorityQueue<double[]> pq = new PriorityQueue<>(Comparator.comparingDouble(a->a[0]));
    for(int i=0; i<n; i++){
      pq.offer(new double[]{1.0*arr[i] / arr[n-1], (double)i, (double)(n-1)});
    }
    int smallest = 1;
    while(smallest < k){
      double[] vec = pq.poll();
      int i = (int) vec[1];
      int j = (int) vec[2] - 1;
      pq.offer(new double[]{1.0* arr[i]/arr[j], (double)i, (double)j});
      smallest++;
    }
    double[] vec = pq.peek();
    int i=(int) vec[1];
    int j=(int) vec[2];
    return new int[]{arr[i],arr[j]};
  }
}

/*
Output:
Enter the array size: 4
Enter the element: 1 2 3 5
Enter the value of k: 3
Ans: 2 5

Enter the array size: 2
Enter the element: 1 7
Enter the value of k: 1
Ans: 1 7

*/