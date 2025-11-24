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
    public int dfs(TreeNode root, int d[])
    {
        if(root == null)
        {
            return 0;
        }

        int leftVal = dfs(root.left, d);
        int rightVal = dfs(root.right, d);

        d[0] = Math.max(leftVal + rightVal, d[0]);

        return Math.max(leftVal, rightVal) + 1;


    }
    public int diameterOfBinaryTree(TreeNode root) {

        int d[] = new int[1];
        
        dfs(root, d);

        return d[0];

        
    }
}