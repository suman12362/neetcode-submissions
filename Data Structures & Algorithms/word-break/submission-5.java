class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

       Boolean[] memo = new Boolean[s.length()+1];
        return solve(0,s,wordDict,memo);

    }
    public boolean solve(int idx,String s, List<String> wordDict,Boolean[] memo) {
      if(idx == s.length()){
        return true;
      }
      if(wordDict.contains(s)){
        return true;
      }
      if(memo[idx] != null){
          return memo[idx] ;
      }

      for(int i = idx+1;i<=s.length();i++){
        String str = s.substring(idx,i);
        //memo.put(str,str);
        // System.out.println(str);
        if(wordDict.contains(str) && solve(i,s,wordDict,memo)){
            return memo[idx] = true;
        }
      }
      return memo[idx] = false;
    }
}
