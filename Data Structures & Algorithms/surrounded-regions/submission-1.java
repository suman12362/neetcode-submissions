class Solution {
    public void solve(char[][] board) {
        
        int rows = board.length;
        int cols = board[0].length; 
        boolean[][] visit = new boolean[rows][cols];
        //Queue<int[]> que = new LinkedList<>();
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(i == 0 || i == rows-1 || j == 0 || j == cols-1 ){
               //que.add(new int[]{i,j});
                dfs(board,i,j,visit,rows,cols);
                }
            }
        }
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(board[i][j] == 'O'){
                  board[i][j] = 'X';
                }
            }
        }
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(board[i][j] == '#'){
                  board[i][j] = 'O';
                }
            }
        }
    }

    public void dfs(char[][] board,int i,int j,boolean[][] visit,int rows,int cols) {
        if(i<0 || j<0 || i>=rows || j>=cols || board[i][j] == 'X' || visit[i][j])
        return;
           visit[i][j] = true;     
        board[i][j] = '#';
        dfs(board,i-1,j,visit,rows,cols);
        dfs(board,i+1,j,visit,rows,cols);
        dfs(board,i,j-1,visit,rows,cols);
        dfs(board,i,j+1,visit,rows,cols);
        
    }
}
