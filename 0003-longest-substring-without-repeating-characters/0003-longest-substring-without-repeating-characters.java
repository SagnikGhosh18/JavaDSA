class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str =s;
        int n = str.length();

        int res = 0;
        int i=0,j=0;

        while(i<n && j<n)
        {
            if(areDistinct(str,i,j))
            {
                res=Math.max(res,j-i+1);
                j++;
            }
            else
                i++;
        }

        return res;
    }
    public  Boolean areDistinct(String str,int i, int j)
    {
        List<Character> l = new ArrayList<>();

        for(int k = i; k <= j; k++)
        {
            char x = str.charAt(k);

            if(l.contains(x))
                return false;
            else
                l.add(x);
        }
        return true;
    }
}