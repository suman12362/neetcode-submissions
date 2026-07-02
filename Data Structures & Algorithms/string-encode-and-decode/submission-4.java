class Solution {
    public String encode(List<String> strs) {
        String encodeString = new String();
        for (String s : strs) {
            encodeString = encodeString + ((char) s.length()) + "_" + s;
        }
        return encodeString;
    }
    public List<String> decode(String str) {
        List<String> ls = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_') {
                int length = (int) str.charAt(i - 1);
                String s = str.substring(i + 1, i + length+1);
                //System.out.println(ch2);
                i = i + length;
                ls.add(s);
            }
        }
        return ls;
    }
}
