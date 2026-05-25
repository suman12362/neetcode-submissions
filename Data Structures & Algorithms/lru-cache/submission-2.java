class LRUCache {

       LinkedHashMap<Integer,Integer> hm;
       int maxCapacity;
    public LRUCache(int capacity) {
        hm = new LinkedHashMap<>(capacity,0.75f,true);
        maxCapacity = capacity;
    }
    
    public int get(int key) {
       // hm.get
        //hm.get(key);
        return hm.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
       // Map.Entry<Integer,Integer>
      
       if(hm.size() >= maxCapacity && !hm.containsKey(key)){
        int firstLRU = hm.keySet().iterator().next();
         System.out.println(firstLRU);
        hm.remove(firstLRU);
        }
        //int a = Integer.parseInt(firstLRU);
       // hm.remove(firstLRU);
        hm.put(key,value);
    }
}
