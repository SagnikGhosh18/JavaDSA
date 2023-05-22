class Solution {
    public int reversePairs(int[] nums) {
        return divide(nums, 0, nums.length-1);
    }
    public int divide(int[] arr,int s,int e){
        if(s>=e)
            return 0;
        int c=0;
        int mid = s+(e-s)/2;
        c = divide(arr, s, mid);
        c += divide(arr, mid+1,e);
        c += conquer(arr,s,mid,e);
        return c;
    }
    public int conquer(int[] nums, int low, int mid, int high) {
        int cnt = 0;
        int j = mid + 1; 
        for(int i = low;i<=mid;i++) {
            while(j<=high && nums[i] > (2 * (long) nums[j])) {
                j++;
            }
            cnt += (j - (mid+1));
        }
        
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low, right = mid+1; 
        while(left <= mid && right<=high) {
            if(nums[left]<=nums[right]) {
                temp.add(nums[left++]); 
            }
            else {
                temp.add(nums[right++]); 
            }
        }
        
        while(left<=mid) {
            temp.add(nums[left++]); 
        }
        while(right<=high) {
            temp.add(nums[right++]); 
        }
        
        for(int i = low; i<=high;i++) {
            nums[i] = temp.get(i - low); 
        }
        return cnt; 
    }
}