// https://leetcode.com/problems/trapping-rain-water/
class Solution {
    public int trap(int[] height) {

        // make two arrays 

        int n = height.length;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

        for(int i = 1; i<n; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // O(N)

        for(int i = n - 2; i>=0; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // O(N)

        int trappedWater = 0;

        for(int i = 0; i<height.length; i++)
        {

            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevel - height[i]; 

        } // O(N)
        return trappedWater;
    }
}