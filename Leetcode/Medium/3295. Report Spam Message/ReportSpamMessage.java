//package Medium.3295. Report Spam Message;
import java.util.*;
public class ReportSpamMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message array size: ");
        int n = sc.nextInt();
        String[] message = new String[n];
        String[] bannedWords = new String[n];
        
        System.out.println("Enter word in message");
        for(int i=0; i<n; i++){
          message[i] = sc.next();
        }
        
        System.out.println("Enter word in bannedWords: ");
        for(int i=0; i<n; i++){
          bannedWords[i] = sc.next();
        }
        
        boolean ans = reportSpam(message, bannedWords);
        System.out.println(ans);
        
    }
    public static boolean reportSpam(String[] message, String[] bannedWords){
      
      Set<String> st= new HashSet<>();
      for(String str : message){
        st.add(str);
      }
      
      int count = 0;
      for(String str : bannedWords){
        if(st.contains(str)){
          count++;
        }else{
          continue;
        }
      }
      return count >= 2 ? true : false;
    }
  }
  
/*
  Input: message = ["hello","world","leetcode"], bannedWords = ["world","hello"]
  Output: true
*/

