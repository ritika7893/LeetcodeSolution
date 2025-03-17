class Solution {
    public boolean divideArray(int[] nums) {
       HashMap<Integer,Integer> occurrence=new HashMap<>();
       
       for(int i:nums){
        occurrence.put(i,occurrence.getOrDefault(i,0)+1);
     }    
    for (Map.Entry<Integer, Integer> entry : occurrence.entrySet()) {
        if(entry.getValue()%2!=0)
        return false;
     }
     return true;
    }
}
