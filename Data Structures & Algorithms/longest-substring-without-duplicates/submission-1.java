class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        char[] ch = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        int max = 0;
        for(int i =0,j=0;j< ch.length;){
           if(hs.add(ch[j])){
            max = max < (j - i+1) ?(j - i +1):max ;
             j++;
           }else {
            hs.remove(ch[i]);
            i++;
           }
        }
        return max;
    }
}
