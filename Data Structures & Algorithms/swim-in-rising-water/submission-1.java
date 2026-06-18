class Solution {
    public int swimInWater(int[][] grid) {
        PriorityQueue<int[]> que = new PriorityQueue<int[]>((a,b) -> Integer.compare(a[0],b[0]));
        int r = grid.length;
        int c = grid[0].length;
        int[][] res = new int[r][c];
        for(int i =0;i<r;i++){
          Arrays.fill(res[i],Integer.MAX_VALUE);
          //Arrays.fill(res[i],0);
        }
        que.add(new int[]{grid[0][0],0,0});
        res[0][0] = grid[0][0];
        while(!que.isEmpty()){
          int[] poped = que.poll();
          int wtsrc = poped[0];
          int i = poped[1];
          int j = poped[2];
          if(i == r-1 && j == c-1){
            return wtsrc;
          }
          if(i-1 >=0 && Math.max(grid[i-1][j], wtsrc) < res[i-1][j]){
            // res[i-1][j] = grid[i-1][j] + wtsrc ;

            // que.add(new int[]{grid[i-1][j],i-1,j});
            res[i-1][j] = Math.max(grid[i-1][j], wtsrc);
                que.add(new int[]{res[i-1][j],i-1,j});
          }
          if(j-1 >=0 && Math.max(grid[i][j-1], wtsrc) < res[i][j-1]){
            // res[i][j-1] = grid[i][j-1] + wtsrc ;
            // que.add(new int[]{grid[i][j-1],i,j-1});
            res[i][j-1] = Math.max(grid[i][j-1], wtsrc);
                que.add(new int[]{res[i][j-1],i,j-1});
          }
          if(i+1 < r&& Math.max(grid[i+1][j], wtsrc) < res[i+1][j]){
            // res[i+1][j] = grid[i+1][j];
            // que.add(new int[]{grid[i+1][j],i+1,j});
            res[i+1][j] = Math.max(grid[i+1][j], wtsrc);
                que.add(new int[]{res[i+1][j],i+1,j});
          }
          if(j+1 < c && Math.max(grid[i][j+1], wtsrc) < res[i][j+1]){
            // res[i][j+1] = grid[i][j+1];
            // que.add(new int[]{grid[i][j+1],i,j+1});
            res[i][j+1] = Math.max(grid[i][j+1], wtsrc);
                que.add(new int[]{res[i][j+1],i,j+1});
          }
        }
        for(int i =0;i<r;i++){
        //  for(int j =0;j<r;j++)
          System.out.println(Arrays.toString(res[i]));
      //  }
    }
         // System.out.println(Arrays.toString(res));
          return 0;
    }
}
