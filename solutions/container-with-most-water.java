class Solution {
    public int maxArea(int[] height)
    {
        int result = 0;

        // for(int i = 0; i < height.length; i ++)
        // {
        //     for(int j = height.length - 1; j > i; j -- )
        //     {
        //         if( ((j - i) * (height[j])) > result)
        //         {
        //             if(height[i] == 1)
        //             {
        //                 result = ((j - i) * (height[i]));
        //             }
        //             else
        //             {
        //                 result = ((j - i) * (height[i] - 1));
        //             }

        //         }
        //         else if ( ((j - i) * (height[i])) > result)
        //         {
        //             result = ((j - i) * (height[i]));
        //         }

        //         // if( ((j - i) * (height[j])) > result)
        //         // {
        //         //     result = ((j - i) * (height[i]));
        //         // }
        //     }
        // }

        // for(int i = 0; i < height.length; i ++)
        // {
        //     for(int j = i + 1; j < height.length; j ++ )
        //     {
        //         result = Math.max(result, Math.min(height[i], height[j]) * (j - i));
        //     }
        // }

        int l = 0;
        int r = height.length - 1;

        while(l < r)
        {
            int area = Math.min(height[l], height[r]) * (r - l);
            result = Math.max(result, area);

            if(height[l] <= height[r])
            {
                l ++;
            }
            else
            {
                r --;
            }
        }

        return result;
    }
}
