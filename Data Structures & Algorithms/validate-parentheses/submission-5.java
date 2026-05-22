class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i =0;i<ch.length;i++){
           if(ch[i] == '{' || ch[i] == '(' ||ch[i] == '['){
         ss.push(ch[i]);}
         else if(ch[i] == '}' || ch[i] == ')' || ch[i] == ']'){
            if(ss.isEmpty()) return false;
             char ch2 = ss.pop();
            if(ch[i] == '}' && ch2 != '{') return false;
            else if(ch[i] == ')' && ch2 != '(') return false;
            if(ch[i] == ']' && ch2 != '[') return false;
         }
        }
        return ss.isEmpty();
    }
}
