class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int maxLength=0;
        for(int i=0;i<n;i++){
            int bitmask=0;
            for(int j=i;j<n;j++){
                if((bitmask & nums[j])!=0){
                    break;
                }
                bitmask=bitmask|nums[j];
                maxLength=Math.max(maxLength,j-i+1);
            }
        }
        return maxLength;
    }
}
