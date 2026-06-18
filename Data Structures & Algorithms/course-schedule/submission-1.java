class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
       // int rows = prerequisites.length;
        //int cols = prerequisites[0].length;
        boolean[] visit = new boolean[numCourses];
        boolean[] recurr = new boolean[numCourses];
        boolean b = false;
        for(int i =0;i<numCourses;i++){
            if(!visit[i])
              if(dfsHasCycle(i,prerequisites,visit,recurr))
              return false;
        }
        return true;
    }

    public boolean dfsHasCycle(int src, int[][] prerequisites,boolean[] visit,boolean[] recurr){
       
        visit[src] = true;
        recurr[src] = true;

        for(int i = 0;i<prerequisites.length;i++){
            int v = prerequisites[i][0];
            int u = prerequisites[i][1];
            if(u == src){
            if(!visit[v]){
              if(dfsHasCycle(v,prerequisites,visit,recurr))
              return true;
            }else if(recurr[v]){
               return true;
            }
        }
        }
        recurr[src] = false;
        return false;
    }
}
