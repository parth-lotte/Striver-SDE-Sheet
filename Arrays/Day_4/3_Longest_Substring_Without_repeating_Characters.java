// https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int n = s.length();
        int max = 0;

        while(j< n)
        {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);

            if( j - i + 1 == map.size())
            {
                max = Math.max(j - i + 1, max);
            }else if( j - i + 1 > map.size())
            {
                while(j - i + 1 > map.size())
                {
                    char ch1 = s.charAt(i);
                    if(map.containsKey(ch1))
                    {
                        map.put(ch1, map.get(ch1) - 1);
                        if(map.get(ch1) == 0)
                    {
                        map.remove(ch1);
                    }
                    i++;
                    }

                   
                }
                max = Math.max(j - i + 1, max);
            }
            j++;
        }
        return max;
    }
}