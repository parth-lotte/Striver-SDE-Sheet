
// User function Template for Java
// https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
class Solution {
    public int kthElement(int a[], int b[], int k) {
        
        int m = a.length;
        int n = b.length;
        
        int ans[] = new int[ m + n];
        
        int i = 0;
        int j = 0;
        int idx = 0;
        
        while( i < m && j < n)
        {
            if( a[i] <= b[j])
            {
                ans[idx++] = a[i++];
            }else 
            {
                ans[idx++] = b[j++];
            }
        }
        
        while(i < m)
        {
            ans[idx++] = a[i++];
        }
        
        while(j < n)
        {
            ans[idx++] = b[j++];
        }
        
        return ans[k-1];
    }
}