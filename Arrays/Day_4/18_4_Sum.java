// https://leetcode.com/problems/4sum/description/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans= new ArrayList<>();
        // List<Integer> list= new ArrayList<>();
        Arrays.sort(nums);

        HashSet<List<Integer>> set= new HashSet<>();

        int n=nums.length;
        for(int i=0; i<n-3 ; i++)
        {
            for(int j=i+1; j<n-2 ; j++)
            {
                int k=j+1;
                int l= nums.length-1;

                while(k<l)
                {
                    long sum = nums[j]+nums[i];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum<target)
                    {
                        k++;
                    }
                    else if(sum>target)
                    {
                        l--;
                    }
                    else 
                    {
                        set.add(Arrays.asList( nums[i], nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        // set.add(list);

                    }
                }
            }
        }        
        ans.addAll(set);
        return ans;
    }
}