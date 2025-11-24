

// User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    public void leftSideView(Node root, ArrayList<Integer> answer , int level)
    {
        //  base case 
        
        if(root == null)
        {
            return;
        }
        if(answer.size() == level)
        {
            answer.add(root.data);
        }
        
        leftSideView(root.left, answer, level + 1);
        leftSideView(root.right, answer, level + 1);
    }
    ArrayList<Integer> leftView(Node root) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        leftSideView(root, answer, 0);
        return answer;
        
    }
}