// https://leetcode.com/problems/merge-intervals/
class Solution {
    public int[][] merge(int[][] intervals) {

        LinkedList<int[]> list = new LinkedList<>();

        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);

        for(int val[] : intervals)
        {
            if(list.isEmpty() || val[0] > list.getLast()[1])
            {
                list.add(val);
            }else 
            {
                list.getLast()[1] = Math.max(val[1], list.getLast()[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}