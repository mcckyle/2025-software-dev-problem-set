class Solution {
    public int search(int[] nums, int target)
    {
        int result = -1;
        int left = 0;
        int right = nums.length - 1;

        // if(nums.length == 1 && nums[0] != target)
        // {
        //     //result = 0;
        //     return result;
        // }

        //for(int i = (nums[nums.length / 2] <= target) ? 0 : nums.length / 2; i < nums.length; i ++)
        // for(int i = 0; i < nums.length; i ++)
        // {
        //     if(nums[i] == target)
        //     {
        //         result = i;
        //     }

        // }

        while(left <= right)
        {
            int mid = left + ((right - left) / 2);

            if(nums[mid] > target)
            {
                right = mid - 1;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                return mid;
            }
        }

        return result;

    }
}
