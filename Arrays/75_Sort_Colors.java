// https://leetcode.com/problems/sort-colors/

class Solution {

    public void swap(int low, int high, int nums[])
    {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
    public void sortColors(int[] nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(low, mid, nums);
                low++;
                mid++;
            }else if(nums[mid] == 2)
            {
                swap(mid, high, nums);
                
                high --;
            }else 
            {
                mid++;
            }
        }
    }
}