
//§ 
/*
 Write a function CalculateBinaryOperations(str) that accepts 
the string as an argument or parameter. The string should contain
the binary numbers with their operators OR, AND, and XOR?
a. A Means the AND Operation.
b. B Means the OR Operation.
c. C Means the XOR Operation.
By scanning the given string from left to right you’ve to calculate the string
and by taking one operator at a time then return the desired output.
Conditions:
1.The priority of the operator is not required.
2.The length of the string is always Odd.
3.If the length of the string is null then return -1.

Sample Test Case:
Input:
1C0C1C1A0B1
Output:
1

Explanation:
The entered input string is 1 XOR 0 XOR 1 XOR 1 AND 0 OR 1.

 */
import java.util.*;
public class BinaryCalString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        int ans=OperBinaryStr(s);
        System.out.println("result:"+ans);


    }
    static int OperBinaryStr(String s){
        
        String str =s.toUpperCase();
        char[] ch = str.toCharArray();
        int n=ch.length;
        if(n==0){
            return -1;
        }
        int res=ch[0]-'0';
        for(int i=1; i<n; i++){
            char prev = ch[i];
            i++;
            if(prev=='A'){
                res=res & ch[i]-'0';
            }else if(prev=='B'){
                res = res | ch[i]-'0';
            }else{
                res = res ^ ch[i]-'0';
            }
        }
        return res;
    }
    
}

/*

OUTPUT

Enter the string:
1C0C1C1A0B1
result:1

*/