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
 // https://leetcode.com/problems/binary-tree-right-side-view/
 class Solution {
    public void rightSideTraversal(TreeNode root, List<Integer> ans,int level)
    {
        if(root==null)
        {
            return;
        }

        if(ans.size()==level)
        {
            ans.add(root.val);
        }

        rightSideTraversal(root.right,ans,level+1);
        rightSideTraversal(root.left,ans,level+1);



    }
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans= new ArrayList<>();

        rightSideTraversal(root,ans,0);

        return ans;
        
    }
}