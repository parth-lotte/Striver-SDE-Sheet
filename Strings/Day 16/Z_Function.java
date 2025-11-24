package Strings.Day 16;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
class Solution {
    public int strStr(String haystack, String needle) {

        if( haystack.length() < needle.length() || !haystack.contains(needle))
        {
            return -1;
        }

        int ans = -1;
        ans = haystack.indexOf(needle);
        return ans;
        
        
    }
}