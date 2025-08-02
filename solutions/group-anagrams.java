class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result;
        List<String> matches;

        if(strs.length == 0)
        {
            return result;
        }
        else if (strs.length == 1)
        {
            return result.append(strs[0]);
        }

        for(int i = 0; i < strs.length; i ++)
        {
            Arrays.sort(strs[i]);
        }

        for(int i = 0; i < strs.length - 1; i ++)
        {
            for(int j = i + 1; j < strs.length -1; j ++)
            {
                if(strs[i].equals(strs[j]))
                {
                    matches.append(strs[i]);
                    matches.append(strs[j]);
                }
            }

        }

        for(int x = 0; x < matches.length; x ++)
        {
            result.append(matches[x]);
        }


        return result;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> result;
        // List<String> matches;

        Map<String, List<String>> result = new HashMap<>();

        for(String s : strs)
        {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            result.putIfAbsent(sortedS, new ArrayList<>());
            result.get(sortedS).add(s);
        }

        return new ArrayList<>(result.values());

        // if(strs.length == 0)
        // {
        //     return result;
        // }
        // else if (strs.length == 1)
        // {
        //     return result.append(strs[0]);
        // }

        // for(int i = 0; i < strs.length; i ++)
        // {
        //     Arrays.sort(strs[i]);
        // }

        // for(int i = 0; i < strs.length - 1; i ++)
        // {
        //     for(int j = i + 1; j < strs.length -1; j ++)
        //     {
        //         if(strs[i].equals(strs[j]))
        //         {
        //             matches.append(strs[i]);
        //             matches.append(strs[j]);
        //         }
        //     }

        // }

        // for(int x = 0; x < matches.length; x ++)
        // {
        //     result.append(matches[x]);
        // }


        // return result;
    }
}
