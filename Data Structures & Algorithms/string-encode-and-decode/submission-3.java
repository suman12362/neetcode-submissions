class Solution {

    public String encode(List<String> strs) {
      String encodeString = new String();
      for(String s : strs)
      {
       
      encodeString = encodeString + ((char)s.length()) + "_"  + s;
      }
        System.out.println(encodeString);
   
      return encodeString;
    }

    public List<String> decode(String str) {

   char[] ch = str.toCharArray();
 List<String> ls =new ArrayList<String>();
for(int i = 0;i<str.length();i++){
 
  System.out.println(ch[i]);
  if(ch[i] == '_'){
   int length = (int)str.charAt(i-1);
    //int length = str.charAt(i-1) - '0';
    System.out.println(length);
    char[] ch2 = new char[length];
    int k =0;
    for(int j = i+1; j< length +i+1; j++){
      ch2[k] = str.charAt(j);
      k++;
    }
    System.out.println(ch2);
    i = i+length;
  ls.add(String.valueOf(ch2));

  }
}
return ls;

    }
}
