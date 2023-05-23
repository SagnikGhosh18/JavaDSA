class Solution {
    public int uniquePaths(int m, int n) {
        int[][] a = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++)
                a[i][j]=-1;
        }
        return getSolution(0,0,m,n,a);
    }
    public int getSolution(int x,int y,int m,int n,int[][] a){
        if(x==m-1 && y==n-1)
            return 1;
        if(x>=m || y>=n){
            return 0;
        }
        if(a[x][y]!=-1)
            return a[x][y];
        return a[x][y] = getSolution(x+1,y,m,n,a)+getSolution(x,y+1,m,n,a);
        
    }
}