


//Back-end complete function Template for Java
// https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
class Solution {
    public static boolean isValid(int mid, int arr[], int k)
    {
        int student = 1;
        int sum = 0;
        for(int i  = 0; i<arr.length; i++)
        {
            sum+= arr[i];
            
            if( sum > mid){
                student++;
                
                sum = arr[i];
            }
        }
        
        if(student > k)
        {
            return false;
        }
        return true;
    }
    public static int findPages(int[] arr, int k) {
        
        
        int sum = 0;
        
        if( arr.length < k)
        {
            return -1;
        }
        
        int min = -1;
        for(int i = 0; i<arr.length; i++)
        {
            min = Math.max(min, arr[i]);
            sum+=arr[i];
        }
        
        int low = min;
        int high = sum;
        int res = -1;
        
        while( low <= high)
        {
            int mid = low + (high - low)/2;
            
            if(isValid(mid,arr,k))
            {
                res = mid;
                high = mid - 1;
            }else 
            low = mid + 1;
            
        }
        return res;
    }
}