class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        //int numOccurences = 0;
        List<int[]> arr = new ArrayList<>();

        int [] result = new int [k];

        for(int num : nums)
        {
            // numOccurences = 1;

            // if(freq.keys().contains(num))
            // {
            //     numOccurences = freq.get(num).length();
            // }

            // freq.putIfAbsent(num, numOccurences);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet())
        {
            arr.add(new int [] {entry.getValue(), entry.getKey()});
        }

        arr.sort((a,b) -> b[0] - a[0]);

        // int max1;
        // for(int i = 1; i < k; i ++)
        // {
        //     max1 = freq.get(0).length();
        //     if(max1 < freq.get(i).length())
        //     {
        //         max1 = freq.get(i);
        //     }
        //     freq.remove(max1);
        //     //result[]
        // }

        for(int i = 0; i < k; i ++)
        {
            result[i] = arr.get(i)[1];
        }

        return result;
    }
}
