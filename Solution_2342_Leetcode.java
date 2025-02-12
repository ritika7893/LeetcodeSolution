class Solution {
    public int maximumSum(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int result=-1;
       for(int i:nums){
        int n=i;
        int rem=0;
        int digitSum=0;
        while(n>0){
         rem=n%10;
         digitSum+=rem;
         n=n/10;   
        }
       if(map.containsKey(digitSum)){
          result=Math.max(result,map.get(digitSum)+i);
          map.put(digitSum,Math.max(map.get(digitSum),i));
       }
       else{
        map.put(digitSum,i);
       }
       }
       return result;
    }
}
