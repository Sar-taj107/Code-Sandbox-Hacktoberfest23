//write a program to find the index of target element in an array 
import java.util.Scanner;
public class ElementAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int A[] = new int[n];

        System.out.print("Enter the element:");
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        
        System.out.println("Enter the element to be Search:");
        int x=sc.nextInt();

        boolean found = false;
        for(int j=0; j<n; j++){
            if(A[j]==x){
                System.out.println("Element found at index:"+j);
                found=true;
            }

        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}

/*
 
Enter the size of array:
5
Enter the element:
3 4 6 9 0
Enter the element to be Search:
9 
Element found at index:3

Enter the size of array:
3
Enter the element:
5 -6 1
Enter the element to be Search:
-6
Element found at index:1

 */
