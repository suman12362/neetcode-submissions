class MedianFinder {
     PriorityQueue<Integer> pq;
    public MedianFinder() {
      pq = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        pq.add(num);
    }
    
    public double findMedian() {
        double med = pq.peek();
        int size = pq.size();
        boolean isEven = size % 2 == 0 ? true:false;
       int mid = size/2;
       List<Integer> ls = new ArrayList<>();
       int halfmid = pq.peek();
        while(mid>0){
            halfmid = pq.poll();
           ls.add(halfmid);
            mid--;
        }
        if(!isEven){
            med = (double) pq.peek();
        }else{
            med  = (double) (halfmid + pq.peek())/2;
        }
        pq.addAll(ls);
        ls.clear();
        return med;
    }
}
