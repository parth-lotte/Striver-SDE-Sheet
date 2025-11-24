//  https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);

        int n = strs.length;

        String str1 = strs[0];
        String str2 = strs[n - 1];

        StringBuilder sb = new StringBuilder();
        int idx = 0;

        while( idx < str1.length() && idx < str2.length())
        {
            if(str1.charAt(idx) == str2.charAt(idx))
            {
                sb.append(str1.charAt(idx));
            }else 
            {
                break;
            }
            idx++;
        }

        return sb.toString();
    }
}