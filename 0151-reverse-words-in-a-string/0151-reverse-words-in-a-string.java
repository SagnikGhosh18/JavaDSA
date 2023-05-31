class Solution {
    public String reverseWords(String s) {
        s = s+" ";
        String res = "", word="";
        int f=0;
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(Character.isLetter(x) || Character.isDigit(x)){
                word+=x;
                f=1;
            }
            else if(x==' ' && f==1){
                res = word +" "+ res;
                word="";
                f=0;
            }
        }
        int i = res.length()-1;
        while(res.charAt(i)==' '){
            res = res.substring(0,i);
            i--;
        }
        i = 0;
        while(res.charAt(i)==' '){
            res = res.substring(i+1);
            i++;
        }
        return res;
    }
}