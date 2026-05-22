class Solution {
    public boolean isPalindrome(String s) {

        System.out.println(s.replaceAll(" ",""));
        s= s.replaceAll(" ","");
        s = s.replaceAll("\\?", "");
        s= s.toLowerCase();
        System.out.println(s);
        char[] ch = s.trim().toCharArray();
        //System.out.prtintln(s.replaceAll(" ",""));
        char[] ch2 = new char[s.length()];
        int k = 0;
        for(int x= 0;x<ch.length;x++){
          //System.out.println((int)ch[i]);
          if(((int)ch[x] >=97 && (int)ch[x] <=122) ||((int)ch[x] >=65 && (int)ch[x] <=90) || ((int)ch[x] >=48 && (int)ch[x] <=57) ){
            ch2[k] = ch[x];
            k++;
          }
        }
        System.out.println((String.valueOf(ch2)).trim());
       // System.out.println((String.valueOf(ch2)).replaceAll(" ",""));
        System.out.println((String.valueOf(ch2)).length());
        System.out.println(k);
        System.out.println(ch2);
        for(int i = 0,j = k-1;i<=k/2-1;i++,j--){
          System.out.println(i + " and " + j);
          //System.out.println(ch2[i] + " with " + ch2[19]);
          if(ch2[i] != ch2[j]) return false;
        }
        return true;
    }
}
