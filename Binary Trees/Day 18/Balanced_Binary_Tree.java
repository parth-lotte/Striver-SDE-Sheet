/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int balanced(TreeNode root) {

        if(root == null)
        {
            return 0;
        }

        int leftH = balanced(root.left);
        if(leftH==-11)
        {
            return -11;
        }
        int rightH = balanced(root.right);

        if(rightH==-11)
        {
            return -11;
        }
        if(Math.abs(leftH - rightH) > 1)
        {
            return -11;
        }

        return Math.max(leftH,rightH) + 1;   
    }
    public boolean isBalanced(TreeNode root) {

        
        return balanced(root)!=-11;


    }
}