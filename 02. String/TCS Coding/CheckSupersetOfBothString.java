//package TCS Coding;
//my own approach
import java.util.*;
public class CheckSupersetOfBothString {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter String P: ");
      String p = sc.next();
      System.out.print("Enter String Q: ");
      String q = sc.next();
      System.out.print("Enter String R: ");
      String r = sc.next();
      isOrderPreserved(p,q,r);
  }
  public static void isOrderPreserved(String p, String q, String r){
    
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    Set<Character> st1 = new HashSet<>();
    Set<Character> st2 = new HashSet<>();
    
    char[] ch1 = p.toCharArray();
    char[] ch2 = q.toCharArray();
    for(char c: ch1){
      st1.add(c);
    }
    for(char c: ch2){
      st2.add(c);
    }
    
    for(int i=0; i<r.length(); i++){
      char ch =r.charAt(i);
      if(st1.contains(ch)){
        sb1.append(ch);
      }
      if(st2.contains(ch)){
        sb2.append(ch);
      }
    }
    String str1 = new String(sb1);
    String str2 = new String(sb2);
    if(str1.equals(p) && str2.equals(q)){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}


/*
Output:
ex:1 
Enter String P: NET
Enter String P: CASH
Enter String P: NCAESTH
true

ex:2
Enter String P: BABC
Enter String P: DEFEE
Enter String P: BAEBDCFEE
false

*/
----------------------------------------******************************------------------------------------
//approach 2
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter String P:");
        String p = sc.next();
        System.out.println("Enter String Q:");
        String q = sc.next();
        System.out.println("Enter String R:");
        String r = sc.next();
        boolean result = isOrderPreserved(p, q, r);
        System.out.println(result);
    }

    public static boolean isOrderPreserved(String p, String q, String r) {
        int pointerP = 0, pointerQ = 0;
        for (char c : r.toCharArray()) {
            if (pointerP < p.length() && c == p.charAt(pointerP)) {
                pointerP++;
            } else if (pointerQ < q.length() && c == q.charAt(pointerQ)) {
                pointerQ++;
            }
        }
        return pointerP == p.length() && pointerQ == q.length();
  }
}

/*
Output:
ex:1 
Enter String P: NET
Enter String P: CASH
Enter String P: NCAESTH
true

ex:2
Enter String P: BABC
Enter String P: DEFEE
Enter String P: BAEBDCFEE
false

*/
