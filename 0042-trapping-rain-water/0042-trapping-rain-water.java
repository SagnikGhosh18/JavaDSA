class Solution {
    public int trap(int[] arr) {
        int n=arr.length, res=0;
        
        for(int i=0;i<n;i++){
            int j=i;
            int left=0,right=0;
            while(j>=0){
                left = (int)Math.max(left,arr[j]);
                j--;
            }
            j=i;
            while(j<n){
                right = (int)Math.max(right,arr[j]);
                j++;
            }
            
            res+= Math.min(left,right) - arr[i];
        }
        return res;
    }
}