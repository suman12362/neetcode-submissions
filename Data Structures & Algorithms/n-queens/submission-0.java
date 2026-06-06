class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> res = new ArrayList<>();
       String[][] board = new String[n][n];
       for(int i =0;i<n;i++){
        Arrays.fill(board[i],".");
       }
        nqueen(board,0,n,res);
        return res;
    }
    public void nqueen(String[][] board, int r,int n,List<List<String>> res){

     if(r >= n){
      // System.out.println(board);
      // System.out.println("1");
      List<String> path = new ArrayList<>();
      for(int i =0;i<n;i++){
        path.add(String.join("",board[i]));
      }
      res.add(path);
      return;
     }
      for(int j =0;j<n;j++){
        if(issafe(board,r,j,n) == true){
          // System.out.println("2");
          board[r][j] = "Q";
          nqueen(board,r+1,n,res);
          board[r][j] = ".";
        }
      }
    }
    public boolean issafe(String board[][],int r ,int c,int n){
      for(int j=0;j<n;j++){
        if(board[r][j] == "Q"){
          return false;
        }
      }
      for(int i=0;i<n;i++){
        if(board[i][c] == "Q"){
          return false;
        }
      }
      for(int i=r,j=c;i>=0 && j>=0;i--,j--){
        if(board[i][j] == "Q"){
          return false;
        }
      }
      for(int i=r,j=c;i>=0 && j<n;i--,j++){
        if(board[i][j] == "Q"){
          return false;
        }
      }
      return true;
    }
}
