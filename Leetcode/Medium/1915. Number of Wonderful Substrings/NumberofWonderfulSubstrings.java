import java.util.*;
public class NumberofWonderfulSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String word: ");
        String word = sc.next();
        
        long ans = wonderfulSubstrings("Number of wonder String: "+word);
        System.out.println("wonderful string: "+ans);
        
    }
    public static long wonderfulSubstrings(String word){
      
      Map<Long , Long> mp =new HashMap<>();
      mp.put(0L, 1L);
      
      long cumXor=0; // cumulative cumXor
      long res=0;
      
      for(char ch : word.toCharArray()){
        int shift = ch - 'a';
        cumXor ^= (1<<shift);
        res += mp.getOrDefault(cumXor, 0L);
        
        
        for(char ch1='a'; ch1 <='j'; ch1++){
        
          shift =ch1 - 'a';
          long checkOddXor = cumXor ^ (1<<shift);
          res +=mp.getOrDefault(checkOddXor,0L);
        }
        mp.put(cumXor, mp.getOrDefault(cumXor, 0L)+1L);
      }
      return res;
    }
}

/*
Output:
Enter the String word: aba
wonderful string: 4

Enter the String word: aabb
wonderful string: 9

*/