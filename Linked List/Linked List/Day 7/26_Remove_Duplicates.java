// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 1;
        int j = 1;
        int n = nums.length;


        while(i < n)
        {
            if(nums[i-1]!=nums[i])
            {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}