// https://leetcode.com/problems/kth-largest-element-in-an-array/
class Solution {
    public int findKthLargest(int[] nums, int k) {

        //  Using priority Queue 

        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i: nums)
        {
            pq.add(i);
        }

        while(pq.size()>k)
        {
            pq.remove();
        }

        return pq.peek();
        
    }
}

