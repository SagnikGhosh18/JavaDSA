class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = nums.length-1;
        
        while(i<j){
            if(nums[i] == 0){
                move(nums, i, j);
                j--;
            }
            else {
                i++;
            }
        }
    }
    public void move(int[] nums, int start, int end){
        for(int i=start;i<end;i++){
            nums[i] = nums[i+1];
        }
        nums[end] = 0;
    }
}