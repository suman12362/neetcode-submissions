class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int max = 1;
        for(int[] edge : edges){
            max = Math.max(max,(Math.max(edge[0],edge[1])));
        }
        int[] par = new int[max+1];
        int[] rank = new int[max+1];
        for(int i =0;i<=max;i++){
            par[i] = i;
            rank[i] = 0;
        }

        for(int i =0;i<edges.length;i++){
            int parA = find(edges[i][0],par);
            int parB = find(edges[i][1],par);
            if(par[parB] == par[parA])
            return new int[]{edges[i][0],edges[i][1]};
            
            if(rank[parA] == rank[parB]){
                par[parB] = parA;
                rank[parA]++;
            }else if(rank[parA] < rank[parB]){
                par[parB] = parA;
            }else{
                par[parA] = parB;
            }
        }
        return new int[0];
    }
    public int find(int a,int[] par){
        if(par[a] == a)
        return a;

        return par[a] = find(par[a],par);
    }
}
