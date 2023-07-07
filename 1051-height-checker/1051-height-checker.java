class Solution {
    public int heightChecker(int[] heights) {
        int[] h1 = new int[heights.length];
        for(int i=0;i<heights.length;i++)
            h1[i]=heights[i];
        Arrays.sort(h1);
        int c=0;
        for(int i=0;i<heights.length;i++)
            if(h1[i]!=heights[i])
                c++;
        return c;
    }
}