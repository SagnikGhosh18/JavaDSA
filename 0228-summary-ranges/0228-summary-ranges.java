class Solution {
    public List<String> summaryRanges(int[] nums) {
        String res = "";
        List<String> li = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int s = nums[i];
            int k=0;
            while(i<nums.length && nums[i]-s==k){
                i++;
                k++;
            }
            i--;
            if(k==1)
                res = ""+nums[i];
            else
                res = s+"->"+nums[i];
            li.add(res);
        }
        return li;
    }
}