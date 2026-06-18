class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        int res = climb(n,memo);
        return res;
    }
    public int climb(int n,HashMap<Integer,Integer> memo){
        if(n == 1)
        return 1;
       // memo.put(1,1);
        if(n == 2)
        return 2;
       // memo.put(2,2);

        if(memo.containsKey(n)){
        return memo.get(n);
        }
            int r = climb(n-1,memo)+climb(n-2,memo);
            memo.put(n,r);
        
        return r;
    }
}
