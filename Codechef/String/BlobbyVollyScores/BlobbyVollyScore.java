package Codechef.String.BlobbyVollyScores;
import java.util.*;
public class BlobbyVollyScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of test case: ");
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            System.out.print("Enter string length: ");
            int n = sc.nextInt();
            System.out.print("Enter the string: ");
            String s = sc.next();
            // your code goes here
            int[] ans = volBallScore(s);
            System.out.println("Scores of alice & bob: "+ans[0]+" "+ans[1]);
            
        }
    }
    public static int[] volBallScore(String s){
        
        int l=s.length();
        int aliceScore = 0;
        int bobScore = 0;
        if(s.charAt(0) == 'A'){
            aliceScore=1;
        }
        for(int i=0; i<l-1; i++){
            int j=i+2;
            String str = s.substring(i,j);
            if(str.equals("AA")){
                aliceScore++;
            }else if(str.equals("BB")){
                bobScore++;
            }else{
                continue;
            }
        }
        return new int[]{aliceScore,bobScore};
    }    
}

/*
Output:
ex:1
Enter no. of test case: 4
Enter string length: 3
Enter the string: AAA
Scores of alice & bob: 3 0
Enter string length: 4  
Enter the string: BBBB
Scores of alice & bob: 0 3
Enter string length: 5
Enter the string: ABABB
Scores of alice & bob: 1 1
Enter string length: 5
Enter the string: BABAB
Scores of alice & bob: 0 0


ex:2
Enter no. of test case: 2
Enter string length: 6
Enter the string: AABBBA 
Scores of alice & bob: 2 2
Enter string length: 7     
Enter the string: BBBAAAA
Scores of alice & bob: 3 2

*/

