// https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i<arr.length; i++)
        {
            if(st.isEmpty())
            {
                ans.add(i+1);
            }else if( !st.isEmpty() && arr[st.peek()] > arr[i])
            {
                ans.add(i - st.peek());
            }else if(!st.isEmpty() && arr[st.peek()] <= arr[i])
            {
                while(!st.isEmpty() && arr[st.peek()] <= arr[i])
                {
                    st.pop();
                }
                
                if(st.isEmpty())
                {
                    ans.add(i+1);
                }else 
                {
                    ans.add(i - st.peek());
                }
            }
            st.push(i);
        }
        return ans;
    }
    
}