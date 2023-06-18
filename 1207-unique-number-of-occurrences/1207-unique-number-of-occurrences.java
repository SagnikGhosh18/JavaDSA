class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.replace(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }
        Set<Integer> freq = new HashSet<>();
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int cal = entry.getValue();
            if(freq.contains(cal))
                return false;
            freq.add(cal);
        }
        return true;
    }
}