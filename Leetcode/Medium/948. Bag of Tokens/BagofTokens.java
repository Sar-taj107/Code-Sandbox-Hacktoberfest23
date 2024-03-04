//package Medium.948. Bag of Tokens;
import java.util.*;
public class BagofTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter token array size: ");
        int t = sc.nextInt();
        int[] tokens = new int[t];
        System.out.print("Enter token value: ");
        for(int i=0; i<t; i++){
            tokens[i]=sc.nextInt();
        }
        System.out.print("Enter power: ");
        int p=sc.nextInt();
        int ans = bagOfTokensScore(tokens, p);
        System.err.print("Maximum score: "+ans);
    }
    public static int bagOfTokensScore(int[] tokens, int power){

        Arrays.sort(tokens);
        int maxScore = 0;
        int currScore = 0;
        int i=0;
        int j=tokens.length-1;
        while (i<=j) {
            if(power >= tokens[i]){
                power -= tokens[i];
                currScore++;
                maxScore = Math.max(maxScore, currScore);
                i++;
            }else if(maxScore >= 1){
                power += tokens[j];
                currScore--;
                j--;  
            }else{
                break;
            }
        }
        return maxScore;
    }
}

/*
Output:

Enter token array size: 2
Enter token value: 200 100
Enter power: 150
Maximum score: 1

Enter token array size: 4
Enter token value: 100 200 300 400
Enter power: 200
Maximum score: 2

*/

