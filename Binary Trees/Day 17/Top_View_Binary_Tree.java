/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    class Pair {
        Node node;
        int dist;
        
        Pair(Node node, int dist)
        {
            this.node = node;
            this.dist = dist;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        
        TreeMap<Integer, Node> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        queue.add(new Pair(root, 0));
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            
            while(size-->0)
            {
                Pair curr = queue.remove();
                Node currN = curr.node;
                int currD = curr.dist;
                
                if(!map.containsKey(currD))
                {
                    map.put(currD, currN);
                }
                
                if(currN.left != null)
                {
                    queue.add(new Pair(currN.left, currD - 1));
                }
                
                if(currN.right != null)
                {
                    queue.add(new Pair(currN.right, currD + 1));
                }
            }
        }
        
        for(Map.Entry<Integer, Node> e: map.entrySet())
        {
            ans.add(e.getValue().data);
        }
        return ans;
    }
}