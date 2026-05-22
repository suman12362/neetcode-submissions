class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        /*
        for(int i=0;i<9;i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j=0;j<9;j++){
                int ascval = (int) board[i][j];
               if(ascval > 49 && ascval < 57 && !hs.add(board[i][j])){
                  return false;
               }
            }
        }
       
        for(int j=0;j<9;j++){
            HashSet<Character> hs = new HashSet<>();
            for(int i=0;i<9;i++){
                int ascval = (int) board[i][j];
               if(ascval > 49 && ascval < 57 && !hs.add(board[i][j])){
                  return false;
               }
            }
        }
        
        for(int x = 0;x< 9;x+=3){
        HashSet<Character> hs = new HashSet<>();
        for(int i=x;i<3+x;i++){
            
            for(int j=x;j<3+x;j++){
                int ascval = (int) board[i][j];
               if(ascval > 48 && ascval <= 57 && !hs.add(board[i][j])){
                  return false;
               }
            }
        }
    
       }
        */
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<9;i++){
           // HashSet<Character> hs = new HashSet<>();
            for(int j=0;j<9;j++){
                
               if(board[i][j] == '.'){
                continue;}
               String rkey = board[i][j] + " found at row " + i;
               String ckey = board[i][j] + " found at col " + j;
               String bkey = board[i][j] + " found at box " + (i/3) +"-"+ (j/3);
               if(!hs.add(rkey) || !hs.add(ckey) || !hs.add(bkey)){
               return false;}
            }
        }
        return true;
    }
}
