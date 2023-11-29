/*
write a program to find the sum of product of all the element of two array aar1 and arr2 of same size 'n' 
such that the first element of arr1 multipy with the last element of arr2 then second element of arr1 is multipy
with second last element of arr2 and so on.. return the total sum of prodct if array is empty then return -1;
 
*/
import java.util.*;
public class SumOfProductOfElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		System.out.println("Enter the arr1 element:");
		for(int i=0; i<n; i++){
		    arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the arr2 element:");
		for(int i=0; i<n; i++){
		    arr2[i]=sc.nextInt();
		}
		int ans=sumOfPro(arr1,arr2,n);
		System.out.println("Sum of product of all element: "+ans);
		
	}
	public static int sumOfPro(int[]arr1, int[] arr2, int n){
	    
	    if(n == 0){
	        return -1;
	    }
	    int prodSum=0;
//1. way
	    for(int i=0; i<arr1.length; i++){
	           prodSum += arr1[i]*arr2[n-i-1];
	    }
//2. way
	//    int i=0, j=arr2.length-1;
	//    while(i<=arr1.length && j>=0){
	//        prodSum += arr1[i]*arr2[j];
	//        i++;
	//        j--;
	//    }
	    return prodSum;
    }
}



/*
Output:

Enter the array size:3
Enter the arr1 element:
2 3 1
Enter the arr2 element:
4 6 3
Sum of product of all element: 28

Enter the array size:5
Enter the arr1 element:
2 3 1 6 0
Enter the arr2 element:
3 2 -4 5 7
Sum of product of all element: 37

*/