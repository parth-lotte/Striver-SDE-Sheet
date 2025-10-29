// https://leetcode.com/problems/find-the-duplicate-number/
class Solution {
    public void swap(int a, int b, int nums[])
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public int findDuplicate(int[] nums) {

        int i = 0;
        int n = nums.length;

        while(i < n)
        {
            int correctIdx = nums[i] - 1;

            if(i >=0 && nums[i] != nums[correctIdx])
            {
                swap(i, correctIdx, nums);
            }else
            {
                i++;
            }
        }
        
        for(int idx = 0; idx< n; idx++)
        {
            if( idx + 1 != nums[idx])
            {
                return nums[idx];
            }
        }
        return -1;
    }
}