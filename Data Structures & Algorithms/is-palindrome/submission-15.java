class Solution {
    public boolean isPalindrome(String s) {   
        s= s.toLowerCase();
        char[] ch = s.trim().toCharArray();
        char[] ch2 = new char[s.length()];
        int k = 0;
        for(int x= 0;x<ch.length;x++){

          if(((int)ch[x] >=97 && (int)ch[x] <=122) ||((int)ch[x] >=65 && (int)ch[x] <=90) || ((int)ch[x] >=48 && (int)ch[x] <=57) ){
            ch2[k] = ch[x];
            k++;
          }
        }
      
        for(int i = 0,j = k-1;i<=k/2-1;i++,j--){
          if(ch2[i] != ch2[j]) return false;
        }
        return true;
    }
}
