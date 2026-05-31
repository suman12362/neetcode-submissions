class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        if(stones.length == 0) return 0;
        if(stones.length == 1) return stones[0];
        for(int i = 0;i<stones.length;i++){
          pq.add(stones[i]);
        }
        while(pq.size() > 1){
          //System.out.println(pq.size());
          int top = pq.poll();
          // System.out.println(top);
          int top2 = pq.poll();
          // System.out.println(top2);
          int x = Math.abs(top -top2);
      
         // int x = Math.abs(pq.poll()- pq.poll());
          // System.out.println(x);
          // System.out.println("x-------x");
          pq.add(x);
          //pq.add(Math.abs(pq.poll()- pq.poll()));
        }
        return pq.peek();
    }
}
