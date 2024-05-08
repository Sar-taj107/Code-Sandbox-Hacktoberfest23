//package Easy.506. Relative Ranks;
import java.util.*;
public class RelativeRanks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
          System.out.println("Enter the array size");
          int n=sc.nextInt();
          int[] score  = new int[n];
          
          System.out.println("Enter the score: ");
          for(int i=0; i<n; i++){
            score[i] = sc.nextInt();
          }
          
          String[] ans = findRelativeRanks(score);
          for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
          }
          
      }
      public static String[] findRelativeRanks(int[] score){
        
        int n=score.length;
        int maxEle = Integer.MIN_VALUE;
        //find max ELem
        for(int i=0;i<n; i++){
          if(maxEle < score[i]){
            maxEle = score[i];
          }
        }
        int[] mp = new int[maxEle+1];
        Arrays.fill(mp, -1);
        for(int i=0; i<n; i++){
          mp[score[i]] = i;
        }

        String[] res = new String[n];
        int rank =1;
        for(int i=mp.length-1; i>=0; i--){
          if(mp[i] != -1){
            int athlete = mp[i];
            if(rank==1){
              res[athlete]= "Gold Medal";
            }else if(rank==2){
              res[athlete] = "Silver Medal";
            }else if(rank ==3){
              res[athlete] = "Bronze Medal";
            }else{
              res[athlete] = Integer.toString(rank);
            }
            rank++;
          }
        }
        return res;
    }
}

/*
Output:
Enter the array size: 5
Enter the score: 5 4 3 2 1
Rank of athlete: Gold Medal Silver Medal Bronze Medal 4 5 

Enter the array size: 5
Enter the score: 10 3 8 9 4
Rank of athlete: Gold Medal 5 Bronze Medal Silver Medal 4 

*/