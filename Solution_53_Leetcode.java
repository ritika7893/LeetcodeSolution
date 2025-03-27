class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
       int maxSum = Integer.MIN_VALUE;
      int sum=0;
      if(nums.length==1){
        return nums[0];
      }
    
     for(int right=0;right<n;right++){
         if(sum<0){
            sum=0;
        }
        sum+=nums[right];
        maxSum=Math.max(maxSum,sum);
     }

        return maxSum;
    }
}
