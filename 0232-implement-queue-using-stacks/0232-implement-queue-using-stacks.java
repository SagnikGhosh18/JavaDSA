class MyQueue {
    ArrayList s1 = new ArrayList();
    
    public void push(int x) {
        s1.add(x);
    }
    
    public int pop() {
        return (int)s1.remove(0);
    }
    
    public int peek() {
        return (int)s1.get(0);
    }
    
    public boolean empty() {
        if(s1.isEmpty())
            return true;
        return false;
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