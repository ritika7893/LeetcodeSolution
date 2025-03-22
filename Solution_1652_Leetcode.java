class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        if(k==0){
              Arrays.fill(code, 0);
        }
       int[] dep=new int[n];
       for(int l=0;l<n;l++){
            if(k>0){
                for(int i=0;i<k;i++){
                    dep[l]+=code[(l + i+1) % n];
                }
            }
             if(k<0){
                 for(int i=1;i<=Math.abs(k);i++){
                    dep[l]+=code[(l - i + n) % n];
                }
             }
         
       }
      return dep;
    }
}
