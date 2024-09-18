//package Easy.884. Uncommon Words from Two Sentences;
import java.util.*;
public class UncommonWordsfromTwoSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the string s2: ");
        String s2 = sc.nextLine();
        
        String[] ans = uncommonFromSentences(s1, s2);
        for(int i=0; i<ans.length; i++){
          System.out.print(ans[i]+" ");
        }
        
    }
    public static String[] uncommonFromSentences(String s1, String s2){
      
      Map<String, Integer> mp1 = new HashMap<>();
      Map<String, Integer> mp2 = new HashMap<>();
      
      List<String> li = new ArrayList<>();
      String[] strs1 = s1.split(" ");
      String[] strs2 = s2.split(" ");
      
      for(String st1 : strs1){
        mp1.put(st1, mp1.getOrDefault(st1, 0)+1);
      }
      for(String st2 : strs2){
        mp2.put(st2, mp2.getOrDefault(st2, 0)+1);
      }
      
      for(String x1 : mp1.keySet()){
        if(mp1.get(x1) == 1 && !mp2.containsKey(x1)){
          li.add(x1);
        }
      }
      
      for(String x2 : mp2.keySet()){
        if(mp2.get(x2) == 1 && !mp1.containsKey(x2)){
          li.add(x2);
        }
      }
      String[] res = new String[li.size()];
      for(int i=0; i<li.size(); i++){
        res[i] = li.get(i);
      }
      return res;
    }
  }

/*
  Input: s1 = "this apple is sweet", s2 = "this apple is sour"
  
  Output: ["sweet","sour"]
*/
