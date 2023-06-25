class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = Set.of('a','e','i','o','u');
        int l = s.length();
        int res=0, ans = 0;
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i)))
                res++;
        }
        ans = res;
        for(int i=k;i<l;i++){
            if(set.contains(s.charAt(i-k)))
                res-=1;
            if(set.contains(s.charAt(i)))
                res++;
            ans = Math.max(ans, res);
        }
        return ans;
    }
}