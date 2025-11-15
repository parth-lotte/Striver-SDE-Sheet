https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1

class Solution {

    public static Boolean subsetSum(int idx, int arr[], int sum, int dp[][])
       {
          
           if (sum == 0)
               return true;
           if (idx == 0)
               return arr[0] == sum;
   
           
           if (dp[idx][sum] != -1)
               return dp[idx][sum] == 1;
   
          
           boolean pick = false;
           if (arr[idx] <= sum)
               pick = subsetSum(idx - 1, arr, sum - arr[idx], dp);
   
           boolean notPick = subsetSum(idx - 1, arr, sum, dp);
   
           dp[idx][sum] = (pick || notPick) ? 1 : 0;
           return pick || notPick;
       }
   
       static Boolean isSubsetSum(int arr[], int sum) {
           int n = arr.length;
           int dp[][] = new int[n][sum + 1];
           for (int[] row : dp)
               Arrays.fill(row, -1);
           return subsetSum(n - 1, arr, sum, dp);
       }
   }