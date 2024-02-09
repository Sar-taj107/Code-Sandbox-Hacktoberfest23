//package Easy.812. Largest Triangle Area;
import java.util.*;
public class LargestTriangleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n=sc.nextInt();
        int[][] points = new int[n][2];
        System.out.println("Enter the coordinate of the points: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                points[i][j] = sc.nextInt();
            }
        }
        double ans = largestTriangleArea(points);
        System.out.println("Largest triangle area: "+ans);

    }
    public static double largestTriangleArea(int[][] points){
        int n=points.length;
        double curMax=0;
        double maxArea=0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){

                int x1 =points[i][0];
                int x2 =points[j][0];
                int x3 =points[k][0];

                int y1 =points[i][1];
                int y2 =points[j][1];
                int y3 =points[k][1];
                curMax = Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))*0.5;
                maxArea = Math.max(maxArea, curMax);
                }
            }
        }
        return maxArea;
    }
}

/*
Output:

Enter the number of points: 3
Enter the coordinate of the points:
1 0 0 0 0 1
Largest triangle area: 0.5

Enter the number of points: 5
Enter the coordinate of the points:
0 0 0 1 1 0 0 2 2 0
Largest triangle area: 2.0

*/