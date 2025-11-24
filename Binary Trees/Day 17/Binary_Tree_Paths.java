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
    public void binaryTreePath(TreeNode root, List<String> answer, StringBuilder sb) {
        //  base case 

        if (root == null) {
            return;
        }
        int prevLength = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            answer.add(sb.toString());
            return;
        } else {
            sb.append("->");
            binaryTreePath(root.left, answer, sb);
            binaryTreePath(root.right, answer, sb);
        }
        sb.setLength(prevLength);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        binaryTreePath(root, answer, sb);
        return answer;
    }
}