class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        HashSet<String> hs = new HashSet<>();
        hs.addAll(wordList);
        if(!hs.contains(endWord))
        return 0;

       Queue<String[]> que = new LinkedList<>();
       que.add(new String[]{beginWord,"1"});
        hs.remove(beginWord); 
       while(!que.isEmpty()){
           String[] opened = que.poll();
           String curword = opened[0];
           int val = Integer.parseInt(opened[1]);
          if (curword.equals(endWord))
          return val;
          for(int i =0;i<curword.length();i++){
            List<String> lsword = getString(curword,curword.charAt(i) - 'a',i);
            for(String u : lsword){
            if(hs.contains(u)){
                que.add(new String[]{u,String.valueOf(val+1)});
                hs.remove(u);
            }
          }
          }
       }
       return 0;
    }

    public List<String> getString(String curword,int val,int index){

            List<String> ls = new ArrayList<>();
        for(int i =0;i<26;i++){
            char[] ch = curword.toCharArray();
            if(i != val)
            ch[index] = (char) (i + 'a');
            String u = new String(ch);
            ls.add(u);
          }
          return ls;
    }
}
