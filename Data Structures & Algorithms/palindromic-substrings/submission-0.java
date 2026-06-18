class Solution {
    public int countSubstrings(String s) {
        
        int sLength = s.length();
        int max =0;
        boolean[][] pal = new boolean[sLength][sLength];

        for(int i =0;i<sLength;i++){
            pal[i][i] = true;
            max =1;
        }

        for(int L =2;L<=sLength;L++){
            for(int i =0;i<sLength-L+1;i++){
                int j = i +L-1;
                 
                 if(L == 2 && s.charAt(i) == s.charAt(j)){
                    pal[i][j] = true;
                    max = 2;
                 }else if(s.charAt(i) == s.charAt(j) && pal[i+1][j-1]){
                    pal[i][j] = true;
                    max = j-i+1;
                 }else{
                    pal[i][j] = false;
                 }
            }
        }
        int c =0;
        for(int i =0;i<sLength;i++){
            for(int j =0;j<sLength;j++){
              if(pal[i][j] == true)
              c++;
            }
        }
        return c;
    }
}
