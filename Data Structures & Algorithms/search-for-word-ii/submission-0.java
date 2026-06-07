class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        
        //boolean b = wordSearch(board,words[1],0,0,0);
        List<String> res = new ArrayList<>();
        for(int i =0;i<words.length;i++){
        boolean b = findWord(board,words[i]);
          System.out.println(b);
        if(b == true){
         res.add(words[i]);
        }
        }
        // boolean b = findWord(board,words[3]);
        //   System.out.println(b);
       // System.out.println(b);
        return res;
    }
    public boolean findWord(char[][] board, String word) {
      for(int i =0;i<board.length;i++){
        for(int j =0;j<board[0].length;j++){
         // char ch = word.charAt(k); 
          if(board[i][j] == word.charAt(0)){
            if(wordSearch(board,word,0,i,j))
                return true;
          }
        }
        }
     return false;
    }
    public boolean wordSearch(char[][] board, String word,int k,int i,int j) {
     
      if(k == word.length()-1){
          return true;
      }
      // for(int i =l;i<board.length;i++){
      //   for(int j =r;j<board[0].length;j++){
          char ch = word.charAt(k);
          
         // if(board[i][j] == word.charAt(k)){
            board[i][j] ='#';
            if((i-1)>=0 && board[i-1][j] == word.charAt(k+1)){
              if(wordSearch(board,word,k+1,i-1,j)){
                board[i][j] = ch;
              return true;}
            }
            if(i < board.length -1 && board[i+1][j] == word.charAt(k+1)){
              if(wordSearch(board,word,k+1,i+1,j)){
                board[i][j] = ch;
              return true;
              }
            }
            if(j-1 >=0 && board[i][j-1] == word.charAt(k+1)){
              if(wordSearch(board,word,k+1,i,j-1)){
                board[i][j] = ch;
              return true;}
            }
            if(j < board[0].length-1 && board[i][j+1] == word.charAt(k+1)){
              if(wordSearch(board,word,k+1,i,j+1)){
                board[i][j] = ch;
              return true;
              }
            }
         // }
          board[i][j] = ch;
     // }
   // }
    return false;
    }
}
