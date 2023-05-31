class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        permutations(nums, res, 0);
        
        return res;
    }
    public void permutations(int[] nums, List<List<Integer>> res, int idx){
        if(idx == nums.length){
            List<Integer> li = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                li.add(nums[i]);
            }
            res.add(new ArrayList<>(li));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            permutations(nums,res,idx+1);
            swap(nums,i,idx);
        }
    }
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}