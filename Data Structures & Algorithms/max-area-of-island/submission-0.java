class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean visit[][] = new boolean[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] ==1 && visit[i][j] == false){
                    int cur = dfs(grid,visit,i,j);
                    max = Math.max(max,cur);
                   // max++;
                }
            }
        }
        return max;
    }
    public int  dfs(int[][] grid,boolean visit[][],int i, int j) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0 || visit[i][j] == true){
        return 0;
        }

        visit[i][j] = true;
        int max = 1;
        max += dfs(grid,visit,i-1,j);
        max += dfs(grid,visit,i+1,j);
        max += dfs(grid,visit,i,j-1);
        max += dfs(grid,visit,i,j+1);
        //max++;
        return max;
    }
}
