class Solution {
    public int maxAbsoluteSum(int[] nums) {
    
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int currMax=0,currMin=0;
        
        for(int i:nums){
           currMax+=i;
           currMin+=i;
           maxSum=Math.max(maxSum,currMax);
            minSum=Math.min(minSum,currMin);
            if(currMax<0){
                currMax=0;
            }
            if(currMin>0){
                currMin=0;
            }

        }
           
       return Math.max(maxSum,Math.abs(minSum));
}
}
