class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        int nh = candidates, nt = costs.length-candidates-1;
        
        for(int i=0;i<candidates;i++)
            p1.add(costs[i]);
        for(int i=Math.max(candidates, costs.length-candidates);i<costs.length;i++)
            p2.add(costs[i]);
        long res = 0;
        
        while(k!=0){
            if(p2.isEmpty() || !p1.isEmpty() && p1.peek()<=p2.peek()){
                res += p1.poll();
                if(nh<=nt){
                    p1.add(costs[nh]);
                    nh++;
                }
            }
            else{
                res += p2.poll();
                if(nh<=nt){
                    p2.add(costs[nt]);
                    nt--;
                }
            }
            k--;
        }
        return res;
    }
}