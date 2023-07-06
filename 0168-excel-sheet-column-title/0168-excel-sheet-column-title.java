class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        int c = columnNumber;
        

        while(c!=0){
        
            int d = (c-1)%26;
            res = (char)(d+65) + res;
            c = (c-1)/26;
            
        }
        
        
        return res;
    }
}