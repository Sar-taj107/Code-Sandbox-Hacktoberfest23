//package Medium.150. Evaluate Reverse Polish Notation;
import java.util.*;
public class ReversePolishNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter token array size: ");
        int n=sc.nextInt();
        String tokens[] = new String[n];
        System.out.print("Enter token as String: ");
        for(int i=0; i<n; i++){
            tokens[i]=sc.next();
        }
        int ans = evalRPN(tokens);
        System.out.println("Ans: "+ans);
    }
    public static int Evaluate(int a, int b, String t){
        if(t.equals("+")){
            return a+b;
        }
        if(t.equals("-")){
            return a-b;
        }
        if(t.equals("*")){
            return a*b;
        }
        if(t.equals("/")){
            return a/b;
        }
        return -1;
    }
    public static int evalRPN(String[] tokens){

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            String t = tokens[i];
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int b = st.peek();
                st.pop();
                int a = st.peek();
                st.pop();
                int res = Evaluate(a,b,t);
                st.push(res);
            }else{
                st.push(Integer.valueOf(t));
            }
        }
        return st.peek();
    }
}

/*
Output:

Enter token array size: 5
Enter token as String: "2" "1" "+" "3" "*"
Ans: 9

Enter token array size: 5
Enter token as String: "4" "13" "5" "/" "+"
Ans: 6

Enter token array size: 13
Enter token as String: "10" "6" "9" "3" "+" "-11" "*" "/" "*" "17" "+" "5" "+"
Ans: 22

*/