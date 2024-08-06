//package Medium.3016. Minimum Number of Pushes to Type Word II;
import java.util.*;
public class MinimumNumberofPushestoTypeWordII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = sc.next();
        
        int ans = minimumPushes(word);
        System.out.println(ans);
    }
    public static int minimumPushes(String word){
      
      int[] mp = new int[26];
      for(char ch : word.toCharArray()){  //store freq of each Character
        mp[ch - 'a']++;
      }
      
      Integer[] freq = new Integer[mp.length]; //convert premitive to object type for custom sort
      for(int i=0; i<mp.length; i++){
        freq[i] = mp[i];
      }
      
      Arrays.sort(freq, Comparator.reverseOrder()); // sort in desc order
      
      int res = 0;
      for(int i=0; i<26; i++){ 
        int press = (i / 8) + 1; //number of press required
        res += press * freq[i];
      }
      return res;  // total press required for enter all Character of the word/
    }
}
  
/*
Input: word = "abcde"
Output: 5
*/

