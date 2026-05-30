class Solution {
    public String minWindow(String s, String t) {
       // System .out.println(s);
        //   s= s.toLowerCase();
        //   t= t.toLowerCase();
        int[] maps = new int[58];
        int[] mapt = new int[58];
        String outs = "";
         int minLen = Integer.MAX_VALUE;
        for(char ch : t.toCharArray()){
            mapt[ch -'A']++;
        }
        // for(int a : mapt){
        //     System .out.println(a);
        // }
        char[] chs = s.toCharArray();
        for(int i =0,j=0;j<chs.length;){
            maps[chs[j] -'A']++;
            // if(check(mapt,maps) == false){
            //     j++;
            // }
             while(check(mapt,maps) == true){
                String s2 = String.valueOf(chs,i,(j - i + 1));
                if(s2.length() < minLen){
                outs = s2;
                minLen = s2.length();
                }
                maps[chs[i] - 'A']--;
                i++;
            }
            j++;
        }

        return outs;
    }
    public boolean check(int[] mapt, int[] maps) {
        for(int i =0;i<58;i++){
            if(mapt[i] > maps[i] )
            return false;
        }
      return true;
    }
}
