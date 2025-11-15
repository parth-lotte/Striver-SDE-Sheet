
// User function Template for Java
class Solution {
    
    //  https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
    class Item {
        int value;
        int weight;
        
        Item(int value, int weight)
        {
            this.value = value;
            this.weight = weight;
        }
    }
    
    class weightSort implements Comparator<Item> {
        
        @Override
        
        public int compare (Item a, Item b)
        {
            double x1 = (double) a.value / (double) a.weight;
            double x2 = (double) b.value / (double) b.weight;
            
            if( x1 > x2)
            {
                return -1;
            }else if( x1 < x2)
            {
                return 1;
            }else 
            return 0;
        }
    }
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        
        List<Item> list = new ArrayList<>();
        
        for(int i = 0; i< val.size(); i++)
        {
            list.add(new Item(val.get(i), wt.get(i)));
        }
        
        Collections.sort(list, new weightSort());
        
        
        double profit = 0.0;
        double currW = 0.0;
        
        for(int i = 0; i<list.size(); i++)
        {
            if( currW + list.get(i).weight <= capacity)
            {
                profit += list.get(i).value;
                
                currW += list.get(i).weight;
            }else 
            {
                double newWeight = capacity - currW;
                
                profit+= ((double) list.get(i).value / (double)list.get(i).weight) * newWeight;
                break;
            }
        }
        return profit;
        
    }
}