class Solution {
    public boolean exist(char[][] board, String word) {
        int l = board.length;
        int b = board[0].length;
        //System.out.println(l +"jn"+ b);
        boolean bol = false;
        int k =0;
        for(int i = 0;i<board.length;i++){
          for(int j = 0;j<board[0].length;j++){
            if(word.charAt(k) == board[i][j]){
                //if(bol == true)
                //System.out.println("jam");
                if(backTrack(board,word,k,i,j))
                return true;
             // bol = backTrack(board,word,k,i,j);
             }
        }
        }
        return bol;
    }

    public boolean backTrack(char[][] board,String word,int k,int i,int j){
        if(k == word.length() -1){
            //bol = true;
            System.out.println("found");
            return true;
        }
        char orginalChar = board[i][j];
             board[i][j] ='#';
             if(j-1 >= 0 && word.charAt(k+1) == board[i][j-1]){
            System.out.println("in first");
            //backTrack(board,word,k+1,i,j-1,bol);
             if(backTrack(board,word,k+1,i,j-1))
            return true;
           }
            if(j+1 < board[0].length && word.charAt(k+1) == board[i][j+1]){
                System.out.println("in second");
               // backTrack(board,word,k+1,i,j+1,bol);
               if(backTrack(board,word,k+1,i,j+1))
            return true;
            }
             if(i-1 >= 0 && word.charAt(k+1) == board[i-1][j]){
                System.out.println("in third");
                //backTrack(board,word,k+1,i-1,j,bol);
               if(backTrack(board,word,k+1,i-1,j))
            return true;
             }
              if(i+1 < board.length && word.charAt(k+1) == board[i+1][j]){
                System.out.println("in fourth");
                System.out.println("i " +(i +1) + " j " + j+" k " +(k+1));
               // backTrack(board,word,k+1,i+1,j,bol);
               if(backTrack(board,word,k+1,i+1,j))
            return true;
           }
           board[i][j] = orginalChar;
           return false;
    }
    
}



// public boolean backTrack(char[][] board,String word,int k,int sr,int sc){

    // for(int i = sr;i<board.length;i++){
    //   int startCol = (i == sr) ? sc : 0; 
    //     for(int j = startCol;j<board[0].length;j++){
    //      if(word.charAt(k) == board[i][j]){
    //         System.out.println(i +" sum "+j);
    //         System.out.println(board[i][j]);
    //         if(k == word.length() -1){
    //         System.out.println("found");
    //         return true;
    //     }
    //         char orginalChar = board[i][j];
    //         board[i][j] ='#';
    //        if(j-1 >= 0 && word.charAt(k+1) == board[i][j-1]){
    //         System.out.println("in first");
    //          if(backTrack(board,word,k+1,i,j-1))
    //          return true;
    //        }
    //         if(j+1 < board[0].length && word.charAt(k+1) == board[i][j+1]){
    //             System.out.println("in second");
    //            if(backTrack(board,word,k+1,i,j+1))
    //          return true;
    //         }
    //          if(i-1 >= 0 && word.charAt(k+1) == board[i-1][j]){
    //             System.out.println("in third");
    //            if(backTrack(board,word,k+1,i-1,j))
    //          return true;
    //          }
    //           if(i+1 < board.length && word.charAt(k+1) == board[i+1][j]){
    //             System.out.println("in fourth");
    //             System.out.println("i " +(i +1) + " j " + j+" k " +(k+1));
    //            if(backTrack(board,word,k+1,i+1,j))
    //          return true;
    //        }
    //        board[i][j] = orginalChar;
    //      }
    //     }
    // }
    // return false;
    // }
