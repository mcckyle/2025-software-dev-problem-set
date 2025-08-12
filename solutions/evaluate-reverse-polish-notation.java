class Solution {
    public int evalRPN(String[] tokens)
    {
        Stack<Integer> myStack = new Stack<>();
        int result;
        int temp, op1, op2;

        for(int i = 0; i < tokens.length; i ++)
        {
            if(tokens[i].equals("+"))
            {
                op1 = myStack.pop();
                op2 = myStack.pop();
                temp = op1 + op2;

                myStack.push(temp);
            }
            else if(tokens[i].equals("-"))
            {
                op1 = myStack.pop();
                op2 = myStack.pop();
                temp = op2 - op1;

                myStack.push(temp);
            }
            else if(tokens[i].equals("*"))
            {
                op1 = myStack.pop();
                op2 = myStack.pop();
                temp = op1 * op2;

                myStack.push(temp);
            }
            else if(tokens[i].equals("/"))
            {
                op1 = myStack.pop();
                op2 = myStack.pop();
                temp = op2 / op1;

                myStack.push(temp);
            }
            else
            {
                myStack.push(Integer.parseInt(tokens[i]));
            }
        }

        result = myStack.pop();
        return result;
    }
}
