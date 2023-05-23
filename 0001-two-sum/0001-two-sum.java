class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int l = nums.length;
        int f=1;
        int low = -1*(int)(Math.pow(10,9));
        int high = 1*(int)(Math.pow(10,9));
        if(target<low || target>high || l<2 || l>(int)(Math.pow(10,4)))
        {
            f=0;
        }
        for(int i=0;i<l;i++)
        {
            if(nums[i]<low || nums[i]>high)
            {
                f=0;
                break;
            }
        }
        if(f==1)
        {
            for(int i=0;i<l;i++)
            {
                for(int j=0;j<l;j++)
                {
                    if(i!=j && (nums[i]+nums[j]==target))
                    {
                        result[0]=i;
                        result[1]=j;
                    }
                }
            }
        }
        return result;
        
        
    }
}