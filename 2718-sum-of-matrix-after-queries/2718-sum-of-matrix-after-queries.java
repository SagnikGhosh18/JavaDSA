class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        boolean rowSeen[] = new boolean[n];
        boolean colSeen[] = new boolean[n];
        int row=0, col=0;
        long sum=0;
        for(int i=queries.length-1;i>=0;i--){
            switch(queries[i][0]){
                case 0: if(!rowSeen[queries[i][1]]){
                            rowSeen[queries[i][1]] = true;
                            row++;
                            sum = sum + (n-col)*queries[i][2];
                        }
                        break;
                case 1: if(!colSeen[queries[i][1]]){
                            colSeen[queries[i][1]] = true;
                            col++;
                            sum = sum + (n-row)*queries[i][2];
                        }
                        break;
            }
        }
        return sum;
    }
}