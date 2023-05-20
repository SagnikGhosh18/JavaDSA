class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
            map.put(nums[i],0);
        for(int i=0;i<n;i++)
            map.replace(nums[i],map.get(nums[i])+1);
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>n/2)
                return nums[i];
        }
        return 0;
    }
}