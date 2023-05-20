class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
            map.put(nums[i],0);
        for(int i=0;i<n;i++)
            map.replace(nums[i],map.get(nums[i])+1);
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>n/3)
                result.add(nums[i]);
        }
        return new ArrayList<>(result);
    }
}