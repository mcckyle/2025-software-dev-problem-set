class Solution {
    public int longestConsecutive(int[] nums)
    {
        // int result = 0;
        // int index = 0;
        // int count = 0;
        // boolean flag = true;

        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length; i ++)
        // {
        //     i = index;

        //     while( (index < nums.length) && (flag == true) )
        //     {
        //         if(nums[index] + 1 == nums[index + 1])
        //         {
        //             count++;
        //         }
        //         else
        //         {
        //             flag = false;
        //             result = count;
        //             count = 0;
        //         }

        //         index++;
        //     }

        // }

        // return result;

        // int result = 0;
        // Set<Integer> store = new HashSet<>();

        // for(int num : nums)
        // {
        //     store.add(num);
        // }

        // for(int num : nums)
        // {
        //     int streak = 0, curr = num;

        //     while(store.contains(curr))
        //     {
        //         streak++;
        //         curr++;
        //     }
        //     result = Math.max(result, streak);
        // }

        // return result;

        // if(nums.length == 0)
        // {
        //     return 0;
        // }

        // Arrays.sort(nums);

        // int result = 0;
        // int current = nums[0];
        // int streak = 0;
        // int i = 0;

        // while(i < nums.length)
        // {
        //     if(current != nums[i])
        //     {
        //         current = nums[i];
        //         streak = 0;
        //     }
        //     while(i < nums.length && nums[i] == current)
        //     {
        //         i ++;
        //     }
        //     streak ++;
        //     current ++;
        //     result = Math.max(result, streak);
        // }

        // return result;

        // Set<Integer> numSet = new HashSet<>();

        // for(int num : nums)
        // {
        //     numSet.add(num);
        // }

        // int longest = 0;

        // for(int num : numSet)
        // {
        //     if(!numSet.contains(num - 1))
        //     {
        //         int length = 1;
        //         while(numSet.contains(num + length))
        //         {
        //             length ++;
        //         }
        //         longest = Math.max(longest, length);
        //     }
        // }

        // return longest;

        Map<Integer, Integer> myMap = new HashMap<>();
        int result = 0;

        for(int num : nums)
        {
            if(!myMap.containsKey(num))
            {
                myMap.put(num, myMap.getOrDefault(num - 1, 0) + myMap.getOrDefault(num + 1, 0) + 1);
                myMap.put(num - myMap.getOrDefault(num - 1, 0), myMap.get(num));
                myMap.put(num + myMap.getOrDefault(num + 1, 0), myMap.get(num));
                result = Math.max(result, myMap.get(num));
            }
        }

        return result;
    }
}
