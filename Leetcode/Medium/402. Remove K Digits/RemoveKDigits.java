//package Medium.402. Remove K Digits;
import java.util.*;
public class RemoveKDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num as String: ");
        String num = sc.next();
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        String ans = removeKdigits(num,k);
        System.out.print("Num after remove k Digit: " +ans);
    }
    public static String removeKdigits(String num, int k){

        Stack<Character> st = new Stack<>();
        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k >0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(!st.isEmpty() && k > 0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length() > 1 && sb.charAt(0) =='0'){
            sb.deleteCharAt(0);
        }
        return (sb.length() > 0) ? sb.toString():"0";
    }
}

/*

Enter the num as String: 1432219
Enter the value of k: 3
Num after remove k Digit: 1219

Enter the num as String: 10200
Enter the value of k: 1
Num after remove k Digit: 200

*/

