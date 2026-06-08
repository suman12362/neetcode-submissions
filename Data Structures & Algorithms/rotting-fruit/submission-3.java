class Solution {
    public int orangesRotting(int[][] grid) {
        int ans =0;
        int h = grid.length;
        int b = grid[0].length;
        boolean[][] visit = new boolean[h][b];
        Queue<int[]> que = new LinkedList<>();
        for(int i =0; i<h;i++){
           for(int j =0; j<b;j++){
            if(grid[i][j] == 2){
            que.add(new int[]{i,j,0});
            }
          } 
        }

        
        while(!que.isEmpty()){
        int[] k = que.poll();
        System.out.println(k[0] +" and "+ k[1]);
        int x = k[0];
        int y = k[1];
        int t = k[2];
        ans = Math.max(ans,t);
            if(y-1 >=0 && grid[x][y-1] == 1 && visit[x][y-1] == false){
            visit[x][y-1] =true;
            que.add(new int[]{x,y-1,t+1});
            }

            if(y+1 < grid[0].length && grid[x][y+1] == 1 && visit[x][y+1] == false){
                visit[x][y+1] =true;
            que.add(new int[]{x,y+1,t+1});
            }

            if(x-1 >=0 && grid[x-1][y] == 1 && visit[x-1][y] == false){
                visit[x-1][y] =true;
            que.add(new int[]{x-1,y,t+1});
            }

            if(x+1 < grid.length && grid[x+1][y] == 1 && visit[x+1][y] == false){
             visit[x+1][y] =true;
            que.add(new int[]{x+1,y,t+1});
            }
       }
       for(int i =0; i<h;i++){
           for(int j =0; j<b;j++){
            System.out.println(visit[i][j] +" sss "+ grid[i][j]);
            if(visit[i][j] == false && grid[i][j] ==1) 
            return -1;
        } 
        }
      return ans;
    }
}
