class Solution {
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();

        // //Fixed num.
        // for(int i = 0; i < nums.length; i ++)
        // {

        //     for(int j = i + 1; j < nums.length; j ++)
        //     {

        //         for(int k = j + 1; k < nums.length; k ++)
        //         {
        //             if(nums[i] + nums[j] + nums[k] == 0)
        //             {
        //                 List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 result.add(temp);
        //             }
        //         }
        //     }
        // }

        // for(int i = 0; i < result.size() - 1; i ++)
        // {
        //     Collections.sort(result.get(i));
        //     for(int j = i + 1; j < result.get(i).size() - 1; j ++)
        //     {
        //         if(result.get(i) == result.get(j))
        //         {
        //             result.remove(result.get(j));
        //         }
        //     }
        // }

        // return result;

        // Set<List<Integer>> result = new HashSet<>();

        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length; i ++)
        // {
        //     for(int j = i + 1; j < nums.length; j ++)
        //     {
        //         for(int k = j + 1; k < nums.length; k ++)
        //         {
        //             if(nums[i] + nums[j] + nums[k] == 0)
        //             {
        //                 List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 result.add(temp);
        //             }
        //         }
        //     }
        // }

        // return new ArrayList<>(result);

        Arrays.sort(nums);

        // Map<Integer, Integer> count = new HashMap<>();

        // for(int num : nums)
        // {
        //     count.put(num, count.getOrDefault(num, 0) + 1);
        // }

        // for(int i = 0; i < nums.length; i ++)
        // {
        //     count.put(nums[i], count.get(nums[i]) - 1);

        //     if( (i > 0) && (nums[i] == nums[i - 1]))
        //     {
        //         continue;
        //     }

        //     for(int j = i + 1; j < nums.length; j ++)
        //     {
        //         count.put(nums[j], count.get(nums[j]) - 1);

        //         if( (j > (i + 1)) && (nums[j] == nums[j - 1]))
        //         {
        //             continue;
        //         }

        //         int target = -(nums[i] + nums[j]);
        //         if(count.getOrDefault(target, 0) > 0)
        //         {
        //             result.add(Arrays.asList(nums[i], nums[j], target));
        //         }
        //     }

        //     for(int j = i + 1; j < nums.length; j ++)
        //     {
        //         count.put(nums[j], count.get(nums[j]) + 1);
        //     }
        // }

        for(int i = 0; i < nums.length; i ++)
        {
            if(nums[i] > 0)
            {
                break;
            }

            if ( (i > 0) && (nums[i] == nums[i - 1]) )
            {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while( l < r )
            {
                int sum = nums[i] + nums[l] + nums[r];

                if(sum > 0)
                {
                    r --;
                }
                else if(sum < 0)
                {
                    l ++;
                }
                else
                {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l ++;
                    r --;

                    while( (l < r) && (nums[l] == nums[l - 1]) )
                    {
                        l ++;
                    }
                }
            }
        }

        return result;
    }
}
