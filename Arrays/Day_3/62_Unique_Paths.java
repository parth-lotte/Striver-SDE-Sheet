// https://leetcode.com/problems/unique-paths/
class Solution {
    public int paths(int dp[][], int i, int j)
    {
        if( i < 0 || j < 0 )
        {
            return 0;
        }

        if(i == 0 && j == 0)
        {
            return 1;

        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        
        int left = paths(dp, i-1, j);
        int right = paths(dp, i, j-1);
        
        dp[i][j] = left + right;

        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {

        int dp[][] = new int[m][n];

        for(int row[] : dp)
        {
            Arrays.fill(row, -1);
        }
        return paths(dp, m-1,n - 1);
    }
}