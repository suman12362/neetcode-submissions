class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        int ht = grid.length;
        int bd = grid[0].length;
        int time = 0;
        boolean visit[][] = new boolean[ht][bd];
        Queue<int[]> que = new LinkedList<>();
        for(int i=0;i<ht;i++){
            for(int j =0;j<bd;j++){
               if(grid[i][j] == 0){
                que.add(new int[]{i,j,time});
                visit[i][j] = true;
               }
            }
        }

        //bfs
        while(!que.isEmpty()){
            int[] openque = que.poll();
            int li = openque[0];
            int ri = openque[1];
            int curtime = openque[2];
            
            if(li-1>=0 && grid[li-1][ri] != -1 && !visit[li-1][ri]){
                visit[li-1][ri] = true;
                grid[li-1][ri] = curtime +1;
                que.add(new int[]{li-1,ri,curtime+1});
            }
            if(li+1 < ht && grid[li+1][ri] != -1 && !visit[li+1][ri]){
                visit[li+1][ri] = true;
                grid[li+1][ri] = curtime +1;
                que.add(new int[]{li+1,ri,curtime+1});
            }
            if(ri-1>=0 && grid[li][ri-1] != -1 && !visit[li][ri-1]){
                visit[li][ri-1] = true;
                grid[li][ri-1] = curtime +1;
                que.add(new int[]{li,ri-1,curtime+1});
            }
            if(ri+1 < bd && grid[li][ri+1] != -1 && !visit[li][ri+1]){
                visit[li][ri+1] = true;
                grid[li][ri+1] = curtime +1;
                que.add(new int[]{li,ri+1,curtime+1});
            }
        }
    }
}
