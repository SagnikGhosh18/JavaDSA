class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0, high = nums.length-2;
        
        int mid = low + (high-low)/2;
        
        while(low<=high){
            mid = low + (high-low)/2;
            
            if(mid%2==0){
                if(nums[mid]!=nums[mid+1])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if(nums[mid]==nums[mid+1])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        
        return nums[low];
    }
}