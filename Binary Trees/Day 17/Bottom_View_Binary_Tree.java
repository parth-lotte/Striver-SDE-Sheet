

//User function Template for Java


class Solution
{
    
    class Pair {
        
        Node node;
        int hd;
        
        Pair(Node node, int hd) {
            
            this.node = node;
            this.hd = hd;
        }
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        
        
        TreeMap<Integer, Node> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        
        queue.add(new Pair (root, 0));
        
        while(!queue.isEmpty()) {
            
            int size = queue.size();
            
            for(int i =0; i<size; i++)
            {
                Pair curr = queue.remove();
                Node currN = curr.node;
                int currD = curr.hd;
                
                map.put(currD, currN);
                
                if(currN.left!= null)
                {
                    queue.add(new Pair(currN.left, currD - 1));
                    // map.put(new Pair())
                }
                
                if(currN.right!= null)
                {
                    queue.add(new Pair(currN.right, currD + 1));
                    // map.put(new Pair())
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(Map.Entry<Integer, Node> e: map.entrySet())
        {
            list.add(e.getValue().data);
        }
        
        return list;
    }
}