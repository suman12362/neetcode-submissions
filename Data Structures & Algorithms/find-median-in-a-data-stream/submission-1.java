class MedianFinder {
     PriorityQueue<Integer> minpq;
     PriorityQueue<Integer> maxpq;
    public MedianFinder() {
      minpq = new PriorityQueue<>();
      maxpq = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        maxpq.add(num);
        minpq.add(maxpq.poll());
        if(minpq.size()>maxpq.size()){
            maxpq.add(minpq.poll());
        }
       // pq.add(num);
    //    int minSize = minpq.size();
    //    int maxSize = maxpq.size();
    //    if(maxSize > minSize)
    //    {
    //     if(maxpq.peek()>num && minpq.peek()<num){
    //         minpq.add(maxpq.poll());
    //         maxpq.add(num);
    //     }else if(maxpq.peek()>num && minpq.peek()>num){
    //         maxpq.add(minpq.poll());
    //         minpq.add(num);
    //     }
    //     else{
    //         minpq.add(num);
    //     }
    //    }else{
    //      maxpq.add(num);
    //    }
    }
    
    public double findMedian() {
        //double med = pq.peek();
        boolean isEven = (minpq.size() + maxpq.size()) % 2 == 0 ? true:false;
        System.out.println(maxpq.peek() +" s "+ minpq.peek());
        if(isEven){
            double med = (double)((minpq.peek() + maxpq.peek())/2.0);
        return med;
        }
        else
        return maxpq.peek();
    }
}


// double med = pq.peek();
//         int size = pq.size();
//         boolean isEven = size % 2 == 0 ? true:false;
//        int mid = size/2;
//        List<Integer> ls = new ArrayList<>();
//        int halfmid = pq.peek();
//         while(mid>0){
//             halfmid = pq.poll();
//            ls.add(halfmid);
//             mid--;
//         }
//         if(!isEven){
//             med = (double) pq.peek();
//         }else{
//             med  = (double) (halfmid + pq.peek())/2;
//         }
//         pq.addAll(ls);
//         ls.clear();
//         return med;
