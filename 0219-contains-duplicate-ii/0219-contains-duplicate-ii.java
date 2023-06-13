class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int f=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], i);
            else{
                int n = (int) Math.abs(i-map.get(nums[i]));
                if(n<=k){
                    f=1;
                }
                map.replace(nums[i], i);
            }
        }
        if(f==1)
            return true;
        return false;
    }
}