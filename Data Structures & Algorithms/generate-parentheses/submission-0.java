class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String str = "";
        backTrack(res,str, n,0,0);
        return res;
    }
    public void backTrack(List<String> res,String str, int n,int op,int cl){
        if(op >= n && cl>= n){
            res.add(str);
            return;
        }
        if(op<n){
            backTrack(res,str +"(", n,op+1,cl);
        }
        if(cl<op){
            backTrack(res,str +")", n,op,cl+1);
        }
        // str = str.concat("(");
        // //str.concat("(");
        // backTrack(res,str, n,op+1,0);
        // str = str.substring(0, str.length() - 2);
        // backTrack(res,str, n,op+1,0);
    }
}
 