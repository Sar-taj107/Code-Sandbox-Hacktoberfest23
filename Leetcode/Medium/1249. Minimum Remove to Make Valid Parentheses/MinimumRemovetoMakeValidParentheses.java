//package Medium.1249. Minimum Remove to Make Valid Parentheses;
import java.util.*;
public class MinimumRemovetoMakeValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String ans = minRemoveToMakeValid(s);
        System.out.print("ans: "+ans);
    }
    public static String minRemoveToMakeValid(String s){

        int n=s.length();
        Stack<Integer> st = new Stack<>();
        Set<Integer> remIdx = new HashSet<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else if(!st.isEmpty() && ch == ')'){
                st.pop();
            }else if(st.isEmpty() && ch==')'){
                remIdx.add(i);
            }
        }
        for(int x: st){
            remIdx.add(x);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(!remIdx.contains(i)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

/*
Output:

Enter the String: lee(t(c)o)de)
ans: lee(t(c)o)de

Enter the String: a)b(c)d
ans: ab(c)d

Enter the String: ))((
ans:

*/

