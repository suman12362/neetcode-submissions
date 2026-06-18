class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        

        boolean[] visit = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];
        Stack<Integer> courses = new Stack<>();
        int[] res = new int[numCourses];
        for(int i =0;i<numCourses;i++){
           if(!visit[i]){
            if(dfs(i,prerequisites,visit,courses,rec)){
            return new int[0];
            }
           }
        }
        System.out.println(courses);
        int i =0;
        while(!courses.isEmpty()){
            res[i] = courses.pop();
            i++;
        }
        return res;
    }
    public boolean dfs(int src,int[][] prerequisites,boolean[] visit,Stack<Integer> courses,boolean[] rec){
         visit[src] = true;
         rec[src] = true;
         for(int i =0;i<prerequisites.length;i++){
            int v = prerequisites[i][0];
            int u = prerequisites[i][1];
            if(u == src){
            if(!visit[v]){
               if(dfs(v,prerequisites,visit,courses,rec)){
               return true;
               }
            }
            else if(rec[v]){
               return true;
            }
         }
         }
         courses.add(src);
         rec[src] = false;
         return false;
    }
}
