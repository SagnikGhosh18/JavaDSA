class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res = 0.0, sum = 0.0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        res = sum;
        for(int i=k;i<nums.length;i++){
            sum += nums[i] - nums[i-k];
            res = Math.max(sum, res);
        }
        return res/k;
    }
}