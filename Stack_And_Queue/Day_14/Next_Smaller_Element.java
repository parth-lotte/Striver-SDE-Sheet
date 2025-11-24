package Stack_And_Queue.Day_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        
        for(int i = n - 1; i>= 0; i--)
        {

                while(!st.isEmpty() && arr[st.peek()] >= arr[i])
                {
                    st.pop();
                }
            
            if(st.isEmpty())
            {
                list.add(-1);
            }else 
            {
                list.add(arr[st.peek()]);
            }
            
            st.push(i);
        }
        Collections.reverse(list);
        return  list;
    }
} Next_Smaller_Element {
    
}
