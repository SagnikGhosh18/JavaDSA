class Solution {
    public String countAndSay(int n) {
        String res = "1";
        int c=2;
        while(c<=n){
            res = getRes(res);
            c++;
        }
        
        return res;
    }
    public String getRes(String s){
        char x = s.charAt(0);
        int count = 1;
        String res="";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==x){
                count++;
            } else{
                res = res+""+count+""+x;
                x = s.charAt(i);
                count=1;
            }
        }
        res = res+""+count+""+x;
        return res;
    }
}