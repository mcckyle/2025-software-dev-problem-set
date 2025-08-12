class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> myStack = new Stack<>();
        boolean result = true;

        if( !(s.length() % 2 == 0) || (s.charAt(0) == ')') || (s.charAt(0) == ']') || (s.charAt(0) == '}') )
        {
            return false;
        }

        for(int i = 0; i < s.length(); i ++)
        {
            if( (s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{') )
            {
                myStack.push(s.charAt(i));
            }
            else
            {
                if(!myStack.isEmpty())
                {
                    if(s.charAt(i) == ')')
                    {
                        if (myStack.peek() == '(')
                        {
                            myStack.pop();
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else if(s.charAt(i) == ']')
                    {
                        if (myStack.peek() == '[')
                        {
                            myStack.pop();
                        }
                        else
                        {
                           return false;
                        }
                    }
                    else if(s.charAt(i) == '}')
                    {
                        if (myStack.peek() == '{')
                        {
                            myStack.pop();
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
                else
                {
                    return false;
                }
            }
        }

        if(myStack.isEmpty() == true)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
}
