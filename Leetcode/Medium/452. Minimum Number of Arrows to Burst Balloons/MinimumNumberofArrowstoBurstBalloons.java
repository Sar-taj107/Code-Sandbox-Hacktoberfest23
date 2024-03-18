//package Medium.452. Minimum Number of Arrows to Burst Balloons;
import java.util.*;
public class MinimumNumberofArrowstoBurstBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row Size: ");
        int n=sc.nextInt();
        int[][] points = new int[n][2];
        System.out.println("Enter the cordinate: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                points[i][j] = sc.nextInt();
            }
        }
        int ans = findMinArrowShots(points);
        System.out.print("Minimum number of arrow shot to burst all ballons: "+ans);
    }
    public static int findMinArrowShots(int[][] points){

        int n=points.length;
        int count = 1;
        Arrays.sort(points, Comparator.comparingInt(a->a[0]));
        int[] prev = points[0]; 
        for(int i=1; i<n; i++){
            int curStartPoint = points[i][0];
            int curEndPoint = points[i][1];
            int prevStartPoint = prev[0];
            int prevEndPoint = prev[1];
            if(curStartPoint > prevEndPoint){
                count++;
                prev = points[i];
            }else{
                prev[0] = Math.max(prevStartPoint, curStartPoint);
                prev[1] = Math.min(prevEndPoint, curEndPoint);
            }
        }
        return count++;
    }
}

/*
Output:

Enter the row Size: 4
Enter the cordinate:
1 2
3 4 
5 6 
7 8
Minimum number of arrow to burst all ballons: 4

Enter the row Size: 4
Enter the cordinate:
1 2
2 3
3 4 
4 5
Minimum number of arrow shot to burst all ballons: 2

*/
