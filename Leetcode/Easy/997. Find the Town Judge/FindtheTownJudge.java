//package Easy.997. Find the Town Judge;
import java.util.*;
public class FindtheTownJudge {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no. of person n: ");
        int n=sc.nextInt();
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the column: ");
        int col = sc.nextInt();
        int[][] trust = new int[row][col];
        System.out.println("Enter the element: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                trust[i][j] = sc.nextInt();
            }
        }
        int ans = findJudge(n,trust);
        System.out.print("Town judge is "+ans);
    }
    public static int findJudge(int n, int[][] trust){

        int r=trust.length;
        int[] trustedOnNobody = new int[n+1];
        int[] trustbyEveryone = new int[n+1];
        for(int i=0; i<r; i++){
            int x=trust[i][0];
            int y=trust[i][1];
            trustedOnNobody[x]++;
            trustbyEveryone[y]++;
        }
        for(int i=1; i<=n; i++){
            if(trustedOnNobody[i]==0 && trustbyEveryone[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}

/*
Explanation: 
we have to just find the person or element who don't trust any one and everyone trust 
him except itself 
so here relation define [a,b] that means a trust the b but b not trust on a so if we 
observe that if a element or a person in left side or in 0th column is not a town judge 
because it voilate the rule that a town judge not trust any one 
so we just store the frequence of each element if the elem having 0 freq in 0th column 
and n-1 freq in 1th column or right side n-1 coz everyone trust on him but not itself or
except itself that elem or person is town judge. 
Output:
    n=3
    trust: [[1,3],[2,3]]                0th col    1th col
                                            1        3
                                            2        3
n=2
trust=[[1,2]]
Enter the no. of person n: 2
Enter the row: 1
Enter the column: 2
Enter the element:
1 2
Town judge is 2

Enter the no. of person n: 3
Enter the row: 3
Enter the column: 2
Enter the element:
1 3     
2 3
3 1
Town judge is -1

Enter the no. of person n: 3
Enter the row: 2
Enter the column: 2
Enter the element:
1 3
2 3
Town judge is 3

*/

