class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
       return solve(0,0,0,s1,s2,s3);
    }
    public boolean solve(int i, int j,int k, String s1, String s2, String s3) {
       if(s1.length() + s2.length() != s3.length()){
        return false;
       }
       if(k == s3.length()){
        return true;
       }
       boolean s11 = false;
       boolean s22 = false;
       if(i < s1.length() && s1.charAt(i) == s3.charAt(k)){
        s11 = solve(i+1,j,k+1,s1,s2,s3);
       }
       if(j < s2.length() && s2.charAt(j) == s3.charAt(k)){
        s22 =  solve(i,j+1,k+1,s1,s2,s3);
       }
       return s22 || s11;
    }
}
