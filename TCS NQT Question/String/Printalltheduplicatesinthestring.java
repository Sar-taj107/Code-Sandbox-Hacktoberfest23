//package TCS NQT Question.String;
import java.util.*;
public class Printalltheduplicatesinthestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        
        System.out.println("Duplicate character in String: ");
        countduplCharInstring(s);
    }
    public static void countduplCharInstring(String s){
      
      int n=s.length();
      Map<Character, Integer> mp = new HashMap<>();
      for(int i=0; i<n; i++){
        char ch = s.charAt(i);
        mp.put(ch, mp.getOrDefault(ch, 0)+1);
      }
      
      for(Map.Entry<Character,Integer> entry : mp.entrySet()){
        if(entry.getValue() > 1){
          System.out.println(entry.getKey()+" - "+entry.getValue());
        }
      }
    }
}

/*
Output:
Enter the String: alhamdulillah
Duplicate character in String: 
a - 3
h - 2
l - 4

Enter the String: HappyBirthday
Duplicate character in String: 
p - 2
a - 2
h - 2
y - 2

 */