// make a separate function to get precedence

class Solution {
    public static int prec(char c)
    {
        if(c=='^')
        return 3;
        else if((c=='*')||(c=='/'))
        return 2;
        else if((c=='+')||(c=='-'))
        return 1;
        else
        return 0;
    }
    
    public static StringBuilder infixToPostfix(String exp) 
    {
        Stack<Character> stack=new Stack<Character>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            //operand
            if((c>='a' && c<='z')||(c>='A' && c<='Z')||(c>='0' && c<='9'))
                res.append(c);
            else if(c=='(')
                stack.push(c);
            else if (c==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    res.append(stack.pop());
                }
                stack.pop();
            }
            
            //operator
            else {
                while (!stack.isEmpty() && (prec(exp.charAt(i)) < prec(stack.peek()) || prec(exp.charAt(i)) == prec(stack.peek()))) 
                {
                    res.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty())             // in last when some operators are left in stack 
        {
            res.append(stack.pop());
        }
        return res;
    }
}
