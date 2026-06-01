class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] count = new int[26];
        int tot = 0;
        //for(int i =0;i<tasks.length;i++)
        for(char ch: tasks)
        count[ch -'A']++;
        PriorityQueue<Integer> pqCount = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<26;i++){
            if(count[i]>0)
            pqCount.add(count[i]);
        }
        //System.out.println(pqCount.size());
         int k =0;
         List<Integer> ls = new ArrayList<>();
        while(!pqCount.isEmpty()){

            while(k <= n && !pqCount.isEmpty()){
              //  if(!pqCount.isEmpty()){
                 int a = pqCount.poll() -1;
                 System.out.println(a);
                 if(a>0){
                    ls.add(a);
                 }
                 k++;
              //  }
            }
            //System.out.println(ls.);
            //if(!pqCount.isEmpty()){
            if(!ls.isEmpty()){
               pqCount.addAll(ls);
               ls.clear();
               tot += (n + 1);//2+
               k = 0;
            }else{
                tot +=k;
                k =0;
            }
        }
        return tot;
    }
}
