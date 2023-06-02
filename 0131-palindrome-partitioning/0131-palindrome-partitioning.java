class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> li = new ArrayList<>();
        if(s.length()==0 || s.length()==1){
            li.add(s);
            ans.add(li);
            return ans;
        }
        getRes(0,s,li,ans);
        
        return ans;
    }
    
    public void getRes(int idx, String s, List<String> ds, List<List<String>> ans){
        if(idx>=s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(palindrome(s,idx,i)){
                ds.add(s.substring(idx,i+1));
                getRes(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    
    public boolean palindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}