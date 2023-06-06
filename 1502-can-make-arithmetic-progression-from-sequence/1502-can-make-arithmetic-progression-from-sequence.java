class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            double mid = (arr[i-1]+arr[i+1])/2.0;
            double var = arr[i];
            // System.out.println(mid+" "+var);
            if(mid!=var)
                return false;
        }
        return true;
    }
}