class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backTrack(res,path,s,0);
        System.out.println(res);
        return res; 
    }
    public void backTrack(List<List<String>> res,List<String> path,String s,int st){
     if(st >= s.length()){
        res.add(new ArrayList<>(path));
        return;
     }
     for(int i = st;i<s.length();i++){
     if(isPalin(s,st,i)){
     path.add(s.substring(st,i+1));
     backTrack(res,path,s,i+1);
     path.remove(path.size() - 1);
    }}
    }
    public boolean isPalin(String s,int i,int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j))
            return false;
            i++;j--;
        }
           return true;
    }

}
