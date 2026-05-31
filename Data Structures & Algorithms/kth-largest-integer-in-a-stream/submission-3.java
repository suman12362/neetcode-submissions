class KthLargest {
      int kth;
     PriorityQueue<Integer> pq ;
    public KthLargest(int k, int[] nums) {
      kth = k;
       pq = new PriorityQueue<>();
       for(int n :nums){
        pq.add(n);
       }while(pq.size()>k){
        pq.poll();
       }

    }
    
    public int add(int val) {
      //   for(int n :nums){
      //   pq.add(n);
      //  }
      List<Integer>  ls = new ArrayList<>();
     // int s = pq.peek();
      pq.add(val);
      if(pq.size()>kth){
         pq.poll();
       }
      // for(int i =1;i<k;i++){
      //   ls.add(pq.poll());
      // }
      int s = pq.peek();
      // for(Integer n : ls){
      //  pq.add(n);
      // }
        
        return s;
    }
    
}
