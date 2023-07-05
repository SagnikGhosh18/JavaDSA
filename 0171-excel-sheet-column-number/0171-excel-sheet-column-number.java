class Solution {
    public int titleToNumber(String columnTitle) {
        String str = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int res = 0, i=columnTitle.length()-1, pow=0;
        while(i >=0){
            char x = columnTitle.charAt(i);
            res = res + str.indexOf(x)*(int)Math.pow(26, pow);
            // System.out.println(x+" "+str.indexOf(x));
            pow++;
            i--;
        }
        return res;
    }
}