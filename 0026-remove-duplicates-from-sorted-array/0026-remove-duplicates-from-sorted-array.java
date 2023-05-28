class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int l=nums.length;
        int low=0,curr=0,high=l-1;
        int k=0;
        while(curr<high){
            if(nums[curr]==nums[curr+1]){
                transfer(nums,curr,high);
                high--;
                k++;
            }
            else{
                curr++;
            }
        }
        return l-k;
    }
    public void transfer(int[] arr,int i,int j){
        for(int c=i;c<j;c++){
            int t=arr[c];
            arr[c] = arr[c+1];
            arr[c+1] = t;
        }
    }
}