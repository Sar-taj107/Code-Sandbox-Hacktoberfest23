//package Medium.1578. Minimum Time to Make Rope Colorful;
import java.util.*;
public class MinimumTimetoMakeRopeColorful {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the colors: ");
        String colors =sc.nextLine();
        System.out.println("Enter size of neededTime array:");
        int n=sc.nextInt();
        int[] neededTime = new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++){
            neededTime[i] = sc.nextInt();
        }
        int ans = miniTimeMakeRopeCol(colors, neededTime);
        System.out.println(ans);
    }
    
    public static int miniTimeMakeRopeCol(String colors, int[]neededTime){
        //int n=neededTime.length;
        int len=colors.length();
        int minTime =0;
        int prevMax =0;
        for(int i=0; i<len; i++){
            if(i>0 && colors.charAt(i) != colors.charAt(i-1)){
                prevMax =0;
            }
            int curr = neededTime[i];
            minTime += Math.min(prevMax,curr);
            prevMax = Math.max(prevMax,curr);
        }
        return minTime;
    }
}

/*
Output:

Enter the String colors: abaac
Enter size of neededTime array:5
Enter the element: 1 2 3 4 5
Require time: 3

Enter the String colors: abc
Enter size of neededTime array:3
Enter the element: 1 2 3 
Require time: 0

Enter the String colors: aabaa
Enter size of neededTime array:5
Enter the element: 1 2 3 4 1
Require time: 2

*/