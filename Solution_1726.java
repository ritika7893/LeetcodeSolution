class Solution {
    public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        int result=0;
        HashMap<Integer,Integer> productCount=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int product=nums[i]*nums[j];
                productCount.put(product,productCount.getOrDefault(product,0)+1);
            }
        }
        for(int count:productCount.values()){
            if(count>1){
                result+=count*(count-1)/2*8;
            }
        }
        return result;
    }
}
