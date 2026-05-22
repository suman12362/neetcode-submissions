class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> sum = new Stack<>();
        for(String s :tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/"))
            sum.push(s);
            else{
                if(sum.isEmpty()) return 0;
                int popl = Integer.parseInt(sum.pop());
                if(sum.isEmpty()) return 0;
                int popf = Integer.parseInt(sum.pop());
                int hr =0;
                if(s.equals("+"))
                 hr = popf + popl;
                else if(s.equals("-"))
                 hr = popf - popl;
                else if(s.equals("*"))
                 hr = popf * popl;
                else if(s.equals("/"))
                 hr = popf / popl;
                 
               sum.push(String.valueOf(hr));
            }
        }
        if(!sum.isEmpty())
        return Integer.parseInt(sum.peek());
        else 
        return 0;
    }
}
