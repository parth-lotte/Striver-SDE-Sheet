https://leetcode.com/problems/longest-consecutive-sequence/
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }

        int ans = 0;

        for (int val : set) { 
            if (!set.contains(val - 1)) {  
                int currVal = val;
                int count = 1;

                while (set.contains(currVal + 1)) {
                    currVal++;
                    count++;
                }

                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}
