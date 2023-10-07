import java.util.Scanner;
/*
input arr = { -2, -3, 4, -1, -2, 1, 5, -3 }
output = 7        //taking from index 2 to 6 
                  //so 4+(-1)+(-2)+1+5=7
arr = {-1, 2, 3, -4, 2, 1}
output = 4                  //taking substring from index 1 to n-1
 */                         //so 2+3+(-4)+2+1 = 4


 //tc- O(n)
 //using Kadane's algorithm
public class LargestSumContiguousSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter the element:");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x=maxSubarray(arr);
        System.out.println("Largest Contiguous sum is : "+x);
        
        
    }
    public static int maxSubarray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum +=arr[i];
            if(maxSum < currSum){
                maxSum = currSum;
            }else if(currSum <0){
                currSum=0;
            }
        }
        return maxSum;
    }
}

/*

OUTPUT:

Enter size of array:5
Enter the element:4 0 -6 2 1
Largest Contiguous sum is : 4


 */