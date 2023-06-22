class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int p = 1;
        
        for(int i=0;i<nums.length;i++){
            p *= nums[i];
            res = Math.max(res, p);
            if(p==0)
                p=1;
        }
        p=1;
        for(int i=nums.length-1;i>=0;i--){
            p *= nums[i];
            res = Math.max(res, p);
            if(p==0)
                p=1;
        }
        
        
        return res;
    }
}