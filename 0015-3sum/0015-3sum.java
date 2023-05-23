class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        int t=0;
        for(int i=0;i<nums.length;i++){
            int p1=i+1,p2=nums.length-1;
            while(p1<p2){
                ArrayList<Integer> li = new ArrayList<>();
                int sum = nums[p1]+nums[p2]+nums[i];
                if(sum==t){
                    li.add(nums[i]);
                    li.add(nums[p1]);
                    li.add(nums[p2]);
                    s.add(li);
                    p1++;
                    p2--;
                }
                else if(sum<t){
                    p1++;
                }
                else{
                    p2--;
                }
            }
        }
        result.addAll(s);
        return result;
    }
}