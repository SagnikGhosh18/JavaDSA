class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> li = new ArrayList<>();
        Arrays.sort(candidates);
        getResult(0,candidates,target,li,set);
        
        return new ArrayList<>(set);
    }
    public void getResult(int i,int[] a,int target,List<Integer> ds,Set<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int j=i;j<a.length;j++){
            if(j>i && a[j]==a[j-1])
                continue;
            if(a[j]>target)
                break;
            ds.add(a[j]);
            getResult(j+1,a,target-a[j],ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}