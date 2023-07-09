class RecentCounter {
    LinkedList<Integer> li;
    
    public RecentCounter() {
        this.li = new LinkedList<Integer>();    
    }
    
    public int ping(int t) {
        this.li.add(t);
        while(this.li.getFirst()<t-3000)
            this.li.removeFirst();
        return this.li.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */