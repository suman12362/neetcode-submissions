class Solution {
    public String longestPalindrome(String s) {
        
        String res = "";
        int max = 0;
        int l = s.length();
        int startindex = 0;
        //HashMap<String,String> hs = new HashMap<>();
        boolean[][] palinmat = new boolean[l][l];
        for(int i =0;i<l;i++){
            palinmat[i][i] = true;
            max = 1;
        }
        for(int L = 2;L<=l;L++){
            for(int i =0;i<l-L+1;i++){
                int j = i+L-1;
                if(L == 2 && s.charAt(i) == s.charAt(j)){
                   palinmat[i][j] = true;
                   max = 2;
                  startindex = i;
                }
                else if(s.charAt(i) == s.charAt(j) && palinmat[i+1][j-1]){
                  palinmat[i][j] = true;
                  max = Math.max(max,j-i+1);
                startindex = i;
                }
                else{
                    palinmat[i][j] = false;
                }
             }  
        }
    return s.substring(startindex,startindex+max);
    }
  
}
