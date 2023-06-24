class Solution {
    public int compress(char[] chars) {
        int i=0, res=0;
        
        while(i<chars.length){
            int group = 1;
            while(i+group<chars.length && chars[i+group]==chars[i])
                group++;
            chars[res++] = chars[i];
            if(group>1){
                for(char c: Integer.toString(group).toCharArray())
                    chars[res++] = c;
            }
            i+=group;
        }
        return res;
    }
}