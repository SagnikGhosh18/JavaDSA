import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int l = s.length();
        int res = 0;

        for(int i=0;i<l;i++){
            if(i<l-1){
                char x = s.charAt(i);
                char y = s.charAt(i+1);
                if(getVal(x)<getVal(y))
                    res-=getVal(x);
                else
                    res+=getVal(x);
            }
            else
                res+=getVal(s.charAt(i));
        }

        return res;
    }
    public int getVal(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;
    }
}