class Solution {
    public int countComponents(int n, int[][] edges) {

        List<Integer>[] graph = new ArrayList[n];
        boolean[] visit = new boolean[n];
        int c =0;
        for(int i =0;i<n;i++){
            graph[i] = new ArrayList();
        }
        for(int i =0;i<edges.length;i++){
           int u = edges[i][0];
           int v = edges[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }
        for(int i =0;i<n;i++){
            if(!visit[i]){
            dfs(i,graph,visit);
            c++;
            }
        }
        return c;
    }
    public void dfs(int src,List<Integer>[] graph,boolean[] visit){
        visit[src] = true;
        for(int n : graph[src]){
            if(!visit[n]){
              dfs(n,graph,visit);
            }
        }
    }
}
