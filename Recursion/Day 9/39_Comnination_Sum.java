// https://leetcode.com/problems/combination-sum/description/
class Solution {

    public void combination(int idx, int [] candidates, int target, List<List<Integer>> answer, List<Integer> ls )
    {
        //  base case 

        if(idx == candidates.length)
        {
            if(target == 0)
            {
                answer.add(new ArrayList<>(ls));
            }
            return;
        }

        if(candidates[idx] <= target)
        {
            ls.add(candidates[idx]);
            combination(idx, candidates, target - candidates[idx], answer, ls);
            ls.remove(ls.size() - 1);
        }
        combination(idx + 1, candidates, target , answer, ls);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> ls = new ArrayList<>();

        combination(0, candidates, target, answer, ls);

        return answer;
    }
}