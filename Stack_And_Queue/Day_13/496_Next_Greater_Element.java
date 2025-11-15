// https://leetcode.com/problems/next-greater-element-i/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int ans[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i>= 0; i--)
        {
            if(st.isEmpty())
            {
                ans[i] = -1;
            }else if( !st.isEmpty() && st.peek() > nums2[i])
            {
                ans[i] = st.peek();
            }else if(!st.isEmpty() && st.peek() <= nums2[i])
            {
                while(!st.isEmpty() && st.peek() <= nums2[i])
                {
                    st.pop();
                }
            }

            if(st.isEmpty())
            {
                ans[i] = -1;
            }else 
            {
                ans[i] = st.peek();
            }

            st.push(nums2[i]);
        }

        int finalAns[] = new int[nums1.length];

        for(int i = 0; i<nums2.length; i++)
        {
            for(int j = 0; j< nums1.length; j++)
            {
                if(nums1[j] == nums2[i])
                {
                    finalAns[j] = ans[i];
                }
            }
        }
        return finalAns;
        
    }
}