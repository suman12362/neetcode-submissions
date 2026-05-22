class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
        int k = numbers.length;
        for(int i = 0;i<k-1;i++){
            for(int j =i+1;j<k;j++){
              if(numbers[i] + numbers[j] > target){
                k = j;
                break;
              }
              else if(numbers[i] + numbers[j] == target){
                int[] arr = {i+1,j+1};
                return arr;
              }
            }
        }*/
        int i= 0;
        int j= numbers.length-1;
        while(!(numbers[i] + numbers[j] == target)){
         if(numbers[i] + numbers[j] > target){
           j--;
           System.out.println("j" +j);
         }
         if(numbers[i] + numbers[j] < target){
          i++;
          System.out.println("i" +i);
         }
        }
        int[] arr = {i+1,j+1};
        return arr;
    }
}
