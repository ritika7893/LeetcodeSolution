class Solution {
    public int maximumCount(int[] nums) {
        int negSum=0;
         int posSum=0;
         int maxSum=0;
      for(int i:nums){
        if(i<0){
            negSum++;
      }  
      if(i>0){
            posSum++;
      } 
     maxSum=Math.max(negSum,posSum);
      }
      return maxSum; 
    }
}
