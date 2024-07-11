//package Easy.1598. Crawler Log Folder;
import java.util.*;
public class CrawlerLogFolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        String[] logs = new String[n];
        System.out.println("Enter the log as String: ");
        for(int i=0; i<n; i++){
          logs[i]= sc.next();
        }
        int ans = minOperations(logs);
        System.out.println(ans);
        
    }
    public static int minOperations(String[] logs){
      
      Stack<String> st = new Stack<>();
      for(String str : logs){
        if(str.equals("../")){
          if(!st.empty()){
            st.pop();
          }
        }else if(!str.equals("./")){
          st.push(str);
        }
      }
      return st.size();
    }
}

/*
Output:

Input: logs = ["d1/","d2/","../","d21/","./"]
Output: 2

Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
Output: 3

Input: logs = ["d1/","../","../","../"]
Output: 0

*/
