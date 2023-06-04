class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int l = 2 * (int)Math.min(word1.length(),word2.length());
        int s=0,t=0;
        for(int i=0;i<l;i++){
            if(i%2==0)
                res = res + word1.charAt(s++);
            else
                res = res + word2.charAt(t++);
        }
        if(word1.length()>word2.length())
            res = res + word1.substring(s);
        else if(word1.length()<word2.length())
            res = res + word2.substring(t);
        return res;
    }
}