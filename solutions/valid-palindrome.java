class Solution {
    public boolean isPalindrome(String s)
    {
        boolean result = true;

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.trim();
        s = s.toLowerCase();

        for(int i = 0, j = s.length() - 1; i < s.length() / 2; i ++)
        {
            if(!(s.charAt(i) == ',' || s.charAt(i) == ':'))
            {
                if(s.charAt(i) != s.charAt(j))
                {
                    result = false;
                    break;
                }
            }
            else
            {
                continue;
            }

            j--;
        }

        return result;
    }
}
