class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> li = new ArrayList<>();
        if(digits.equals("")){
            return li;
        }
        String c = "";
        getRes(map, 0, digits, "", li);
        
        return li;
    }
    public void getRes(String[] map,int i, String digits, String com, List<String> li){
        if(i == digits.length()){
            li.add(com);
            return;
        }
        char x = digits.charAt(i);
        String s = map[x-'0'];
        for(int idx = 0; idx<s.length();idx++){
            getRes(map, i+1, digits, com+s.charAt(idx), li);
        }
    }
}