class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
       // boolean[][] visit = new boolean[][];
        HashSet<List<Integer>> pacificSet = new HashSet<>();
        HashSet<List<Integer>> atlanticSet = new HashSet<>();
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] visit = new boolean[rows][cols];
        Queue<int[]> que = new LinkedList<>();
        //Queue<int[]> que2 = new LinkedList<>();
        for(int i =0;i<rows;i++){
           for(int j =0;j<cols;j++){
            if(i == 0 || j ==0){
               que.add(new int[]{i,j});
               pacificSet.add(List.of(i,j));
               visit[i][j] = true;
            }
          } 
        }
        bfs(heights,que,visit,pacificSet,rows,cols);
        for (boolean[] row : visit) {
           Arrays.fill(row, false);
           }
        for(int i =0;i<rows;i++){
           for(int j =0;j<cols;j++){
            if(i == rows-1 || j == cols-1){
                que.add(new int[]{i,j});
                atlanticSet.add(List.of(i,j));
                visit[i][j] = true;
            }
          } 
        }
        bfs(heights,que,visit,atlanticSet,rows,cols);
        //System.out.println(atlanticSet);
        atlanticSet.retainAll(pacificSet);
        //System.out.println(atlanticSet);
        return new ArrayList<>(atlanticSet);
    }

    public void bfs(int[][] heights,Queue<int[]> que,boolean[][] visit,HashSet<List<Integer>>  atlanticSet,int rows,int cols) {
          
          while(!que.isEmpty()){
            int[] insideQue = que.poll();
            int i = insideQue[0];
            int j = insideQue[1];

            if(i-1 >=0 && !visit[i-1][j] && heights[i-1][j] >= heights[i][j]){
                visit[i-1][j] = true;
                que.add(new int[]{i-1,j});
                 atlanticSet.add(List.of(i-1,j));
            }
            if(i+1 < rows && !visit[i+1][j] && heights[i+1][j] >= heights[i][j]){
                visit[i+1][j] = true;
                que.add(new int[]{i+1,j});
                 atlanticSet.add(List.of(i+1,j));
            }
            if(j-1 >=0 && !visit[i][j-1] && heights[i][j-1] >= heights[i][j]){
                visit[i][j-1] = true;
                que.add(new int[]{i,j-1});
                 atlanticSet.add(List.of(i,j-1));
            }
            if(j+1 < cols && !visit[i][j+1] && heights[i][j+1] >= heights[i][j]){
                visit[i][j+1] = true;
                 que.add(new int[]{i,j+1});
                 atlanticSet.add(List.of(i,j+1));
            }
          }

    }
}
