class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> mymap = new HashMap<>();
        for(int i = 0; i< strs.length; i++)
        {
          int[] charcount = new int[26];
          for(int j = 0; j< strs[i].length();j++)
          {
            charcount[strs[i].charAt(j)- 'a']++;
          }
          String key = Arrays.toString(charcount);
         mymap.putIfAbsent(key, new ArrayList<>());
            mymap.get(key).add(strs[i]);
        }
       /* List<List<String>> ls = new ArrayList<>();
        for(String key : mymap.keySet())
        {
          List<String> sublist =  mymap.get(key);
          ls.add(sublist);
        }*/
        //List<List<String>> ls = new ArrayList<>(mymap.values());
        return new ArrayList<>(mymap.values());
    }
}
