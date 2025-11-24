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
    class Node {
        TreeNode node;
        int idx;

        Node(TreeNode node, int idx)
        {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(root, 1));
        int max = -1;

        while(!queue.isEmpty())
        {
            int size = queue.size();
            int startIdx = 0;
            int endIdx = 0;

            for(int i = 0; i< size; i++)
            {
                Node curr = queue.remove();
                TreeNode currN = curr.node;
                int currIdx = curr.idx;
                
                if( i == 0)
                {
                    startIdx = currIdx;
                }

                if(i == size - 1)
                {
                    endIdx = currIdx;
                }

                if(currN.left != null)
                {
                    queue.add(new Node(currN.left, 2 * currIdx + 1));
                }

                if(currN.right != null)
                {
                    queue.add(new Node(currN.right, 2 * currIdx + 2));
                }

            }
            max = Math.max(max, endIdx - startIdx + 1);
        }
        return max;
    }
}