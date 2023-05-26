//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> li = new ArrayList<>();
        int p1=0,p2=0,p3=0;
        Set<Integer> li1 = new HashSet<>();
        Set<Integer> li2 = new HashSet<>();
        while(p1<n1 && p2<n2){
            if(A[p1]<B[p2])
                p1++;
            else if(B[p2]<A[p1])
                p2++;
            else{
                li1.add(A[p1]);
                p1++;
                p2++;
            }
        }
        ArrayList<Integer> li3 = new ArrayList<>(li1);
        int p4=0;
        Collections.sort(li3);
        while(p3<n3 && p4<li3.size()){
            if(C[p3]<li3.get(p4))
                p3++;
            else if(li3.get(p4)<C[p3])
                p4++;
            else{
                li2.add(C[p3]);
                p3++;
                p4++;
            }
        }
        
        li = new ArrayList<>(li2);
        Collections.sort(li);
        return li;
    }
}