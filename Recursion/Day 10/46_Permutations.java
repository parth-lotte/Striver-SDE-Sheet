// https://leetcode.com/problems/permutations/solutions/
class Solution {

    public void permutations(int idx, int nums[], List<List<Integer>> answer, List<Integer> curr, boolean vis[])
    {
        // base case 

        if( idx == nums.length)
        {
            answer.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i< nums.length; i++)
        {
            if( vis[i] == true)
            {
                continue;
            }

            vis[i] = true;
            curr.add(nums[i]);
            permutations(idx + 1, nums, answer, curr, vis);
            curr.remove(curr.size() - 1);
            vis[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean vis[] = new boolean[nums.length];
        permutations(0, nums, answer, curr, vis);

        return answer;
        
    }
}