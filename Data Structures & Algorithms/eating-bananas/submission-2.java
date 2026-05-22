class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int hpp = (int)Math.ceil(h/piles.length);
        int max =0;
        for(int i = 0;i<piles.length;i++){
         if(max< piles[i]) max=piles[i];
        }
        System.out.println(max);
         
        System.out.println("ma-----------------------x");
        int i =1;
        int j= max;
        int minib = 1;
        while(i<=j){
         // int m = (i+j)/2;
          int m = i + (j - i) / 2;
          int ch = 0;
          int k =0;
          while(k < piles.length){
           ch = ch +(int)(Math.ceil((double)piles[k]/m));
           k++;
          }
          System.out.println(ch);
          //if(ch == h) return m;
           if(ch > h){
            i= m+1;
          }else{
            j=m-1;minib = m;
          }
          System.out.println(" i " + i);
          System.out.println(" j " + j);
          //minib = m;
        }
     //if(j == max) return j;
      return minib; // 4
      //11
      //2
    }
}
