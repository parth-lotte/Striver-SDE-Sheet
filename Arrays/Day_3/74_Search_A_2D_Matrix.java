// https://leetcode.com/problems/search-a-2d-matrix/description/

// Solution - 1

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

     int m = matrix.length;
     int n = matrix[0].length;

     for(int i = 0; i<m; i++)
     {
        int low = 0;
        int high = n - 1;
        

        while(low <= high)
        {
            int mid  = low + (high - low) / 2;
            if(matrix[i][mid]== target)
            {
                return true;
            }else if(matrix[i][mid] > target)
            {
                high = mid - 1;
            }else 
            {
                low = mid + 1;
            }
        }
     }   
     return false;
    }
}

// Solution - 2
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;

        int i = 0;
        int j = n;

        while(i<=m && j>=0)
        {
            if(matrix[i][j] == target)
            {
                return true;
            }else if(matrix[i][j] > target)
            {
                j--;
            }else 
            {
                i++;
            }
        }
        
        return false;
    }
}