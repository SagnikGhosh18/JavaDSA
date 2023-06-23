class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='*')
                st.pop();
            else
                st.push(x);
        }
        String res = "";
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        return res;
    }
}