class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrayOne = s.toCharArray();
        char[] arrayTwo = t.toCharArray();

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        if( Arrays.equals(arrayOne, arrayTwo))
        {
            return true;
        }

        return false;
        // boolean result = true;

        // for(int i = 0; i < s.length(); i ++)
        // {
        //     for(int j = 0; j < t.length(); j ++)
        //     {
        //         //if(!(s.contains(t.charAt(j))))
        //         if(s.indexOf(t[j]) < 0)
        //         {
        //             result = false;
        //         }
        //     }
        // }

        // return result;
    }
}
