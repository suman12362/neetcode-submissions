class WordDictionary {

static class Node{
  Node[] child;
  boolean eow;
  Node(){
    child = new Node[26];
    eow = false;
    for(int i =0;i<26;i++){
      child[i] = null;
    }
  }
}
Node root;
    public WordDictionary() {
      root = new Node();
    }

    public void addWord(String word) {
       
       Node cur = root;
       for(int i =0;i<word.length();i++){
        int idx = word.charAt(i) -'a';
        if(cur.child[idx] == null){
          cur.child[idx] = new Node();
          //cur = cur.child[idx];
        }
        cur = cur.child[idx];
        if(i == word.length()-1){
          cur.eow = true;
        }
       }
    }

    public boolean search(String word) {
       
       Node cur = root;
       for(int i =0;i<word.length();i++){
        int idx = word.charAt(i) -'a';
        if(word.charAt(i) != '.'){
        if(cur.child[idx] == null){
          return false;
          //cur = cur.child[idx];
        }
        cur = cur.child[idx];
       }else{
        return searchfordot(root,word,0);
        // for(int i =0;i<26;i++){
        //   if(cur.child[i] !=null){
        //     cur = cur.child[idx];
        //   }
        // }
       }
       }
       return cur.eow;
    }

    public boolean searchfordot(Node cur,String word,int curchar) {
      //Node cur = root;
      if(curchar == word.length()){
          return cur.eow;
        }
     // for(int k = curchar;k<word.length();k++){
      
        if(word.charAt(curchar) == '.'){
       for(int i =0;i<26;i++){
          if(cur.child[i] !=null){
            //cur = cur.child[i];
            if(searchfordot(cur.child[i],word,curchar+1))
            return true;
          }
        }
        return false;
      }else{
        int idx = word.charAt(curchar)- 'a';
        if(cur.child[idx] != null){
        return searchfordot(cur.child[idx],word,curchar+1);
        }
        else{
          return false;
        }
      }
       // }
    //  }
   //return false;
    }
}
