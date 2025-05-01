class MyQueue {
    Stack<Integer> s;
    Stack<Integer> q;
    public MyQueue() {
        s = new Stack<>();
        q = new Stack<>();
    }
    
    public void push(int x) {
        while(!q.isEmpty()){
            s.push(q.pop());
        }
        s.push(x);
        while(!s.isEmpty()){
            q.push(s.pop());
        }
    }
    
    public int pop() {
        if(q.isEmpty()){
            return -1;
        }
        return q.pop();
    }
    
    public int peek() {
        return q.peek();
    }
    
    public boolean empty() {
       return q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */