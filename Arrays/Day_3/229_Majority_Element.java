// https://leetcode.com/problems/majority-element-ii/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
    
    int ele1 = 0;
    int ele2 = 0;

    int count1= 0;
    int count2= 0;

    for(int idx : nums)
    {
        if(count1 == 0 && idx != ele2)
        {
            ele1 = idx;
            count1 = 1;
        }else if(count2 == 0 && idx != ele1)
        {
            ele2 = idx;
            count2 = 1;
        }else if( ele1 == idx)
        {
            count1++;
        }else if( ele2 == idx)
        {
            count2++;
        }
        else 
        {
            count1--;
            count2--;
        }
    }

    int countA = 0;
    int countB = 0;

    int threshold = nums.length / 3;

    List<Integer> list = new ArrayList<>();

    for(int i = 0; i< nums.length; i++)
    {
        if(ele1 == nums[i])
        {
            countA++;
        }
        if(ele2 == nums[i])
        {
            countB++;
        }
    }

    if( ele1 == 0 && ele2 == 0)
    {
        list.add(0);
        return list;
    }
    if( countA > threshold)
    {
        list.add(ele1);
    }

    if( countB > threshold)
    {
        list.add(ele2);
    }

    return list;
    }
}