class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word: strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String newWord = new String(ch);
            if(!map.containsKey(newWord)){
                List<String> li = new ArrayList<>();
                li.add(word);
                map.put(newWord, li);
            }
                
            else
                map.get(newWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}