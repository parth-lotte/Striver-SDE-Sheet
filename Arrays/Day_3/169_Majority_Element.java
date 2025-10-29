// https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {

        // Using Boye - Moore Algo 

        int n = nums.length;
        int count = 0;
        int ele = 0;
        int i = 0;

        while(i < n)
        {
            if(count == 0)
            {
                ele = nums[i];
                count = 1;
            }else if( nums[i] == ele)
            {
                count++;
            }else 
            {
                count--;
            }
            i++;
        }

        int count1 = 0;

        for(int idx = 0; idx<n; idx++)
        {
            if(ele == nums[idx])
            {
                count1++;
            }
        }
        return (count1 > n/2)? ele: -1;
    }
}