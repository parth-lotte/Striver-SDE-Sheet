// https://leetcode.com/problems/string-to-integer-atoi/description/
class Solution {
    public int myAtoi(String s) {
        
        /* Cases:
        1. Leading Spaces 
        2. Negative or Positive 
        3. Leading Zeroes   
        */

        int n = s.length();
        int i = 0;

        boolean neg = false;
        boolean pos = false;

        while( i < n && s.charAt(i)==' ')
        {
            i++;
        }
        
        if( i == n)
        {
            return 0;
        }
        if(s.charAt(i) =='-')
        {
            neg = true;
        }

        if(s.charAt(i) == '+')
        {
            pos = true;
        }

        if(neg)
        {
            i++;
        }

        if(pos)
        {
            i++;
        }

        double num = 0;

        while( i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9')
        {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }

        if(neg)
        {
            num = -num;
        }

        num = num > Integer.MAX_VALUE ? Integer.MAX_VALUE : num;
        num = num < Integer.MIN_VALUE ? Integer.MIN_VALUE : num;

        return (int)num; 
    }
}