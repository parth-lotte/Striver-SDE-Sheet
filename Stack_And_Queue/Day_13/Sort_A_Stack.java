class Solution {
    public void sortStack(Stack<Integer> st) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        while(!st.isEmpty())
        {
            pq.add(st.pop());
        }
        
        while(!pq.isEmpty())
        {
            st.push(pq.remove());
        }
        
    }
}