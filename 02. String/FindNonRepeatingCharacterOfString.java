import java.util.*;
public class FindNonRepeatingCharacterOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter the String: ");
      String s = sc.nextLine();
      nonReapeatingCharacterInString(s);
      
  }
  public static void nonReapeatingCharacterInString(String s){
    Map<Character ,Integer> mp = new HashMap<>();
    int n=s.length();
    for(int i=0; i<n; i++){
      char ch = s.charAt(i);
      mp.put(ch, mp.getOrDefault(ch, 0)+1);
    }
    System.out.print("Non repeatig Character: ");
    for(Map.Entry<Character,Integer> entry: mp.entrySet()){
      if(entry.getValue()<2){
        System.out.print(entry.getKey()+" ");
      }
    }
  }
}

/*
Output:

Enter the String: google
Non repeatig Character: e l

Enter the String: technology
Non repeatig Character: c t e g h y l n

Enter the String: moon
Non repeatig Character: m n

*/
