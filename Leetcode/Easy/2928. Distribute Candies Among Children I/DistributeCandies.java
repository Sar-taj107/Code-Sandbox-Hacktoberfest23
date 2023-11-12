
import java.util.*;
public class DistributeCandies {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of candies: ");
		int n=sc.nextInt();
		System.out.print("Enter the limit: ");
		int limit=sc.nextInt();
		int ans=distributeCandies(n,limit);
		System.out.println("Total number of ways to distribute candies: "+ans);
		
		
	}
	static int distributeCandies(int n, int limit){
	    
	    int totalNumWays=0;
	    for(int i=0; i<=limit; i++){
	        for(int j=0; j<=limit; j++){
	            int k = n-i-j;
	            if(k<= limit && k>=0){
	                totalNumWays++;
	            }
	        }
	    }
	    return totalNumWays;
    }
}

/*
Output:

Enter the number of candies: 5
Enter the limit: 2
Total number of ways to distribute candies: 3

Enter the number of candies:5
Enter the limit:2
Total number of ways to distribute candies:3

*/