// https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    public int rotatedArraySearch(int low, int high, int nums[], int target){
        //  base case 

        if( low > high)
        {
            return - 1;
        }
        int mid = low + (high - low) / 2;

        if( nums[mid] == target)
        {
            return mid;
        }

        if( nums[low] <= nums[mid])
        {
            if( nums[low] <= target && target <= nums[mid])
            {
                return rotatedArraySearch(low, mid - 1, nums, target);
            }else 
            {
                return rotatedArraySearch(mid + 1, high, nums, target);
            }
        }else 
        {
            if( nums[mid]<= target && target <= nums[high])
            {
                return rotatedArraySearch(mid + 1, high, nums, target);
            }else 
            {
                return rotatedArraySearch(low , mid - 1, nums, target);
            }
        }
    }
    public int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length - 1;

       return rotatedArraySearch(low, high, nums, target);
    }
}