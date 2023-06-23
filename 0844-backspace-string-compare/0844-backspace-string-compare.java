class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        getStack(s, st1);
        getStack(t, st2);
        
        String r1 = getRes(st1);
        String r2 = getRes(st2);
        
        if(r1.equals(r2))
            return true;
        return false;
    }
    public void getStack(String s, Stack<Character> s1){
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(s1.isEmpty() && x=='#')
                continue;
            if(x=='#')
                s1.pop();
            else
                s1.push(x);
        }
    }
    public String getRes(Stack<Character> s){
        String res = "";
        while(!s.isEmpty())
            res = s.pop()+res;
        return res;
    }
}