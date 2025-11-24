// https://leetcode.com/problems/reverse-words-in-a-string/description/
class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int n = s.length();

        String ans = new String();

        while(i < n)
        {
            while( i< n && s.charAt(i)==' ')
            i++;

            if(i >= n)
            break;

            int j = i + 1;

            while(j < n && s.charAt(j) != ' ')
            j++;

            String sub = s.substring(i,j);

            if(ans.length() == 0)
            {
                ans = sub;
            }else 
            {
                ans = sub+' '+ ans;
            }
             i = j+ 1;
        }
        return ans;
    }
}