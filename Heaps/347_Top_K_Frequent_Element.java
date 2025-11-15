// https://leetcode.com/problems/top-k-frequent-elements/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : nums)
        {
            map.put(val, map.getOrDefault(val,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));

        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            pq.add(e.getKey());
        }      

        int ans[] = new int[k];
        int idx = 0;

        while(k-->0)
        {
            ans[idx++] = pq.remove();
        }

        return ans;
    }
}