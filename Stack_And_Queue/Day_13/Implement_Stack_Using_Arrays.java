
// https://www.geeksforgeeks.org/problems/implement-stack-using-array/1class myStack {
    
    int arr[];
    int top;
    public myStack(int n) {
    
    arr = new int[n];
    top = -1;
    }

    public boolean isEmpty() {
        if( top == -1)
        {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return arr.length - 1 == top;
    }

    public void push(int x) {
    
    if( isFull())
    {
        return;
    }else 
    {
        arr[++top] =x;
    }
    }

    public void pop() {
        
        if(isEmpty())
        {
            return;
        }else
        {
        top--;
        }
    }

    public int peek() {
        
        if(isEmpty())
        {
            return -1;
        }
        int ans =arr[top];
        return ans;
    }
}