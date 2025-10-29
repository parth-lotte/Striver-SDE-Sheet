// https://leetcode.com/problems/find-missing-and-repeated-values/description/
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = grid.length;
    
        for(int i = 0; i<n; i++)
        {
            for(int j =0; j<n; j++)
            {
                map.put(grid[i][j], map.getOrDefault(grid[i][j],0)+1);
            }
        }
        
        int ans[] = new int[2];

        for(int i = 1; i<= n*n; i++)
        {
            if(map.containsKey(i) && map.get(i) == 2)
            {
                ans[0] = i;
            }

            if(!map.containsKey(i))
            {
                ans[1] = i;
            }
        }
        return ans;
    }
}