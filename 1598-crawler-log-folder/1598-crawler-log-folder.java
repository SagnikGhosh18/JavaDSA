class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        
        for(String s:logs){
            switch(s){
                case "../":    if(!st.isEmpty())
                                    st.pop();
                            break;
                case "./":   break;
                default:  st.push(s);
            }
        }
        
        return st.size();
    }
}