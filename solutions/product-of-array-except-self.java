class Solution
{
    public int[] productExceptSelf(int[] nums)
    {
        // int [] result = new int [nums.length];

        // for(int i = 0; i < nums.length; i ++)
        // {
        //     int j = nums.length - 1;

        //     while(j > 0)
        //     {
        //         if(i != j)
        //         {
        //             result[i] = nums[j] *= nums[j-1];
        //         }
        //         else
        //         {
        //             break;
        //         }
        //         j--;
        //     }
        // }
        // return result;

        int n = nums.length;
        int [] result = new int [n];

        // for(int i = 0; i < n; i ++)
        // {
        //     int prod = 1;

        //     for(int j = 0; j < n; j ++)
        //     {
        //         if(i != j)
        //         {
        //             prod *= nums[j];
        //         }
        //     }
        //     result[i] = prod;
        // }

        // int prod = 1;
        // int zeroCount = 0;

        // for(int num : nums)
        // {
        //     if(num != 0)
        //     {
        //         prod *= num;
        //     }
        //     else
        //     {
        //         zeroCount++;
        //     }
        // }

        // if(zeroCount > 1)
        // {
        //     return new int[nums.length];
        // }

        // for(int i = 0; i < nums.length; i ++)
        // {
        //     if(zeroCount > 0)
        //     {
        //         result[i] = (nums[i] == 0) ? prod : 0;
        //     }
        //     else
        //     {
        //         result[i] = prod / nums[i];
        //     }
        // }

        int [] prefix = new int [n];
        int [] suffix = new int [n];

        prefix[0] = 1;
        suffix[n-1] = 1;

        for(int i = 1; i < n; i ++)
        {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        for(int i = n - 2; i >= 0; i --)
        {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }

        for(int i = 0; i < n; i ++)
        {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
