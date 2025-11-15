
// https://leetcode.com/problems/combination-sum-ii/class Solution {

    public void combination(int idx, int[] candidates, int target,List<List<Integer>> answer,List<Integer> ls, HashSet<List<Integer>> set)
    {
        // base case 

        if(idx == candidates.length)
        {
            if(target == 0)
            {
                set.add(new ArrayList<>(ls));
            }
            return;
        }

        if(candidates[idx] <= target)
        {
            ls.add(candidates[idx]);
            combination(idx + 1, candidates, target - candidates[idx], answer, ls, set);
            ls.remove(ls.size() - 1);
        }
        combination(idx + 1, candidates, target , answer, ls, set);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

       List<List<Integer>> answer = new ArrayList<>();

        List<Integer> ls = new ArrayList<>();

        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(candidates);
        combination(0, candidates, target, answer, ls, set);
        return new ArrayList<>(set);
        
    }
}