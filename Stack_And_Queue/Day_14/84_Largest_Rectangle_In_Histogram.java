// https://leetcode.com/problems/largest-rectangle-in-histogram/
class Solution {

    public int[] leftsmallerEle(int heights[], int answer[], int n )
    {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++)
        {
            if(st.isEmpty())
            {
                answer[i] = -1;
            }else if(!st.isEmpty() && heights[st.peek()] < heights[i])
            {
                answer[i] = st.peek();
            }else if(!st.isEmpty() && heights[st.peek()] >= heights[i])
            {
                while(!st.isEmpty() && heights[st.peek()] >= heights[i])
                {
                    st.pop();
                }
            }

            if(st.isEmpty())
            {
                answer[i] = -1;
            }else {
                answer[i] = st.peek();
            }

            st.push(i);
        }
        return answer;
    }

    public int[] rightsmallerEle(int heights[], int answer[], int n )
    {
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i>=0; i--)
        {
            if(st.isEmpty())
            {
                answer[i] = n;
            }else if(!st.isEmpty() && heights[st.peek()] < heights[i])
            {
                answer[i] = st.peek();
            }else if(!st.isEmpty() && heights[st.peek()] >= heights[i])
            {
                while(!st.isEmpty() && heights[st.peek()] >= heights[i])
                {
                    st.pop();
                }
            }

            if(st.isEmpty())
            {
                answer[i] = n;
            }else {
                answer[i] = st.peek();
            }

            st.push(i);
        }
        return answer;
    }
    public int largestRectangleArea(int[] heights) {

        // next smaller left and next smaller right 
        int n = heights.length;
        int [] leftSmall = new int[n];
        int [] rightSmall = new int[n];

        leftsmallerEle(heights, leftSmall, n);
        rightsmallerEle(heights, rightSmall, n);

        int area = Integer.MIN_VALUE;

        for(int i = 0; i<heights.length; i++)
        {
            int width = rightSmall[i] - leftSmall[i] - 1;
            int calcArea = width * heights[i];
            area = Math.max(calcArea, area);
        }
        return area;
    }
}