class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0)
            return 0;
        String str = "";
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                str+=nums[i];
            }else{
                str="";
            }
            l = (int)Math.max(l,str.length());
        }
        return l;
    }
}