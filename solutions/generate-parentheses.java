class Solution {
    public List<String> generateParenthesis(int n)
    {
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i <= n; i ++)
        {
            result.add(new ArrayList<>());
        }

        result.get(0).add("");

        for(int i = 0; i <= n; i ++)
        {
            for(int j = 0; j < i; j ++)
            {
                for(String left : result.get(j))
                {
                    for(String right : result.get(i - j - 1))
                    {
                        result.get(i).add("(" + left + ")" + right);
                    }
                }
            }
        }

        // if(n==1)
        // {
        //     result.add("()");
        // }
        // else if(n==2)
        // {
        //     result.add("(())");
        //     result.add("()()");
        // }
        // else if(n==3)
        // {
        //     result.add("((()))");
        //     result.add("(()())");
        //     result.add("(())()");
        //     result.add("()(())");
        //     result.add("()()()");
        // }
        // else if(n==4)
        // {
        //     result.add("(((())))");
        //     result.add("((()()))");
        //     result.add("((())())");
        //     result.add("((()))()");
        //     result.add("(()(()))");
        //     result.add("(()()())");
        //     result.add("(()())()");
        //     result.add("(())(())");
        //     result.add("(())()()");
        //     result.add("()((()))");
        //     result.add("()(()())");
        //     result.add("()(())()");
        //     result.add("()()(())");
        //     result.add("()()()()");
        // }
        // else if(n==5)
        // {
        //     result.add("((((()))))");
        //     result.add("(((()())))");
        //     result.add("(((())()))");
        //     result.add("(((()))())");
        //     result.add("(((())))()");
        //     result.add("((()(())))");
        //     result.add("((()()()))");
        //     result.add("((()())())");
        //     result.add("((()()))()");
        //     result.add("((())(()))");

        //     result.add("((())()())");
        //     result.add("((()))(())");
        //     result.add("((()))()()");
        //     result.add("(()((())))");
        //     result.add("(()(()()))");
        //     result.add("(()(())())");
        //     result.add("(()(()))()");
        //     result.add("(()()(()))");
        //     result.add("(()()()())");
        //     result.add("(()()())()");
        //     result.add("(()())(())");
        //     result.add("(()())()()");
        //     result.add("(())((()))");

        //     result.add("((())())()");
        //     result.add("(())(()())");
        //     result.add("(())(())()");
        //     result.add("(())()(())");
        //     result.add("(())()()()");
        //     result.add("()(((())))");
        //     result.add("()((()()))");
        //     result.add("()((())())");
        //     result.add("()((()))()");

        //     result.add("()(()(()))");
        //     result.add("()(()()())");
        //     result.add("()(()())()");
        //     result.add("()(())(())");
        //     result.add("()(())()()");
        //     result.add("()()((()))");
        //     result.add("()()(()())");
        //     result.add("()()(())()");
        //     result.add("()()()(())");
        //     result.add("()()()()()");
        // }
        // else if(n==6)
        // {
        //     result.add("(((())))");
        //     result.add("(()()())");
        //     result.add("(()()())");
        //     result.add("(())()()");
        //     result.add("()(())()");
        //     result.add("()()(())");
        //     result.add("()()()()");
        // }
        // else if(n==7)
        // {
        //     result.add("(((())))");
        //     result.add("(()()())");
        //     result.add("(()()())");
        //     result.add("(())()()");
        //     result.add("()(())()");
        //     result.add("()()(())");
        //     result.add("()()()()");
        // }
        // else
        // {
        //     result.add("(((())))");
        //     result.add("(()()())");
        //     result.add("(()()())");
        //     result.add("(())()()");
        //     result.add("()(())()");
        //     result.add("()()(())");
        //     result.add("()()()()");
        // }

        return result.get(n);
    }
}
