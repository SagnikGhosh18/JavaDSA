class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        
        Map<Character, Integer> f1 = new HashMap<>();
        Map<Character, Integer> f2 = new HashMap<>();
        
        for(char c:word1.toCharArray()){
            if(f1.containsKey(c))
                f1.replace(c, f1.get(c)+1);
            else
                f1.put(c,1);
        }
        for(char c:word2.toCharArray()){
            if(f2.containsKey(c))
                f2.replace(c, f2.get(c)+1);
            else
                f2.put(c,1);
        }
        if(! f1.keySet().equals(f2.keySet()))
            return false;
        
        ArrayList<Integer> f3 = new ArrayList<>(f1.values());
        ArrayList<Integer> f4 = new ArrayList<>(f2.values());
        
        Collections.sort(f3);
        Collections.sort(f4);
        
        return f3.equals(f4);
    }
}