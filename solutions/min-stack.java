class MinStack
{
    // private int [] stack;
    // private int size;
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack()
    {
        // stack = new int [100];
        // size = 0;
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val)
    {
        // stack[size] = val;
        // size ++;
        stack.push(val);

        if( (minStack.isEmpty()) || (val <= minStack.peek()) )
        {
            minStack.push(val);
        }
    }

    public void pop()
    {
        // int [] temp = new int[100];

        // for(int i = 0; i < size - 1; i ++)
        // {
        //     temp[i] = stack[i];
        // }

        // stack = temp;

        // size --;

        //stack.pop();

        if(stack.isEmpty())
        {
            return;
        }

        int top = stack.pop();

        if(top == minStack.peek())
        {
            minStack.pop();
        }

    }

    public int top()
    {
        // return stack[size - 1];
        return stack.peek();
    }

    public int getMin()
    {
        // int result = stack[0];

        // for(int i = 1; i < size; i ++)
        // {
        //     if(result < stack[i])
        //     {
        //         result = stack[i];
        //     }
        // }

        // return result;

        // Stack<Integer> temp = new Stack<>();

        // int min = stack.peek();

        // while(!stack.isEmpty())
        // {
        //     min = Math.min(min, stack.peek());
        //     temp.push(stack.pop());
        // }

        // while(!temp.isEmpty())
        // {
        //     stack.push(temp.pop());
        // }

        // return min;

        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
