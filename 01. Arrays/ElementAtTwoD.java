import java.util.*;
public class ElementAtTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int r=sc.nextInt();
        System.out.println("Enter the cols:");
        int c=sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter the element:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter the element to be search:");
        int x=sc.nextInt();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j]==x){
                    System.out.println("Element found at index:"+"("+i+","+j+")");
                }
            }
        }
    }
}

/*
 
Enter the rows:
3
Enter the cols:
3
Enter the element:
2 5 1 
0 4 3
8 6 9
Enter the element to be search:
4
Element found at index:(1,1)

 */