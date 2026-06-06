class PrefixTree {
   
    static class Node{
      Node[] child;
      boolean eow;
      Node(){
        child =new  Node[26];
        eow = false;
        for(int i =0 ;i<26;i++){
          child[i] = null;
        }
      }
    }
    Node root;

    public PrefixTree() {
         root = new Node();
    }

    public void insert(String word) {
     
     Node cur = root;
     for(int i =0;i<word.length();i++){
      int idx = word.charAt(i) - 'a';
      //Node[] cur = root;
      if(cur.child[idx] == null){
        cur.child[idx] = new Node();
        // Node cur = new Node();
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
      int idx = word.charAt(i) - 'a';
      if(cur.child[idx] == null){
        return false;
      }
     cur = cur.child[idx];
     }
       return cur.eow;
    }

    public boolean startsWith(String prefix) {
      Node cur = root;
      
      for(int i =0;i<prefix.length();i++){
        int idx = prefix.charAt(i) - 'a';
        if(cur.child[idx] == null){
          return false;
        }
        cur = cur.child[idx];
      }
     return true;
    }
}
