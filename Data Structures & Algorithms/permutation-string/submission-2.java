class Solution {
    public boolean checkInclusion(String s1, String s2) {

        String s1key = helper(s1);
        System.out.println(s1key);
        for(int i = 0,j = s1.length();j<=s2.length();i++,j++){
            
            String subS = s2.substring(i,j);
           // System.out.println(subS);
            String s2key = helper(subS);
            System.out.println(s2key);
            if(s1key.equals(s2key)) return true;
        }
        return false;
    }
    public String helper(String s){
        System.out.println(s);
        int charCount[] = new int[26];
        for(int i =0;i<s.length();i++){
            charCount[s.charAt(i) - 'a']++;
            //System.out.println(s.charAt(i)  - 'a');//
        }
        String skey = Arrays.toString(charCount);
        return skey;
    }
}
