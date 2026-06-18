class Solution {
    public boolean validTree(int n, int[][] edges) {
         
         List<Integer>[] graph = new ArrayList[n];
         boolean[] visit = new boolean[n];
         int count = 0;
         for(int i =0;i<n;i++){
            graph[i] = new ArrayList();
         }
         for(int i =0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
            graph[v].add(u);
         }
         for(int i = 0;i<n;i++){
            if(!visit[i]){
                
                if(dfs(i,graph,visit,-1))
                return false;
                count++;
            }
         }
         if(count > 1)
         return false;
         System.out.println(Arrays.toString(graph));
         return true;
    }

    public boolean dfs(int src,List<Integer>[] graph,boolean[] visit,int par){


        visit[src] = true;
        for(int n :graph[src]){
            if(!visit[n] ){
                if(dfs(n,graph,visit,src))
                return true;
            }
            else if(par != n){
                return true;
            }
        }
        return false;
    }
}
