class Solution {
    //   https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
        public int minPlatform(int arr[], int dep[]) {
         
         Arrays.sort(arr);
         Arrays.sort(dep);
         
         int i = 1;
         int j = 0;
         int minPlat = 1;
         int countPlat = 1;
         
         int n = arr.length;
         
         while(i < n && j < n)
         {
             if( arr[i] <= dep[j])
             {
                 countPlat++;
                 i++;
             }else if( arr[i] > dep[j])
             {
                 countPlat--;
                 j++;
             }
             minPlat = Math.max(countPlat, minPlat);
         }
            return minPlat;
        }
    }
    