//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    
    ArrayList<Integer> li = new ArrayList<>();
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> l1 = new ArrayList<>();
        subsets(l1, 0, arr);
        
        Collections.sort(li);
        return li;
    }
    
    void subsets(ArrayList<Integer> subset,int i, ArrayList<Integer> arr){
        if(i==arr.size()){
            int sum=0;
            for(int j=0;j<subset.size();j++)
                sum+=subset.get(j);
            // System.out.println(sum);
            li.add(sum);
            return;
        }
        subset.add(arr.get(i));
        subsets(subset,i+1,arr);
        subset.remove(subset.size()-1);
        subsets(subset,i+1,arr);
    }
}