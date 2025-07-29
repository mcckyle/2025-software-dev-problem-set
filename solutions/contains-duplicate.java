class Solution {
    public boolean containsDuplicate(int[] nums) {
        //int numOccurences = 0;
        //boolean flag = false;
        //int i = 0;

        Arrays.sort(nums);

        //while(!flag && i < nums.length)
        for(int i = 0; i < nums.length - 1; i ++)
        {
            //for(int j = i+1; j < nums.length; j++)
            //{
                if(nums[i] == nums[i+1])
                {
                    // flag = true;
                    // break;
                    //j = nums.length;
                    return true;
                }
            //}
            //++i;

            // if(flag == true)
            // {
            //     break;
            // }

        }
        return false;
        //return flag;
    }
}
