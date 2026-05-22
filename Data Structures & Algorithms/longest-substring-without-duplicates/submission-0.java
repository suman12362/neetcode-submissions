class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        char[] ch = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        int max = 0;
        for(int i =0,j=0;j< ch.length;){
           if(hs.add(ch[j])){
            System.out.println("i in if " + i);
            System.out.println("j in if " + j);
            max = max < (j - i+1) ?(j - i +1):max ;
            System.out.println("max = " + max);
             j++;
           }else {
            System.out.println("i in else " + i);
            System.out.println("j in else " + j);
            hs.remove(ch[i]);
            
            i++;
          // j++;
           }
        }
        System.out.println(hs.size());
        return max;
    }
}
