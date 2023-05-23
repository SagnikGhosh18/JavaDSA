class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        int i=0,j=nums.length-1;
        while(i<=j){
            int sum = nums[i]+nums[j];
            if(sum==target){
                a[0]=i+1;
                a[1]=j+1;
                return a;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        
        return a;
    }
}