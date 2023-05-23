class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums)
            set.add(num);
        int res=0;
        for(int num: nums){
            if(!set.contains(num-1)){
                int current = 1;
                int cnum = num;
                while(set.contains(cnum+1)){
                    cnum+=1;
                    current+=1;
                }
                res = (int)Math.max(current,res);
            }
        }
        return res;
    }
}