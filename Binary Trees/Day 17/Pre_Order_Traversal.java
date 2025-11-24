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

 // https://leetcode.com/problems/binary-tree-preorder-traversal/
 class Solution {
    public void traversal(TreeNode root, List<Integer> ls)
    {
        if(root==null)
        {
            return;
        }

        ls.add(root.val);
        traversal(root.left,ls);
        traversal(root.right,ls);
    }
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ls= new ArrayList<>();

        traversal(root,ls);

        return ls;
        
    }
}