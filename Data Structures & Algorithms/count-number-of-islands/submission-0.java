class Solution {
    
    public int numIslands(char[][] grid) {
        int count =0;
        boolean visit[][] = new boolean[grid.length][grid[0].length];
        //  for(int i =0;i<grid.length;i++){
        //     Arrays.fill(visit[i],false);
        //  }
         for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] == '1' && visit[i][j] == false){
                dfs(grid,visit,i,j);
                count++;
                }
            }
         }
        return count;
    }
    public void dfs(char[][] grid,boolean visit[][],int i, int j) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visit[i][j] == true|| grid[i][j] == '0')
        return;
      
      visit[i][j] = true;
      //count++;
      dfs(grid,visit,i-1,j);
      dfs(grid,visit,i+1,j);
      dfs(grid,visit,i,j-1);
      dfs(grid,visit,i,j+1);
      
    }
}
