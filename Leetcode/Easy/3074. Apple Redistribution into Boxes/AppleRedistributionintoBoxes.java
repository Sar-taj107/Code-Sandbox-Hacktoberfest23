//package Easy.3074. Apple Redistribution into Boxes;
import java.util.*;
public class AppleRedistributionintoBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter apple array Size: ");
        int n = sc.nextInt();
        int[] apple = new int[n];
        System.out.print("Enter the Element of apple: ");
        for(int i=0; i<n; i++){
            apple[i]=sc.nextInt();
        }
        System.out.print("Enter capacity Array size: ");
        int c = sc.nextInt();
        int[] capacity = new int[c];
        System.out.print("Enter the box capacity: ");
        for(int i=0; i<c; i++){
            capacity[i]=sc.nextInt();
        }

        int ans = minimumBoxes(apple,capacity);
        System.out.println("Minimum number of boxes select to redistribute apple: "+ans);
    }
    public static int minimumBoxes(int[] apple, int[] capacity){

        int n=apple.length;
        int m=capacity.length;
        int totalApple = 0;
        for(int num : apple){  //calculate total apple present in apple array
            totalApple +=num;
        }

        Arrays.sort(capacity);
        int requiredCap = 0;
        int minSelectedBox=0;
        for(int i=m-1; i>=0; i--){
            requiredCap += capacity[i];
            minSelectedBox++;
            if(requiredCap >= totalApple){
                return minSelectedBox;
            }
        }
        return minSelectedBox;
    }
}

/*
Output:

Enter apple array Size: 3
Enter the Element of apple: 1 3 2
Enter capacity Array size: 5
Enter the box capacity: 4 3 1 5 2
Minimum number of boxes select to redistribute apple: 2

Enter apple array Size: 3
Enter the Element of apple: 5 5 5
Enter capacity Array size: 4       
Enter the box capacity: 2 4 2 7
Minimum number of boxes select to redistribute apple: 4

*/

