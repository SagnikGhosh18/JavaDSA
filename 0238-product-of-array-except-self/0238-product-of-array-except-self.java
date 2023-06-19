class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pl = new int[nums.length];
        int[] pr = new int[nums.length];
        int[] res = new int[nums.length];
        
        pl[0] = 1;
        pr[nums.length-1] = 1;
        
        for(int i=1;i<nums.length;i++){
            pl[i] = nums[i-1] * pl[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            pr[i] = nums[i+1] * pr[i+1];
        }
        for(int i=0;i<nums.length;i++)
            res[i] = pl[i] * pr[i];
        return res;
    }
}